package com.cuiyun.ddc.auth.util.jwt;

import java.io.Serializable;

public class JWTInfo implements Serializable,IJWTInfo {
    private String account;
    private String userId;
    private String name;

    public JWTInfo(String account, String userId, String name) {
        this.account = account;
        this.userId = userId;
        this.name = name;
    }

    @Override
    public String getUniqueName() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String getId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        JWTInfo jwtInfo = (JWTInfo) o;

        if (account != null ? !account.equals(jwtInfo.account) : jwtInfo.account != null) {
            return false;
        }
        return userId != null ? userId.equals(jwtInfo.userId) : jwtInfo.userId == null;

    }

    @Override
    public int hashCode() {
        int result = account != null ? account.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        return result;
    }
}
