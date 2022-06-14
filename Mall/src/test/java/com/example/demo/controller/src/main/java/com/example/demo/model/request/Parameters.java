package com.example.demo.model.request;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Parameters {
	private Long brandId;
	private String keyword;
	private Integer pageNum;
	private Integer pageSize;
	private Long productCategoryId;
	private String productSn;
	private Integer publishStatus;
	private Integer verifyStatus;
}
