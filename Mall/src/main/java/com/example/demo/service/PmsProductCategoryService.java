package com.example.demo.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PmsProductCategory;
import com.example.demo.model.PmsProductCategoryWithChildrenItem;
import com.example.demo.model.request.PmsProductCategoryParam;
import com.example.demo.repository.PmsProductCategoryRepository;
import com.example.demo.repository.PmsProductCategoryWithChildrenItemRepository;

@Service
public class PmsProductCategoryService {
	@Autowired
	private PmsProductCategoryRepository pmsProductCategoryRepository;
	@Autowired
	private PmsProductCategoryWithChildrenItemRepository pmsProductCategoryWithChildrenItemRepository;

	public boolean create(PmsProductCategoryParam pmsProductCategoryParam) {
		PmsProductCategory pmsProductCategory = new PmsProductCategory();
		pmsProductCategory = pmsProductCategoryRepository.findByName(pmsProductCategoryParam.getName());
		if (pmsProductCategory == null) {
			return false;
		}
		BeanUtils.copyProperties(pmsProductCategoryParam, pmsProductCategory);
		pmsProductCategoryRepository.save(pmsProductCategory);
		return true;
	}

	public List<PmsProductCategoryWithChildrenItem> search() {
		return pmsProductCategoryWithChildrenItemRepository.findAll();
	}
}
