package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.model.request.ProductParam;
import com.example.demo.model.response.CommonResult;
import com.example.demo.service.PmsProductParamService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@RequestMapping("/product") 
@Controller
public class PmsProductController {
	// Logger 用于记录服务器日志
	@Autowired
	PmsProductParamService pmsProductParamService;
	@ResponseBody // 返回值为 ResponseBody 的内容
	@PostMapping("/create") 
	public CommonResult create(@RequestBody ProductParam productParam) { // 传入参数为 RequestBody （在文档中标识为 body）
		try {
			pmsProductParamService.create(productParam);

			return CommonResult.success(productParam);
		}catch(Exception ex) {
			return CommonResult.fail(401L,null,	"Unauthorized");
		}
		
	}

}