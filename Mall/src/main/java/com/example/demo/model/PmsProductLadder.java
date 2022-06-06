package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PmsProductLadder {
	private Double discount;//折扣
	private Integer count;//满足的商品数量
	private Long id;
	private Double price;//折后价格
	private Long productId;

	
}
