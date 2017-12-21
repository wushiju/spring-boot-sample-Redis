/** 
 * Project Name:spring-boot-sample-Redis 
 * File Name:Person.java 
 * Package Name:com.example.domain 
 * Date:2017年9月4日下午4:30:51 
 * Copyright (c) 2017, 现代金控 All Rights Reserved. 
 */
package com.example.domain;

import java.io.Serializable;

/**
 * 功能说明
 * 
 * @date 2017年9月4日 下午4:30:51
 * @author wusj
 * @version 1.0
 */
public class Person implements Serializable {

	private static final long serialVersionUID = -7572697046940288333L;

	private String id;
	private String name;
	private Integer age;

	public Person() {
		super();
	}

	public Person(String id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
