package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PmsProductCategory;
import com.example.demo.model.request.PmsProductCategoryParam;
import com.example.demo.model.request.PmsProductParam;
import com.example.demo.repository.PmsProductCategoryRepository;
@Service
public class PmsProductCategoryService {
	@Autowired
	private PmsProductCategoryRepository  pmsProductCategoryRepository ;
	public void create(PmsProductCategoryParam pmsProductCategoryParam ) {
		PmsProductCategory pmsProductCategory = new PmsProductCategory();
	}
}
