package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PmsSkuStock {
	private Long id;//($int64)
	private Integer lockStock;//($int32)锁定库存
	private Integer lowStock;//($int32)预警库存
	private String pic;//展示图片
	private Double price;
	private Long productId;//($int64)
	private Double promotionPrice;//单品促销价格
	private Integer sale;//销量
	private String skuCode;//sku编码
	private String spData;//商品销售属性，json格式
	private Integer stock;//($int32)库存

}
