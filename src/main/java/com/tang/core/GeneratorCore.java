package com.tang.core;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 自动生成
 * @author TW
 */
public class GeneratorCore {



    public void generator(){
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //读取配置文件
        File configFile = new File("F:\\IDEAWorkSpace\\SSMDemo\\src\\main\\resources\\generatorConfig.xml");
        //加载配置
        ConfigurationParser configurationParser = new ConfigurationParser(warnings);
        Configuration configuration = null;
        try {
            System.out.println("加载配置文件……");
            configuration = configurationParser.parseConfiguration(configFile);
            System.out.println("加载文件成功……");
        } catch (Exception e) {
            e.printStackTrace();
        }
        DefaultShellCallback shellCallback = new DefaultShellCallback(overwrite);
        //创建生成对象
        MyBatisGenerator myBatisGenerator = null ;
        try {
            myBatisGenerator = new MyBatisGenerator(configuration, shellCallback, warnings);
        }catch (Exception e){
            e.printStackTrace();
        }
        //生成
        try {
            System.out.println("开始生成……");
            myBatisGenerator.generate(null);
            System.out.println("生成成功");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("生成失败！");
        }

    }



    public static void main(String[] args){
        GeneratorCore generatorCore = new GeneratorCore();
        generatorCore.generator();
    }






}
