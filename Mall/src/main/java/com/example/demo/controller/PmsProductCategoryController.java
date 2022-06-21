package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.request.PmsProductCategoryParam;
import com.example.demo.model.responses.CommonResult;
import com.example.demo.service.PmsProductCategoryService;
@RequestMapping("/productCategory") 
public class PmsProductCategoryController {
	@Autowired
	private PmsProductCategoryService pmsProductCategoryService;
	@ResponseBody // 返回值为 ResponseBody 的内容
	@PostMapping("/create")
	public CommonResult create(@RequestBody PmsProductCategoryParam pmsProductCategoryParam) { // 传入参数为 RequestBody （在文档中标识为 body）
		try {
			pmsProductCategoryService.create(pmsProductCategoryParam);
			return CommonResult.success(pmsProductCategoryParam);
		} catch (Exception ex) {

			return CommonResult.fail(404L, null, "Not Find");

		}

	}
	@ResponseBody
	@GetMapping("/list")
	public CommonResult list(@RequestBody PmsProductCategoryParam param) {
		return null;
		

		}

}
