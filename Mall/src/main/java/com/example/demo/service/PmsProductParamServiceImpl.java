package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;
import com.example.demo.model.request.ProductParam;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CmsPrefrenceAreaProductRelation;
import com.example.demo.model.CmsSubjectProductRelation;
import com.example.demo.model.PmsMemberPrice;
import com.example.demo.model.PmsProduct;
import com.example.demo.model.PmsProductAttributeValue;
import com.example.demo.model.PmsProductFullReduction;
import com.example.demo.model.PmsProductLadder;
import com.example.demo.model.PmsSkuStock;
import com.example.demo.repository.CmsPrefrenceAreaProductRelationRepository;
import com.example.demo.repository.CmsSubjectProductRelationRepository;
import com.example.demo.repository.PmsMemberPriceRepository;
import com.example.demo.repository.PmsProductAttributeValueRepository;
import com.example.demo.repository.PmsProductFullReductionRepository;
import com.example.demo.repository.PmsProductLadderRepository;
import com.example.demo.repository.PmsProductRepository;
import com.example.demo.repository.PmsSkuStockRepository;

import com.example.demo.model.PmsProductParam;

@Service
public class PmsProductParamServiceImpl implements PmsProductParamService {
	@Autowired
	PmsProductRepository pmsProductRepository;
	@Autowired
	PmsMemberPriceRepository pmsMemberPriceRepository;
	@Autowired
	CmsPrefrenceAreaProductRelationRepository pmsPrefrenceAreaProductRelationRepository;
	@Autowired
	PmsProductAttributeValueRepository pmsProductAttributeValueRepository;
	@Autowired
	PmsProductFullReductionRepository pmsProductFullReductionRepository;
	@Autowired
	PmsProductLadderRepository pmsProductLadderRepository;
	@Autowired
	PmsSkuStockRepository pmsSkuStockRepository;
	@Autowired
	CmsSubjectProductRelationRepository pmsSubjectProductRelationRepository;
	
	@Transactional(rollbackOn = Exception.class)//保证所有数据一次性执行成功，如果执行中出错的话进行回滚
	@Override
	public void create(ProductParam productParam) {//向数据库存储数据
		PmsProduct pmsProduct = new PmsProduct();
		pmsProduct.setId(productParam.getId());
		pmsProduct.setAlbumPics(productParam.getAlbumPics());
		pmsProduct.setBrandId(productParam.getBrandId());
		pmsProduct.setBrandName(productParam.getBrandName());
		pmsProduct.setDeleteStatus(productParam.getDeleteStatus());
		pmsProduct.setDescription(productParam.getDescription());
		pmsProduct.setDetailDesc(productParam.getDetailDesc());
		pmsProduct.setDetailHtml(productParam.getDetailHtml());
		pmsProduct.setDetailMobileHtml(productParam.getDetailMobileHtml());
		pmsProduct.setDetailTitle(productParam.getDetailTitle());
		pmsProduct.setFeightTemplateId(productParam.getFeightTemplateId());
		pmsProduct.setGiftGrowth(productParam.getGiftGrowth());
		pmsProduct.setGiftPoint(productParam.getGiftPoint());
		pmsProduct.setKeywords(productParam.getKeywords());
		pmsProduct.setLowStock(productParam.getLowStock());
		pmsProduct.setName(productParam.getName());
		pmsProduct.setNewStatus(productParam.getNewStatus());
		pmsProduct.setNote(productParam.getNote());
		pmsProduct.setOriginalPrice(productParam.getOriginalPrice());
		pmsProduct.setPic(productParam.getPic());
		pmsProduct.setPreviewStatus(productParam.getPreviewStatus());
		pmsProduct.setPrice(productParam.getPrice());
		pmsProduct.setProductAttributeCategoryId(productParam.getProductAttributeCategoryId());
		pmsProduct.setProductCategoryId(productParam.getProductCategoryId());
		pmsProduct.setProductCategoryName(productParam.getProductCategoryName());
		pmsProduct.setProductSn(productParam.getProductSn());
		pmsProduct.setPromotionEndTime(productParam.getPromotionEndTime());
		pmsProduct.setPromotionPerLimit(productParam.getPromotionPerLimit());
		pmsProduct.setPromotionPrice(productParam.getPromotionPrice());
		pmsProduct.setPromotionStartTime(productParam.getPromotionStartTime());
		pmsProduct.setPromotionType(productParam.getPromotionType());
		pmsProduct.setPublishStatus(productParam.getPublishStatus());
		pmsProduct.setRecommandStatus(productParam.getRecommandStatus());
		pmsProduct.setSale(productParam.getSale());
		pmsProduct.setServiceIds(productParam.getServiceIds());
		pmsProduct.setSort(productParam.getSort());
		pmsProduct.setStock(productParam.getStock());
		pmsProduct.setSubTitle(productParam.getSubTitle());
		pmsProduct.setUnit(productParam.getUnit());
		pmsProduct.setUsePointLimit(productParam.getUsePointLimit());
		pmsProduct.setVerifyStatus(productParam.getVerifyStatus());
		pmsProduct.setWeight(productParam.getWeight());
		pmsProductRepository.saveAndFlush(pmsProduct);

		List<PmsMemberPrice> memberPriceList = productParam.getMemberPriceList();
		if (memberPriceList != null) {
			for (PmsMemberPrice pmsMemberPrice : memberPriceList) {
				pmsMemberPriceRepository.saveAndFlush(pmsMemberPrice);
			}
		}
		List<PmsProductAttributeValue> productAttributeValueList = productParam.getProductAttributeValueList();
		if (memberPriceList != null) {
			for (PmsProductAttributeValue pmsProductAttributeValue : productAttributeValueList) {
				pmsProductAttributeValueRepository.saveAndFlush(pmsProductAttributeValue);
			}
		}
		List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList = productParam
				.getPrefrenceAreaProductRelationList();
		if (prefrenceAreaProductRelationList != null) {
			for (CmsPrefrenceAreaProductRelation pmsPrefrenceAreaProductRelation : prefrenceAreaProductRelationList) {
				pmsPrefrenceAreaProductRelationRepository.saveAndFlush(pmsPrefrenceAreaProductRelation);
			}
		}
		List<PmsProductFullReduction> productFullReductionList = productParam.getProductFullReductionList();
		if (productFullReductionList != null) {
			for (PmsProductFullReduction pmsProductFullReduction : productFullReductionList) {
				pmsProductFullReductionRepository.saveAndFlush(pmsProductFullReduction);
			}
		}
		List<PmsProductLadder>productLadderList = productParam.getProductLadderList();
		if (productLadderList != null) {
			for (PmsProductLadder pmsProductLadder : productLadderList) {
				pmsProductLadderRepository.saveAndFlush(pmsProductLadder);
			}
		}
		List<PmsSkuStock>skuStockList = productParam.getSkuStockList();
		if (skuStockList != null) {
			for (PmsSkuStock pmsSkuStock : skuStockList) {
				pmsSkuStockRepository.saveAndFlush(pmsSkuStock);
			}
		}
		List<CmsSubjectProductRelation>subjectProductRelationList = productParam.getSubjectProductRelationList();
		if (skuStockList != null) {
			for (CmsSubjectProductRelation pmsSubjectProductRelation : subjectProductRelationList) {
				pmsSubjectProductRelationRepository.saveAndFlush(pmsSubjectProductRelation);
			}
		}
	}

}
