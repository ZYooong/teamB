package com.example.demo.model.request;

import lombok.Data;

@Data
public class ProductCategoryParam {
	private Long parentId;
	private	Integer pageNum;
	private	Integer  pageSize;
}
