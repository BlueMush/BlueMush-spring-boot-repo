package com.example.demo.practice;

import java.util.List;

import lombok.ToString;

@ToString
public class Test2 {
	private String name;
	private Object testObjectList;
	private Object testObject;
	
	public Test2(String name, Object testObject, Object testObjectList) {
		this.name = name;
		this.testObject = testObject;
		this.testObjectList = testObjectList;
	}
}
