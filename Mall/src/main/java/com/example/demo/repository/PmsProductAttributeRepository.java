package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.PmsProductAttribute;

public interface PmsProductAttributeRepository extends JpaRepository<PmsProductAttribute, Long>{
	Optional<PmsProductAttribute> findById(Long id);
}
