package com.zrb.utils;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zrb on 2017/6/25.
 */
public class Mgb_GeneratorUtil {
    public static void generator_1 () throws Exception{
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //指定 逆向工程配置文件generatorConfig.xml C:\Users\zrb\IdeaProjects\demospringboot\src\main\resources\generatorConfig.xml
//        File configFile = new File("generatorConfig.xml");
        File configFile = new File(".\\src\\test\\resources\\generatorConfig_1.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,callback, warnings);
        myBatisGenerator.generate(null);
    }
    public static void generator_2 () throws Exception{
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //指定 逆向工程配置文件generatorConfig.xml C:\Users\zrb\IdeaProjects\demospringboot\src\main\resources\generatorConfig.xml
//        File configFile = new File("generatorConfig.xml");
        File configFile = new File(".\\src\\test\\resources\\generatorConfig_2.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,callback, warnings);
        myBatisGenerator.generate(null);
    }

}
