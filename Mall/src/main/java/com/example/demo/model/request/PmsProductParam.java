package com.example.demo.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
<<<<<<< HEAD
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.example.demo.model.CmsPrefrenceAreaProductRelation;
import com.example.demo.model.CmsSubjectProductRelation;
import com.example.demo.model.PmsMemberPrice;
import com.example.demo.model.PmsProductAttributeValue;
import com.example.demo.model.PmsProductFullReduction;
import com.example.demo.model.PmsProductLadder;
import com.example.demo.model.PmsSkuStock;

@NoArgsConstructor
@AllArgsConstructor
@Data
=======
import lombok.experimental.SuperBuilder;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.demo.model.CmsPrefrenceAreaProductRelation;
import com.example.demo.model.CmsSubjectProductRelation;
import com.example.demo.model.PmsMemberPrice;
import com.example.demo.model.PmsProductAttributeValue;
import com.example.demo.model.PmsProductFullReduction;
import com.example.demo.model.PmsProductLadder;
import com.example.demo.model.PmsSkuStock;
@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
>>>>>>> refs/heads/main
public class PmsProductParam {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String albumPics;// 画册图片，连产品图片限制为5张，以逗号分割
	private Long brandId;
	private String brandName;// 品牌名称
	private Integer deleteStatus;// 删除状态：0->未删除；1->已删除
	private String description;// 商品描述
	private String detailDesc;
	private String detailHtml;// 产品详情网页内容
	private String detailMobileHtml;// 移动端网页详情
	private String detailTitle;
	private Long feightTemplateId;
	private Integer giftGrowth;// 赠送的成长值
	private Integer giftPoint;// 赠送的积分
	private String keywords;
	private Integer lowStock;// 库存预警值
	private List<PmsMemberPrice> memberPriceList;
	private String name;
	private Integer newStatus;// 新品状态:0->不是新品；1->新品 ($int32)
	private String note;
	private Double originalPrice;// 市场价
	private String pic;
	private List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList;
	private List<PmsProductAttributeValue> productAttributeValueList;
	private Integer previewStatus;// 是否为预告商品：0->不是；1->是 ($int32)
	private Double price;
	private Long productAttributeCategoryId;// ($int64)
	private Long productCategoryId;// ($int649)
	private String productCategoryName;// 商品分类名称
	private List<PmsProductFullReduction> productFullReductionList;
	private List<PmsProductLadder> productLadderList;
	private String productSn; // 货号
	private String promotionEndTime;// 促销结束时间 ($date-time)
	private Integer promotionPerLimit;// 活动限购数量 ($int32)
	private Double promotionPrice;// 促销价格
	private String promotionStartTime;// 促销开始时间
	private Integer promotionType;// 促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购
	private Integer publishStatus;// 上架状态：0->下架；1->上架
	private Integer recommandStatus;// 推荐状态；0->不推荐；1->推荐
	private Integer sale;// 销量
	private String serviceIds;// 以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮
	private List<PmsSkuStock> skuStockList;
	private Integer sort;// 排序
	private Integer stock;// 库存
	private String subTitle;// 副标题
	private List<CmsSubjectProductRelation> subjectProductRelationList;
	private String unit;// 单位
	private Integer usePointLimit;// 限制使用的积分数
	private Integer verifyStatus;// 审核状态：0->未审核；1->审核通过
	private Double weight;// 商品重量，默认为克
}
