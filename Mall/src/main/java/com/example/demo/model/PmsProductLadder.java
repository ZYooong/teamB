package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@SuperBuilder
public class PmsProductLadder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Double discount;//折扣
	private Integer count;//满足的商品数量
	private Double price;//折后价格
	private Long productId;

	
}
