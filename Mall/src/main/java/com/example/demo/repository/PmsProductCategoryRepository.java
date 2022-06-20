package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.PmsProductCategory;

public  interface PmsProductCategoryRepository extends JpaRepository<PmsProductCategory, Long>{
	
}
