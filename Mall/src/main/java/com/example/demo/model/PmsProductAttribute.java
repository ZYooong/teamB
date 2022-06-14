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
@SuperBuilder
public class PmsProductAttribute {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;//($int64)
	private Integer filterType;//($int32)分类筛选样式：1->普通；1->颜色
	private Integer handAddStatus;//($int32)是否支持手动新增；0->不支持；1->支持
	private String inputList;//可选值列表，以逗号隔开
	private Integer inputType;//($int32)属性录入方式：0->手工录入；1->从列表中选取
	private String name;
	private Long productAttributeCategoryId;//($int64)
	private Integer relatedStatus;//($int32)相同属性产品是否关联；0->不关联；1->关联
	private Integer searchType;//($int32)检索类型；0->不需要进行检索；1->关键字检索；2->范围检索
	private Integer selectType;//($int32)属性选择类型：0->唯一；1->单选；2->多选
	private Integer sort;//($int32)排序字段：最高的可以单独上传图片
	private Integer type;//($int32)属性的类型；0->规格；1->参数
}
