package com.example.demo.practice;

import java.util.List;

import lombok.ToString;

@ToString
public class Test {
	private String name;
	private List<String> testList;
	private int value;
	private boolean isTest;
	
	public Test(String name, List<String> testList, int value, boolean isTest) { // 이거 롬복 어노테이션 써라
		this.name = name;
		this.testList = testList;
		this.value = value;
		this.isTest = isTest;
	}
}
