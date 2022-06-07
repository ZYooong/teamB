package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class PmsProductLadder {
	private Double discount;//折扣
	private Integer count;//满足的商品数量
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Double price;//折后价格
	private Long productId;

	
}
