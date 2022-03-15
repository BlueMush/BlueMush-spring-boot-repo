package com.example.demo.test.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.test.model.TestEntity;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, Long> {
	
	/**
	 * ID 검색
	 * @param id
	 * @return
	 */
	public Optional<TestEntity> findByAnimalId(Long id);

	public Optional<TestEntity> findByAnimalName(String name);
	
	
	/**
	 * 숙제(안하면 구현모 사망) : name으로 일치하는 항목 검색
	 */
}
