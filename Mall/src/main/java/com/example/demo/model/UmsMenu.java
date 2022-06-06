package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
public class UmsMenu implements Serializable {
	@Id
	private Long id;
	private Long parentId;
	private Date createTime;
	private String title;
	private Integer level;
	private Integer sort;
	private String name;
	private String icon;
	private Integer hidden;

	private static final long serialVersionUID = 1L;
}
