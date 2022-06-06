package com.example.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class QueryProductController {
	@GetMapping("/queryProduct")
	public String getQueryProduct(//
			@RequestParam("brandId") Long brandId, //
			@RequestParam("keyword") String keyword, //
			@RequestParam("pageNum") Integer pageNum, //
			@RequestParam("pageSize") Integer pageSize, //
			@RequestParam("productCategoryId") Long productCategoryId, //
			@RequestParam("productSn") String productSn, //
			@RequestParam("publishStatus") Integer publishStatus, //
			@RequestParam("verifyStatus") Integer verifyStatus
			) {
		
		return "editBlog";
	}
}
