package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class PmsProductCategoryWithChildrenItem {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long parentId;//父分类的编号
	private String description;//	描述
	private String icon	;//图标
	private String keywords	;//关键字
	private String name;//商品分类名称
	private Integer navStatus;//是否在导航栏显示($int32)
	private String productUnit;//分类单位
	private Integer showStatus;//($int32)是否进行显示
	private Integer sort;//($int32)排序	
	List< PmsProductCategory> children;
}
