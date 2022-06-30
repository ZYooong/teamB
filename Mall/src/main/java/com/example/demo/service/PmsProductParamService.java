package com.example.demo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PmsProduct;
import com.example.demo.model.request.PmsProductParam;
import com.example.demo.repository.PmsProductRepository;

@Service
public class PmsProductParamService {
	@Autowired
	private PmsProductRepository pmsProductRepository;

	public boolean createPmsProduct(PmsProductParam productParam) {
		PmsProduct pmsProduct = new PmsProduct();
		pmsProduct = pmsProductRepository.findByName(productParam.getName());
		if (pmsProduct == null) {
			return false;
		}
		BeanUtils.copyProperties(productParam, pmsProduct);
		pmsProductRepository.save(pmsProduct);
		return true;
	}
}
