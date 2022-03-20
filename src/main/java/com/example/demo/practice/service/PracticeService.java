package com.example.demo.practice.service;

import org.springframework.stereotype.Service;

import com.example.demo.practice.model.PracticeEntity;
import com.example.demo.practice.repository.PracticeRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PracticeService {
	private final PracticeRepository practiceRepository;
	
	public PracticeEntity createClub(PracticeEntity practiceEntity) {
		return practiceRepository.save(practiceEntity);
	}
	
	public PracticeEntity findClubById(String id) {
		return practiceRepository.findById(id).orElse(null);
	}

	public PracticeEntity updateClub(PracticeEntity practiceEntity) {
		return practiceRepository.save(practiceEntity);
	}
	
	public void deleteClub(String id) {
		practiceRepository.deleteById(id);
	}
}
