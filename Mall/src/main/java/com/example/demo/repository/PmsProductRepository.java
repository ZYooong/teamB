package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PmsProduct;
@Repository
public interface PmsProductRepository extends JpaRepository<PmsProduct, Long> {
	List<PmsProduct> findAll();
	List<PmsProduct> findByKeyWordsContaining( String keyWords);
//	List<PmsProduct> findByName(String name);
	 PmsProduct findByName(String name);
}
