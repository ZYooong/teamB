package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.PmsProductCategory;
import com.example.demo.model.PmsProductCategoryWithChildrenItem;
import com.example.demo.model.request.PmsProductCategoryParam;
import com.example.demo.model.responses.CommonPage;
import com.example.demo.model.responses.CommonResult;
import com.example.demo.repository.PmsProductCategoryRepository;
import com.example.demo.repository.PmsProductCategoryWithChildrenItemRepository;
import com.example.demo.service.PmsProductCategoryService;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/productCategory")
@Controller
@Slf4j
public class PmsProductCategoryController {
	@Autowired
	private PmsProductCategoryService pmsProductCategoryService;
	@Autowired
	private PmsProductCategoryWithChildrenItemRepository pmsProductCategoryWithChildrenItemRepository;
	@Autowired
	private PmsProductCategoryRepository pmsProductCategoryRepository;

	@ResponseBody // 返回值为 ResponseBody 的内容
	@PostMapping("/create")
	public CommonResult create(@RequestBody PmsProductCategoryParam pmsProductCategoryParam) { // 传入参数为 RequestBody
																								// （在文档中标识为 body）
		try {
			pmsProductCategoryService.create(pmsProductCategoryParam);
			return CommonResult.success(pmsProductCategoryParam);
		} catch (Exception ex) {

			return CommonResult.fail(404L, null, "Not Find");

		}

	}

	@ResponseBody
	@GetMapping("/list/withChildren")
	public CommonResult getProductCategoryWithChildren() {

		return new CommonResult(200, pmsProductCategoryWithChildrenItemRepository.findAll(), "ok");
	}

	@ResponseBody
	@GetMapping("/list/{parentId}")

	public CommonResult getProductCategoryListByParentId(
			@RequestParam(name = "pageNum", required = false, defaultValue = "1") Integer pageNum, //
			@RequestParam(name = "pageSize", required = false, defaultValue = "5") Integer pageSize, //
			@PathVariable Long parentId) {
		log.info("get productCategory list pagenum: {}, pageSize:{}, parentId:{}", pageNum, pageSize, parentId);

		if (parentId == 0) {

			List<PmsProductCategoryWithChildrenItem> pmsProductCategoryWithChildrenItem = pmsProductCategoryWithChildrenItemRepository
					.findAll();
			Integer total = pmsProductCategoryWithChildrenItem.size();// 总个数
			Integer result = total % pageSize;
			Integer totalPage = (Integer) (result > 0 ? // 总页数 如果取模大于0说明总个数和每页显示个数整除后需要加一页
					total / pageSize + 1 : total / pageSize);

			Integer maxCount = pageSize * pageNum; // 每页中显示的最大序号
			Integer minCount = pageSize * (pageNum - 1);// 每页中的最小序号
			if (maxCount > pmsProductCategoryWithChildrenItem.size()) {
				maxCount = pmsProductCategoryWithChildrenItem.size();
			}
			pmsProductCategoryWithChildrenItem = pmsProductCategoryWithChildrenItem.subList(minCount, maxCount);

			CommonPage<PmsProductCategoryWithChildrenItem> commonPageCategoryWithChildrenItem = new CommonPage<PmsProductCategoryWithChildrenItem>(
					pmsProductCategoryWithChildrenItem, pageNum, pageSize, (long) total, totalPage);
			return new CommonResult(200, commonPageCategoryWithChildrenItem, "通信成功");
		}
		List<PmsProductCategory> pmsProductCategory = pmsProductCategoryRepository.findByParentId(parentId);
		Integer total = pmsProductCategory.size();
		Integer result = total % pageSize;
		Integer totalPage = (Integer) (result > 0 ? total / pageSize + 1 : total / pageSize);
		Integer maxCount = pageSize * pageNum;
		Integer minCount = pageSize * (pageNum - 1);
		if (maxCount > pmsProductCategory.size()) {
			maxCount = pmsProductCategory.size();
		}
		pmsProductCategory = pmsProductCategory.subList(minCount, maxCount);

		CommonPage<PmsProductCategory> commonPageCategory = new CommonPage<PmsProductCategory>(pmsProductCategory,
				pageNum, pageSize, (long) total, totalPage);
		return new CommonResult(200, commonPageCategory, "通信成功");

	}
}
