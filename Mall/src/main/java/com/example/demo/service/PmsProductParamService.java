package com.example.demo.service;

import java.util.List;

import com.example.demo.model.PmsProductParam;
import com.example.demo.model.request.ProductParam;
import com.example.demo.model.request.SearchProductParam;

public interface PmsProductParamService {
	public void create(ProductParam productParam);
	//public void cearch(SearchProductParam searchProductParam);
	public List<PmsProductParam> search(SearchProductParam searchProductParam);
}

