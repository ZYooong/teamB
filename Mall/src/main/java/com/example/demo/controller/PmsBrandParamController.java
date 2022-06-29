package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.PmsBrand;
import com.example.demo.model.request.PmsBrandParam;
import com.example.demo.model.responses.CommonPage;
import com.example.demo.model.responses.CommonResult;
import com.example.demo.service.PmsBrandService;

@RequestMapping("/brand")
@Controller
public class PmsBrandParamController {
	@Autowired
	private PmsBrandService pmsBrandService;

	@ResponseBody // 返回值为 ResponseBody 的内容
	@PostMapping("/create")
	public CommonResult create(@RequestBody PmsBrandParam pmsBrandParam) { // 传入参数为 RequestBody （在文档中标识为 body）
		try {
			pmsBrandService.create(pmsBrandParam);
			return CommonResult.success(pmsBrandParam);
		} catch (Exception ex) {
			return CommonResult.fail(401L, null, "Unauthorized");
		}
	}

	@GetMapping("/list")
	@ResponseBody
	public CommonResult list(@RequestParam(name = "keyword", required = false) String keyword, //
			@RequestParam(name = "pageNum", required = false, defaultValue = "1") Integer pageNum, //
			@RequestParam(name = "pageSize", required = false, defaultValue = "5") Integer pageSize) {
		try {
			CommonPage<PmsBrand> listBrand = pmsBrandService.search(pageNum, pageSize, keyword);
			return CommonResult.success(listBrand);
		} catch (Exception ex) {
			return CommonResult.fail(404L, null, "Not Found");
		}
	}
}