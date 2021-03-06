package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.PmsProduct;
import com.example.demo.model.request.PmsProductParam;
import com.example.demo.model.responses.CommonPage;
import com.example.demo.model.responses.CommonResult;
import com.example.demo.repository.PmsProductRepository;
import com.example.demo.service.PmsProductParamService;

@RequestMapping("/product")

@Controller
public class PmsProductController {
	// Logger 用于记录服务器日志
	@Autowired
	private PmsProductParamService pmsProductParamService;
	@Autowired
	private PmsProductRepository pmsProductRepository;

	@ResponseBody // 返回值为 ResponseBody 的内容
	@PostMapping("/create")
	public CommonResult create(@RequestBody PmsProductParam productParam) { // 传入参数为 RequestBody （在文档中标识为 body）
		try {
			if (pmsProductParamService.createPmsProduct(productParam)) {
				return CommonResult.success(productParam);

			} else {
				return CommonResult.fail(201L, null, "Created");

			}
		} catch (Exception e) {
			return CommonResult.fail(404L, null, "Not Found");
		}

	}

	@ResponseBody
	@GetMapping("/list")
	public CommonResult list(@RequestParam(name = "brandId", required = false) Long brandId, //
			@RequestParam(name = "keyword", required = false) String keyWords, //
			@RequestParam(name = "productCategoryId", required = false) Long productCategoryId, //
			@RequestParam(name = "publishStatus", required = false) Integer publishStatus, //
			@RequestParam(name = "verifyStatus", required = false) Integer verifyStatus, //
			@RequestParam(name = "productSn", required = false) String productSn, //
			@RequestParam(name = "pageNum", required = false, defaultValue = "1") Integer pageNum, //
			@RequestParam(name = "pageSize", required = false, defaultValue = "5") Integer pageSize) {

		PmsProduct pmsProduct = PmsProduct.builder()//
				.brandId(brandId)//
				.productCategoryId(productCategoryId)//
				.publishStatus(publishStatus)//
				.verifyStatus(verifyStatus)//
				.productSn(productSn).build();
		Example<PmsProduct> example = Example.of(pmsProduct);
		List<PmsProduct> products = pmsProductRepository.findAll(example);

		if (keyWords != null) {
			List<PmsProduct> list1 = pmsProductRepository.findByKeyWordsContaining(keyWords);
			if (list1.size() != 0) {
				List<PmsProduct> list2 = new ArrayList<>();
				for (int i = 0; i < list1.size(); i++) {
					for (PmsProduct p : products) {
						if (p.getId() == list1.get(i).getId()) {
							list2.add(p);
						}
					}
				}
				if (list2.size() != 0) {
					products.clear();
					products = list2;
				}
			}
		}
		if (pageSize * pageNum < products.size()) {
			products = products.subList(pageNum * pageSize - pageSize, pageNum * pageSize);
		}
		if (pageNum * pageSize >= products.size() && pageNum * pageSize - pageSize != 0
				&& products.size() > pageNum * pageSize - pageSize) {
			products = products.subList(pageNum * pageSize - pageSize, products.size());
		}
		// TODO 式样尚不明确 暂时设定为0
		CommonPage<PmsProduct> commonPage = new CommonPage<>(products, 0, 0, 0l, 0);
		return new CommonResult(200, commonPage, "ok");
	}
}
