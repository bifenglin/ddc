package com.cuiyun.ddc.rest;

import com.cuiyun.ddc.auth.EnableAuth;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @program: kfcoding-cloud
 * @description: user模块启动类
 * @author: maple
 * @create: 2018-08-03 12:58
 **/
@EnableAuth
@SpringBootApplication
@EnableSwagger2Doc
public class DdcBootstrap {
    public static void main(String[] args) {
        new SpringApplicationBuilder(DdcBootstrap.class).run(args);
    }
}
