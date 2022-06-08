package com.example.demo.model.request;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchProductParam {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long brandId;// ($int64)商品品牌编号
	private String keyword;//商品名称模糊关键字
	private Integer pageNum;//pageNum Default value : 1
	private Integer pageSize;//	pageSiz Default value : 5
	private Long productCategoryId;//商品分类编号
	private String productSn;//商品货号
	private Integer publishStatus;//上架状态
	private Integer verifyStatus;//审核状态


}
