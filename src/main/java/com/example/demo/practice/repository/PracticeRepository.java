package com.example.demo.practice.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.practice.model.PracticeEntity;

@Repository
public interface PracticeRepository extends JpaRepository<PracticeEntity, String>{
}