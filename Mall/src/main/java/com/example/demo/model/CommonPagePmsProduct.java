package com.example.demo.model;

import java.util.List;

import lombok.Data;
@Data
public class CommonPagePmsProduct {
	private Integer pageNum;//($int32)
	private Integer pageSize;//($int32)
	private Long total;//($int64)
	private Integer totalPage;//($int32)
	private List<PmsProduct> pmsProductList;
}
