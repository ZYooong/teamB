package com.example.demo.service;

import java.util.List;

import com.example.demo.model.request.PmsProductParam;
import com.example.demo.model.request.SearchProductParam;

public interface PmsProductParamService {
	public void create(PmsProductParam productParam);
	public List<PmsProductParam> search(SearchProductParam searchProductParam);
}

