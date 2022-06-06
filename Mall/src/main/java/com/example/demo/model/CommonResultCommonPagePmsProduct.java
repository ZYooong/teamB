package com.example.demo.model;

import java.util.List;

import lombok.Data;
@Data
public class CommonResultCommonPagePmsProduct {
	private Long code;//($int64)
	private String message;
	private List<CommonPagePmsProduct> commonPagePmsProduct;
}
