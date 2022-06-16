package com.example.demo.model.request;

import java.util.List;

import com.example.demo.model.PmsMemberPrice;

public class PmsProductCategoryParam {
	private Long parentId;//父分类的编号
	private String stringdescription;//	描述
	private String icon	;//图标
	private String keywords	;//关键字
	private String name;//商品分类名称
	private Integer navStatus;//是否在导航栏显示($int32)
//	private List<PmsMemberPrice> productAttributeIdList;
	private String productUnit;//分类单位
	private Integer showStatus;//($int32)是否进行显示
	private Integer sort;//($int32)排序
	
}
