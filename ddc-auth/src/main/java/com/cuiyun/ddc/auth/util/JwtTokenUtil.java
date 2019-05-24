package com.cuiyun.ddc.auth.util;

import com.cuiyun.ddc.auth.config.KeyConfig;
import com.cuiyun.ddc.auth.util.jwt.IJWTInfo;
import com.cuiyun.ddc.auth.util.jwt.JWTHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//import org.springframework.data.redis.core.RedisTemplate;

/**
 * Created by bifenglin on 2018/8/10.
 */
@Component
public class JwtTokenUtil {

    @Value("${jwt.expire}")
    private int expire;

    @Autowired
    private KeyConfig keyConfig;

    public String generateToken(IJWTInfo jwtInfo) throws Exception {
        return JWTHelper.generateToken(jwtInfo, keyConfig.getUserPriKey(),expire);
    }

    public IJWTInfo getInfoFromToken(String token) throws Exception {
        return JWTHelper.getInfoFromToken(token, keyConfig.getUserPubKey());
    }
}
