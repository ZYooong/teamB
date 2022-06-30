package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.PmsProductCategoryWithChildrenItem;

public interface PmsProductCategoryWithChildrenItemRepository extends JpaRepository<PmsProductCategoryWithChildrenItem, Long> {

}
