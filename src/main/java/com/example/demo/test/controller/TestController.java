package com.example.demo.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.test.model.TestEntity;
import com.example.demo.test.service.TestService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class TestController {

	@Autowired
	private TestService testService;

	@GetMapping("/api/home")
	public String getHome() {
		return "sts git test";
	}

	@GetMapping("/api/animal/{id}")
	public TestEntity findByAnimalId(
			@PathVariable(required = true) Long id) {
		// log.info("Find by animal id [{}]", id);
		return testService.findByAnimalId(id);
	}

	// 占쏙옙占쏙옙占쏙옙占�
	@GetMapping("/api/animal")
	public TestEntity findByanimalName(
			@RequestParam(required = true) String name) {
		// 占쏙옙占쏙옙占쏙옙占�
		// log.info("Find by animal name [{}]", name);

		return testService.findByAnimalName(name);
	}
}