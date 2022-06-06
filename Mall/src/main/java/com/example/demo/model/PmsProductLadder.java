package com.example.demo.model;

import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PmsProductLadder {
	private Double discount;//折扣
	private Integer count;//满足的商品数量
	private Long id;
	private Double price;//折后价格
	private Long productId;

	
}
