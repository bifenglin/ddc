package com.cuiyun.ddc.auth.configuration;

import com.cuiyun.ddc.auth.config.UserAuthConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.cuiyun.ddc.auth"})
public class AutoConfiguration {
    @Bean
    UserAuthConfig getUserAuthConfig(){
        return new UserAuthConfig();
    }
}
