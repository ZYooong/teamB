package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CmsSubjectProductRelation {
	private Long id;//($int64)
	private Long productId;//($int64)
	private Long subjectId;//integer($int64)
}
