package com.cuiyun.ddc.generator;


import com.cuiyun.ddc.generator.config.DdcGeneratorConfig;

/**
 * 代码生成器,可以生成实体,dao,service
 *
 * @author maple
 * @Date 2018/8/4 12:38
 */
public class DdcCodeGenerator {

    public static void main(String[] args) {

        /**
         *  生成mapper service model
         */
        DdcGeneratorConfig ddcGeneratorConfig = new DdcGeneratorConfig();
        ddcGeneratorConfig.doMpGeneration();
    }


}