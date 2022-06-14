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
<<<<<<< HEAD
=======
@SuperBuilder
>>>>>>> refs/heads/main
public class PmsSkuStock {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
