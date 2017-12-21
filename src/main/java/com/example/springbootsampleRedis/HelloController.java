/** 
 * Project Name:spring-boot-sample-helloworld 
 * File Name:HelloController.java 
 * Package Name:com.example 
 * Date:2017年9月4日下午3:22:57 
 * Copyright (c) 2017, 现代金控 All Rights Reserved. 
 */
package com.example.springbootsampleRedis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能说明
 * 
 * @date 2017年9月4日 下午3:22:57
 * @author wusj
 * @version 1.0
 */
@RestController
public class HelloController {

	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping("/")
	public String helloworld() {
		logger.debug("访问hello");
		return "Hello world!";
	}

	@RequestMapping("/hello/{name}")
	public String helloName(@PathVariable String name) {
		logger.debug("访问helloName，name=" + name);
		return "Hello " + name;
	}
}
