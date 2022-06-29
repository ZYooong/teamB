package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@SuperBuilder
//优选专区和商品的关系
//@Table(name = "CmsPrefrenceAreaProductRelation", schema = "public")
public class CmsPrefrenceAreaProductRelation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	@Column(name = "prefrenceAreaId")
	private Long prefrenceAreaId;
	@Column(name = "productId")
	private Long productId;
}
