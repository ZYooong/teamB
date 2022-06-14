package com.example.demo.model.responses;

import java.util.List;
import com.example.demo.model.PmsProduct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class CommonPage {
	private Integer pageNum;//($int32)
	private Integer pageSize;//($int32)
	private Long total;//($int64)
	private Integer totalPage;//($int32)
	private List<PmsProduct> pmsProductList;
}
