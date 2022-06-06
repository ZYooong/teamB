package com.example.demo.createProductParamRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.creatModel.PmsProduct;

public interface PmsProductRepository extends JpaRepository<PmsProduct, Long> {
	
	//@Query("SELECT p From PmsProduct p WHERE p.brandName=brandName AND p.deleteStatus=deleteStatus")
	//public List<PmsProduct> findByBrandNameAndDeleteStatus(@Param("brandName") String brandName, @Param("deleteStatus") Integer deleteStatus);
}
