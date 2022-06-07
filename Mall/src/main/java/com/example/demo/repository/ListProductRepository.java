package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.request.ProductParam;



@Repository
public interface ListProductRepository extends JpaRepository<ProductParam, Long>{

}
