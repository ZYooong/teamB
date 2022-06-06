package com.example.demo.model;

import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PmsMemberPrice {
	
	private Long id;
	private Long memberLevelId;
	private String memberLevelName;
	private Double memberPrice;//会员价格
	private Long productId;

	
}
