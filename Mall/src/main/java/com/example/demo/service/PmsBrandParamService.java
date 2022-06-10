package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PmsBrandParam;
import com.example.demo.repository.PmsBrandParamRepository;
@Service
public class PmsBrandParamService{
	@Autowired
	PmsBrandParamRepository pmsBrandParamRepository;
	
	public void create(PmsBrandParam pmsBrandParam){
	}
		
	public List<PmsBrandParam> search(){
			
			return pmsBrandParamRepository.findAll();	
	}	
}
