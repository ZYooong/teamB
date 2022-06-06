package com.example.demo.createProductParamRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.creatModel.PmsSubjectProductRelation;

public interface PmsSubjectProductRelationRepository extends JpaRepository<PmsSubjectProductRelation, Long> {

}
