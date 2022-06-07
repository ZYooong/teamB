package com.example.demo.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class PmsProduct {
	private String albumPics;//画册图片，连产品图片限制为5张，以逗号分割
	private Long brandId;//($int64)
	private String brandName;//品牌名称
	private Integer deleteStatus;//($int32)删除状态：0->未删除；1->已删除
	private String description;//商品描述
	private String detailDesc;
	private String detailHtml;//产品详情网页内容
	private String detailMobileHtml;//移动端网页详情
	private String detailTitle;
	private Long feightTemplateId;//($int64)
	private Integer giftGrowth;//($int32)赠送的成长值
	private Integer giftPoint;//($int32)赠送的积分
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;//($int64)
	private String keywords;
	private Integer lowStock;//($int32)库存预警值
	private String name;
	private Integer newStatus;//($int32)新品状态:0->不是新品；1->新品
	private String note;
	private Double originalPrice;//市场价
	private String pic;
	private Integer previewStatus;//($int32)是否为预告商品：0->不是；1->是
	private Double price;
	private Long productAttributeCategoryId;//($int64)
	private Long productCategoryId;//($int64)
	private String productCategoryName;//商品分类名称
	private String productSn;//货号
	private String promotionEndTime;//($date-time)促销结束时间
	private Integer promotionPerLimit;//($int32)活动限购数量
	private Double promotionPrice;//促销价格
	private String promotionStartTime;//($date-time)促销开始时间
	private Integer promotionType;//($int32)促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购
	private Integer publishStatus;//($int32)上架状态：0->下架；1->上架
	private Integer recommandStatus;//($int32)推荐状态；0->不推荐；1->推荐
	private Integer sale;//($int32)销量
	private String serviceIds;//以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮
	private Integer sort;//($int32)排序
	private Integer stock;//($int32)库存
	private String subTitle;//副标题
	private String unit;//单位
	private Integer usePointLimit;//($int32)限制使用的积分数
	private Integer verifyStatus;//($int32)审核状态：0->未审核；1->审核通过
	private Double weight;//商品重量，默认为克
}
