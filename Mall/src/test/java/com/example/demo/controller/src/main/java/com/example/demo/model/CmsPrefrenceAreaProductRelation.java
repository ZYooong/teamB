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
<<<<<<< HEAD
=======
@SuperBuilder

>>>>>>> refs/heads/main
//优选专区和商品的关系
public class CmsPrefrenceAreaProductRelation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long prefrenceAreaId;
	private Long productId;
}
