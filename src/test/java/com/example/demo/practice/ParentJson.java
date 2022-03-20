package com.example.demo.practice;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ParentJson {
	private String name;
	private Test1 testObject;
	private List<Test2> testObjectList;

	@Getter
	@Setter
	@ToString
	public class Test1{
		private String tempName;
		private int tempValue;
	}

	@Getter
	@Setter
	@ToString
	public class Test2 {
		private String objName;
		private int objValue;
	}
}
