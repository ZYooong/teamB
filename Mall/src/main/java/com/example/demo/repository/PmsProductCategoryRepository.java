package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.PmsProductCategory;

public  interface PmsProductCategoryRepository extends JpaRepository<PmsProductCategory, Long>{
	@Query(value = "SELECT * FROM pms_product_category WHERE parent_id = :parent_id", nativeQuery = true)
	List<PmsProductCategory> findByParentId(@Param(value = "parent_id") Long parentId);
}
