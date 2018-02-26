package com.test.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.api.VerboseProgressCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class MyGeneratorController {
	
	@Test
	public void myTest(){
	   List<String> warnings = new ArrayList<String>();
	   boolean overwrite = true;
	   File configFile = new File("config/generator.xml");
	   ConfigurationParser cp = new ConfigurationParser(warnings);
	   Configuration config;
	   try {
		   config = cp.parseConfiguration(configFile);
		   DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		   MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		   //myBatisGenerator.generate(null);//控制台无日志输出
		   myBatisGenerator.generate((ProgressCallback)new VerboseProgressCallback());//控制台有日志
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
