package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
//优选专区和商品的关系

public class CmsPrefrenceAreaProductRelation {
	private Long id;
	private Long prefrenceAreaId;
	private Long productId;
}
