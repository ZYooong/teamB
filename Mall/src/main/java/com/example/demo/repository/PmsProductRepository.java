package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.PmsProduct;

public interface PmsProductRepository extends JpaRepository<PmsProduct, Long> {
	List<PmsProduct> findAll();
}
