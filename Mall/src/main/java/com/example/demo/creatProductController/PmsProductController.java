package com.example.demo.creatProductController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.createProductParamService.PmsProductService;
import com.example.demo.model.createRequest.ProductParam;
import com.example.demo.model.createResponse.CommonResult;

@RequestMapping("/product") 
@Controller
public class PmsProductController {
	@Autowired
	PmsProductService pmsProductService;
	@ResponseBody // 返回值为 ResponseBody 的内容
	@PostMapping("/create") 
	public CommonResult create(@RequestBody ProductParam productParam) { // 传入参数为 RequestBody （在文档中标识为 body）
		try {
			pmsProductService.create(productParam);
			return CommonResult.success(productParam);
		}catch(Exception ex) {
			return CommonResult.fail(401L,null,	"Unauthorized");
		}
		
	}

}