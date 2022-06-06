package com.example.demo.creatModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor

//优选专区和商品的关系
public class CmsPrefrenceAreaProductRelation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long prefrenceAreaId;
	private Long productId;
}
