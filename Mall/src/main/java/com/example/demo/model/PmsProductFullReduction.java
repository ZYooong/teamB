package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PmsProductFullReduction {
	private Double fullPrice;
	private Long id;
	private Long productId;
	private Double reducePrice;
	
}
