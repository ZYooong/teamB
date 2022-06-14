package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity

public class CmsSubjectProductRelation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;//($int64)
	private Long productId;//($int64)
	private Long subjectId;//integer($int64)
}
