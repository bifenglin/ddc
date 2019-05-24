package com.cuiyun.ddc.generator.config;

import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * 默认的代码生成的配置
 *
 * @author maple
 * @date 2018-10-28-下午8:27
 */
public class DdcGeneratorConfig extends AbstractGeneratorConfig {

    protected void globalConfig() {
        globalConfig.setOutputDir("E:\\projects\\code");//写自己项目的绝对路径,注意具体到java目录
        globalConfig.setFileOverride(true);
        globalConfig.setEnableCache(false);
        globalConfig.setBaseResultMap(true);
        globalConfig.setBaseColumnList(true);
        globalConfig.setOpen(false);
        globalConfig.setAuthor("maple");
    }

    protected void dataSourceConfig() {
        dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig.setDriverName("com.mysql.jdbc.Driver");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("123qwe!@#");
        dataSourceConfig.setUrl("jdbc:mysql://rm-uf6p6lsw9at9z1xkexo.mysql.rds.aliyuncs.com:3306/kfcoding_research?characterEncoding=utf8");
    }

    protected void strategyConfig() {
        strategyConfig.setTablePrefix(new String[]{"research_"});// 此处可以修改为表前缀
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
    }

    protected void packageConfig() {
        packageConfig.setParent(null);
        packageConfig.setEntity("com.cuiyun.ddc.rest.model");
        packageConfig.setMapper("com.cuiyun.ddc.rest.dao");
        packageConfig.setXml("com.cuiyun.ddc.rest.dao.mapping");
    }

    protected void contextConfig() {
        contextConfig.setProPackage("com.cuiyun.ddc.rest");
        contextConfig.setCoreBasePackage("com.cuiyun.ddc.core");
        contextConfig.setModuleName("rest");
        contextConfig.setProjectPath("/home/project/test");//写自己项目的绝对路径

        /**
         * mybatis-plus 生成器开关
         */
        contextConfig.setEntitySwitch(true);
        contextConfig.setDaoSwitch(true);
        contextConfig.setServiceSwitch(true);
    }

    @Override
    protected void config() {
        globalConfig();
        dataSourceConfig();
        strategyConfig();
        packageConfig();
        contextConfig();
    }
}
