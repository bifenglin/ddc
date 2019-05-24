package com.cuiyun.ddc.rest.exception;


import com.cuiyun.ddc.common.exception.ServiceExceptionEnum;

/**
 * @program: kfcoding-cloud
 * @description: 异常枚举
 * @author: maple
 * @create: 2018-08-02 16:31
 **/
public enum BizExceptionEnum implements ServiceExceptionEnum {
    /**
     * user模块异常
     */
    USER_NULL(20001, "用户不存在"),
    USER_NULL_OR_PWERROR(20001, "用户不存在或密码错误"),
    USER_PWERROR(20001, "密码错误"),
    USER_EXIST(20001, "用户账号已存在"),
    USER_INSERT(20001, "用户添加失败"),
    USER_EMAIL_NULL(20002, "用户邮箱不存在"),
    USER_EMAIL_VALIDATE(20002, "用户邮箱格式不正确"),
    USER_SEND_EMAIL_FAIL(20002, "邮件发送失败"),
    USER_PASSWORD_NULL(20002, "用户密码不存在"),
    USER_UPDATE_ERROR(20002, "用户修改失败"),
    USER_LINK_INVALID(20002, "链接已失效"),

    ;


    BizExceptionEnum(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    private Integer status;

    private String message;

    @Override
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer code) {
        this.status = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
