package com.example.demo.model.responses;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class CommonPage<T> {
	private List<T>list;
	private Integer pageNum;//($int32)
	private Integer pageSize;//($int32)
	private Long total;//($int64)
	private Integer totalPage;//($int32)
	
}
