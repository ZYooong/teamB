package com.example.demo.model;

import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PmsProductFullReduction {
	private Double fullPrice;
	private Long id;
	private Long productId;
	private Double reducePrice;
	
}
