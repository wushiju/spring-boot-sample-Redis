/** 
 * Project Name:spring-boot-sample-Redis 
 * File Name:ObjectRedisController.java 
 * Package Name:com.example.web 
 * Date:2017年9月4日下午4:32:37 
 * Copyright (c) 2017, 现代金控 All Rights Reserved. 
 */
package com.example.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Person;
import com.example.domain.PersonDao;

/**
 * 功能说明
 * 
 * @date 2017年9月4日 下午4:32:37
 * @author wusj
 * @version 1.0
 */
@RestController
public class ObjectRedisController {

	private static Logger logger = LoggerFactory.getLogger(ObjectRedisController.class);

	@Autowired
	PersonDao personDao;

	@RequestMapping("/setPerson")
	public void set(String id, String name, Integer age) {
		logger.debug("访问setPerson:id={},name={},age={}", id, name, age);
		Person person = new Person(id, name, age);
		personDao.save(person);
	}

	@RequestMapping("/getPerson")
	public Person getPerson(String id) {
		return personDao.getPerson(id);
	}
}
