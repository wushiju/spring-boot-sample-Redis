/** 
 * Project Name:spring-boot-sample-Redis 
 * File Name:PersonDao.java 
 * Package Name:com.example.domain 
 * Date:2017年9月4日下午4:31:41 
 * Copyright (c) 2017, 现代金控 All Rights Reserved. 
 */
package com.example.domain;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

/**
 * 功能说明
 * 
 * @date 2017年9月4日 下午4:31:41
 * @author wusj
 * @version 1.0
 */
@Repository("personDao")
public class PersonDao {

	@Autowired
	RedisTemplate<Object, Object> redisTemplate;

	@Resource(name = "redisTemplate")
	ValueOperations<Object, Object> valOps;

	public void save(Person person) {
		valOps.set(person.getId(), person);
	}

	public Person getPerson(String id) {
		return (Person) valOps.get(id);
	}
}
