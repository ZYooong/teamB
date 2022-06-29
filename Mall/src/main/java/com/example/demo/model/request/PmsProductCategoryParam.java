package com.example.demo.model.request;

import lombok.Data;

@Data
public class PmsProductCategoryParam {
	private Long id;
	private Long parentId;// 父分类的编号
	private String description;// 描述
	private String icon;// 图标
	private String keywords;// 关键字
	private String name;// 商品分类名称
	private Integer navStatus;// 是否在导航栏显示($int32)
	private String productUnit;// 分类单位
	private Integer showStatus;// ($int32)是否进行显示
	private Integer sort;// ($int32)排序
	private Integer productCount;
	private Integer level;
}
