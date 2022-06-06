package com.example.demo.model;

import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Entity
//优选专区和商品的关系

public class CmsPrefrenceAreaProductRelation {
	private Long id;
	private Long prefrenceAreaId;
	private Long productId;
}
