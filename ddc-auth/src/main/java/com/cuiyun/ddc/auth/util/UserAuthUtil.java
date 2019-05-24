package com.cuiyun.ddc.auth.util;

import com.cuiyun.ddc.auth.config.UserAuthConfig;
import com.cuiyun.ddc.auth.exception.BizExceptionEnum;
import com.cuiyun.ddc.auth.util.jwt.IJWTInfo;
import com.cuiyun.ddc.auth.util.jwt.JWTHelper;
import com.cuiyun.ddc.common.exception.auth.UserTokenException;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.SignatureException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * @program: kfcoding-cloud
 * @description: 用户鉴权类
 * @author: maple
 * @create: 2018-08-02 16:31
 **/
@Configuration
public class UserAuthUtil {
    @Autowired
    private UserAuthConfig userAuthConfig;
    public IJWTInfo getInfoFromToken(String token) throws Exception {
        try {
            return JWTHelper.getInfoFromToken(token, userAuthConfig.getPubKeyByte());
        }catch (ExpiredJwtException ex){
            throw new UserTokenException(BizExceptionEnum.TOKEN_EXPIRED);
        }catch (SignatureException ex){
            throw new UserTokenException(BizExceptionEnum.TOKEN_SIGNATURE);
        }catch (IllegalArgumentException ex){
            throw new UserTokenException(BizExceptionEnum.TOKEN_EMPTY);
        }
    }
}
