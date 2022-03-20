package com.example.demo.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.practice.model.PracticeEntity;
import com.example.demo.practice.service.PracticeService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/club")
public class PracticeController {
	@Autowired
	private final PracticeService practiceService;
	
	@PostMapping
	public PracticeEntity createClub(@RequestBody PracticeEntity practiceEntity) {
		return practiceService.createClub(practiceEntity);
	}
	
	@GetMapping("/{id}")
	public PracticeEntity findClubById(@PathVariable String id) {
		return practiceService.findClubById(id);
	}
	
	@PostMapping("/{id}")
	public PracticeEntity updateClub(
			@PathVariable String id,
			@RequestBody PracticeEntity practiceEntity
			) {
		return practiceService.updateClub(practiceEntity);
	}
	
	@DeleteMapping("/{id}")
	public void deleteClub(
			@PathVariable String id
			) {
		practiceService.deleteClub(id);
	}
}
