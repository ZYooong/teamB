package com.example.demo.createproductController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.PmsProduct;
import com.example.demo.model.request.ProductParam;
import com.example.demo.model.response.CommonResult;
import com.example.demo.productParamService.PmsProductService;
import com.example.demo.productParamService.PmsProductServiceImpl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@RequestMapping("/product") 
@Controller
public class PmsProductController {
	// Logger 用于记录服务器日志
	@Autowired
	PmsProductService pmsProductService;
	private static final Logger logger = LoggerFactory.getLogger(PmsProductController.class);
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