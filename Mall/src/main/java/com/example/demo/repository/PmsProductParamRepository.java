package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.PmsProductParam;

public interface PmsProductParamRepository extends JpaRepository<PmsProductParam, Long> {
	
}
