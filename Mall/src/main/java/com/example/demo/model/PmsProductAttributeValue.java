package com.example.demo.model;

import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PmsProductAttributeValue {
	private Long id;
	private Long productAttributeId;
	private Long productId;
	private String value;
} // 手动添加规格或参数的值,参数单值，规格有多个时以逗号隔开
