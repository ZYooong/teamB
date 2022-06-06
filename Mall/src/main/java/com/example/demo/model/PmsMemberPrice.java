package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PmsMemberPrice {
	
	private Long id;
	private Long memberLevelId;
	private String memberLevelName;
	private Double memberPrice;//会员价格
	private Long productId;

	
}
