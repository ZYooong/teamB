package com.example.demo.model;

import java.util.List;

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
public class CommonPage {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pageNum;//($int32)
	private Integer pageSize;//($int32)
	private Long total;//($int64)
	private Integer totalPage;//($int32)
	//private List<PmsProduct> pmsProductList;
}
