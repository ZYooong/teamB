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
public class PmsBrandParam {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String firstLetter;//品牌首字母
	private String bigPic;//品牌大图
	private String brandStory;//品牌故事
	private Integer factoryStatus;//($int32)是否为厂家制造商
	private String logo;//品牌logo
	private String name;//品牌名称
	private Integer showStatus;//($int32)是否进行显示
	private Integer sort;//($int32)排序字段
}
