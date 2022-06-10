package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.PmsProduct;
import com.example.demo.model.request.PmsProductParam;
import com.example.demo.model.request.SearchProductParam;
import com.example.demo.model.responses.CommonResult;
import com.example.demo.service.PmsProductParamService;

@RequestMapping("/product")
@Controller
public class PmsProductController {
	// Logger 用于记录服务器日志
	@Autowired
	PmsProductParamService pmsProductParamService;

	@ResponseBody // 返回值为 ResponseBody 的内容
	@PostMapping("/create")
	public CommonResult create(@RequestBody PmsProductParam productParam) { // 传入参数为 RequestBody （在文档中标识为 body）
		try {
			pmsProductParamService.create(productParam);
			return CommonResult.success(productParam);
		} catch (Exception ex) {
			return CommonResult.fail(401L, null, "Unauthorized");
		}

	}

	@GetMapping("/list")
	@ResponseBody
	public CommonResult list(SearchProductParam searchProductParam) {
		try {
			List<PmsProduct> listProduct = pmsProductParamService.search(searchProductParam);
			return CommonResult.success(listProduct);
		} catch (Exception ex) {
			return CommonResult.fail(401L, null, "Unauthorized");
		}
	}

}
