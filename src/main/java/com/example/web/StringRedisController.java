/** 
 * Project Name:spring-boot-sample-Redis 
 * File Name:StringRedisController.java 
 * Package Name:com.example.web 
 * Date:2017年9月4日下午4:26:26 
 * Copyright (c) 2017, 现代金控 All Rights Reserved. 
 */
package com.example.web;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能说明
 * 
 * @date 2017年9月4日 下午4:26:26
 * @author wusj
 * @version 1.0
 */
@RestController
public class StringRedisController {

	private static Logger logger = LoggerFactory
			.getLogger(StringRedisController.class);

	@Autowired
	StringRedisTemplate stringRedisTemplate;

	@Resource(name = "stringRedisTemplate")
	ValueOperations<String, String> valOpsStr;

	@RequestMapping("set")
	public String setKeyAndValue(String key, String value) {
		logger.debug("访问set:key={},value={}", key, value);
		valOpsStr.set(key, value);
		return "Set Ok";
	}

	@RequestMapping("get")
	public String getKey(String key) {
		logger.debug("访问get:key={}", key);
		return valOpsStr.get(key);
	}
}
