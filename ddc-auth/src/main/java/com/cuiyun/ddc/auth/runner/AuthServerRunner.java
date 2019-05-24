package com.cuiyun.ddc.auth.runner;

import com.cuiyun.ddc.auth.config.KeyConfig;
import com.cuiyun.ddc.auth.util.jwt.RsaKeyHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

//import org.springframework.data.redis.core.RedisTemplate;

/**
 * @program: kfcoding-ddc
 * @description: 启动加载配置
 * @author: maple
 * @create: 2018-08-06 18:34
 **/
@Configuration
public class AuthServerRunner implements CommandLineRunner {
//    @Autowired
//    private RedisTemplate<String, String> redisTemplate;
    private static final String REDIS_USER_PRI_KEY = "AG:AUTH:JWT:PRI";
    private static final String REDIS_USER_PUB_KEY = "AG:AUTH:JWT:PRI";
    private static final String REDIS_SERVICE_PRI_KEY = "AG:AUTH:CLIENT:PRI";
    private static final String REDIS_SERVICE_PUB_KEY = "AG:AUTH:CLIENT:PUB";

    @Autowired
    private KeyConfig keyConfig;

    @Override
    public void run(String... args) throws IOException, NoSuchAlgorithmException {
//        if (redisTemplate.hasKey(REDIS_USER_PRI_KEY) && redisTemplate.hasKey(REDIS_USER_PUB_KEY) && redisTemplate.hasKey(REDIS_SERVICE_PRI_KEY) && redisTemplate.hasKey(REDIS_SERVICE_PUB_KEY)) {
//            keyConfig.setUserPriKey(RsaKeyHelper.toBytes(redisTemplate.opsForValue().get(REDIS_USER_PRI_KEY).toString()));
//            keyConfig.setUserPubKey(RsaKeyHelper.toBytes(redisTemplate.opsForValue().get(REDIS_USER_PUB_KEY).toString()));
//            keyConfig.setServicePriKey(RsaKeyHelper.toBytes(redisTemplate.opsForValue().get(REDIS_SERVICE_PRI_KEY).toString()));
//            keyConfig.setServicePubKey(RsaKeyHelper.toBytes(redisTemplate.opsForValue().get(REDIS_SERVICE_PUB_KEY).toString()));
//        } else {
            System.out.println("生成密钥");
            Map<String, byte[]> keyMap = RsaKeyHelper.generateKey(keyConfig.getUserSecret());
            keyConfig.setUserPriKey(keyMap.get("pri"));
            keyConfig.setUserPubKey(keyMap.get("pub"));
//        }
    }
}
