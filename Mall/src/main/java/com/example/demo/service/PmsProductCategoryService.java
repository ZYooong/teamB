package com.example.demo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PmsProductCategory;
import com.example.demo.model.request.PmsProductCategoryParam;
import com.example.demo.repository.PmsProductCategoryRepository;
import com.example.demo.repository.PmsProductCategoryWithChildrenItemRepository;
@Service
public class PmsProductCategoryService {
	@Autowired
	private PmsProductCategoryRepository  pmsProductCategoryRepository ;
	@Autowired
	private PmsProductCategoryWithChildrenItemRepository pmsProductCategoryWithChildrenItemRepository; 
	public void create(PmsProductCategoryParam pmsProductCategoryParam ) {
		PmsProductCategory pmsProductCategory = new PmsProductCategory();
		BeanUtils.copyProperties(pmsProductCategoryParam, pmsProductCategoryParam);
		pmsProductCategoryRepository .save(pmsProductCategory );
	}
	public void search( ){
		pmsProductCategoryWithChildrenItemRepository.findAll();
	}
}
