package com.example.demo.model;

import java.util.Iterator;

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
public class PmsMemberPrice {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long memberLevelId;
	private String memberLevelName;
	private Double memberPrice;//会员价格
	private Long productId;	
}
