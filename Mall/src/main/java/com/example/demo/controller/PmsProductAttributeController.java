package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.request.PmsProductAttributeParam;
import com.example.demo.model.responses.CommonResult;
import com.example.demo.service.PmsProductAttributeService;

@RequestMapping("/productAttribute")
@Controller
public class PmsProductAttributeController {
	@Autowired
	private PmsProductAttributeService pmsProductAttributeService;
	
	@ResponseBody // 返回值为 ResponseBody 的内容
	@PostMapping("/create")
	public CommonResult create(@RequestBody PmsProductAttributeParam pmsProductAttributeParam) {
		try {
			pmsProductAttributeService.create(pmsProductAttributeParam);
			return CommonResult.success(pmsProductAttributeParam);
		} catch (Exception ex) {
			return CommonResult.fail(401L, null, "Unauthorized");
		}
	} 
	@GetMapping("/{id}")
	@ResponseBody
	public CommonResult id() {
		try {
			 pmsProductAttributeService.search();
			return CommonResult.success(id());
		} catch (Exception ex) {
			return CommonResult.fail(404L,null,"Not Found");
		}
	}
}
