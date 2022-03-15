package com.example.demo.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.test.model.TestEntity;
import com.example.demo.test.repository.TestRepository;

@Service
public class TestService {

	@Autowired
	private TestRepository testRepository;

	public TestEntity findByAnimalId(Long id) {
		return testRepository.findByAnimalId(id).orElseThrow(() -> new RuntimeException("not found"));
	}

	public TestEntity findByAnimalName(String name) {
		return testRepository.findByAnimalName(name).orElseThrow(() -> new RuntimeException("not found"));
	}

}
