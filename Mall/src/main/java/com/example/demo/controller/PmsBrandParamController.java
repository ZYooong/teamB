package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.PmsBrandParam;
import com.example.demo.model.responses.CommonResult;
import com.example.demo.service.PmsBrandParamService;

@RequestMapping("/brand")
@Controller
public class PmsBrandParamController {
	@Autowired
	private PmsBrandParamService pmsBrandParamService;

	@ResponseBody // 返回值为 ResponseBody 的内容
	@PostMapping("/create")
	public CommonResult create(@RequestBody PmsBrandParam pmsBrandParam) { // 传入参数为 RequestBody （在文档中标识为 body）
		try {
			pmsBrandParamService.create(pmsBrandParam);
			return CommonResult.success(pmsBrandParam);
		} catch (Exception ex) {
			return CommonResult.fail(401L, null, "Unauthorized");
		}
	}

	@GetMapping("/list")
	@ResponseBody
	public CommonResult list() {
		try {
			List<PmsBrandParam> listBrand = pmsBrandParamService.search();
			return CommonResult.success(listBrand);
		} catch (Exception ex) {
			return CommonResult.fail(404L,null,"Not Found");
		}
	}
}