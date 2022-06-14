package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PmsProductAttribute;
import com.example.demo.model.request.PmsProductAttributeParam;
import com.example.demo.repository.PmsProductAttributeRepository;

@Service
public class PmsProductAttributeService {
	@Autowired
	private PmsProductAttributeRepository pmsProductAttributeRepository;
	
	public void create(PmsProductAttributeParam pmsProductAttributeParam) {
		PmsProductAttribute pmsProductAttribute = new PmsProductAttribute();//

		BeanUtils.copyProperties(pmsProductAttributeParam, pmsProductAttribute);
		pmsProductAttributeRepository.save(pmsProductAttribute);

	}
	public Optional<PmsProductAttribute> search() {

		return pmsProductAttributeRepository.findById(null);
	}
}
