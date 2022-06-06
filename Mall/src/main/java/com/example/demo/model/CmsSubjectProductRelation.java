package com.example.demo.model;

import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CmsSubjectProductRelation {
	private Long id;//($int64)
	private Long productId;//($int64)
	private Long subjectId;//integer($int64)
}
