package com.example.demo.test.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.test.model.TestEntity;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, Long> {
	
	/**
	 * ID �˻�
	 * @param id
	 * @return
	 */
	public Optional<TestEntity> findByAnimalId(Long id);

	public Optional<TestEntity> findByAnimalName(String name);
}
