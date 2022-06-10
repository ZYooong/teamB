package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.request.PmsProductParam;

public interface PmsProductParamRepository extends JpaRepository<PmsProductParam, Long> {
	List<PmsProductParam> findAll ();

}
