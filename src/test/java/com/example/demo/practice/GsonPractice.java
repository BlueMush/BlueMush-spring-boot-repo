package com.example.demo.practice;

import com.google.gson.Gson;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GsonPractice {
	
	
	public static void main(String[] args) {
		Gson gson = new Gson();
		
		String jsonString = "{\"name\":\"testname\",\"testList\":[\"item01\",\"item02\",\"item03\"],\"value\":123,\"isTest\":true}";
		//{"name":"testname","testList":["item01","item02","item03"],"value":123,"isTest":true}

		String jsonStringWithObjects = "{\"name\":\"testname\",\"testObject\": {\"tempName\":\"objName\",\"tempValue\":123},\"testObjectList\":[{\"objName\":\"name01\", \"objValue\": 1},{\"objName\":\"name02\", \"objValue\": 2}]}";
		//{"name":"testname","testObject": {"tempName":"objName","tempValue":123},"testObjectList":[{"objName":"name01", "objValue": 1},{"objName":"name02", "objValue": 2}]}
		
		/**
		 * 숙제
		 * jsonString을 Gson을 사용해서 자바 객체로 변환하고,
		 * 변환된 자바 객체를 다시 Json String으로 변환 
		 */
		
		/**
		 * ex) Json to Object
		 * '클래스타입' '객체명' = gson.fromJson(Json 스트링 변수);
		 * 
		 * ex) Object to Json
		 * String jsonStr = gson.toJson('객체명', '클래스타입'.class);
		 */
		Test test = gson.fromJson(jsonString, Test.class); // <- test 객체를 String으로 변환↓↓↓
		log.info("Gson Object : [ {} ]", test);
		
		// -----String gsonJson = gson.toJson(jsonString); ----- // <- String을 String으로 왜바꿈←
		String gsonTdoJsonString = gson.toJson(test);
		log.info("Json String : [ {} ]", gsonTdoJsonString);
		
		ParentJson parentJson = gson.fromJson(jsonStringWithObjects, ParentJson.class);
		log.info("Gson Object : [ {} ]", parentJson);
		
		String gsonToJsonString = gson.toJson(parentJson);
		log.info("Json String : [ {} ]", gsonToJsonString);

		//Test(name=testname, testList=[item01, item02, item03], value=123, isTest=true)
		//ToString 쓰면 이렇y게나와야됨 ㅇㅋ?
	}
}
