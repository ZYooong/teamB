package com.example.demo.model;

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

public class PmsMemberPrice {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long memberLevelId;
	private String memberLevelName;
	private Double memberPrice;//会员价格
	private Long productId;

	
}
