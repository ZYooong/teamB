package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PmsBrand;
import com.example.demo.model.request.PmsBrandParam;
import com.example.demo.repository.PmsBrandRepository;

@Service
public class PmsBrandService {
	@Autowired
	private PmsBrandRepository pmsBrandRepository;

	public void create(PmsBrandParam pmsBrandParam) {
	}

	public List<PmsBrand> search() {

		return pmsBrandRepository.findAll();
	}
}
