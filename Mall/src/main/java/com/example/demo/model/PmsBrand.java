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
public class PmsBrand {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;//($int64)
	private String bigPic;//专区大图
	private String brandStory;//品牌故事
	private Integer factoryStatus;//($int32)是否为品牌制造商：0->不是；1->是
	private String firstLetter;//首字母
	private String logo;//品牌logo
	private String name;
	private Integer productCommentCount;//($int32)产品评论数量
	private Integer productCount;//($int32)产品数量
	private Integer showStatus;//($int32)
	private Integer sort;//($int32)
}
