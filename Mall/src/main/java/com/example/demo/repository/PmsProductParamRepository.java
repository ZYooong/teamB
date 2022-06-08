package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.PmsProductParam;

public interface PmsProductParamRepository extends JpaRepository<PmsProductParam, Long> {
    @Query("select * from PmsProductParam u where u.name like %:name% order by u.id asc")
    public List<PmsProductParam> findby(@Param("name") String name);
}
