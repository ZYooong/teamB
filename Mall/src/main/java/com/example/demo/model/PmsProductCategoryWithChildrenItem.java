package com.example.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
//@Table(name = "PmsProductCategoryWithChildrenItem", schema = "public")
public class PmsProductCategoryWithChildrenItem {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long  id;
	@Column(name = "parentId")
	private Long parentId;//父分类的编号
	@Column(name = "description")
	private String description;//	描述
	@Column(name = "icon	")
	private String icon	;//图标
	@Column(name = "keywords")
	private String keywords	;//关键字
	@Column(name = "name")
	private String name;//商品分类名称
	@Column(name = "navStatus")
	private Integer navStatus;//是否在导航栏显示($int32)
	@Column(name = "productUnit")
	private String productUnit;//分类单位
	@Column(name = "showStatus")
	private Integer showStatus;//($int32)是否进行显示
	@Column(name = "sort")
	private Integer sort;//($int32)排序	
	@Column(name = "productCount")
	private Integer productCount;
	@Column(name = "level")
	private Integer level;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "parent")
	@JsonManagedReference
	private List<PmsProductCategory> children;

}
