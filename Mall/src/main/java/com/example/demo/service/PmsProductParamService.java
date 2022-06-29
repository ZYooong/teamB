package com.example.demo.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
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
import com.example.demo.model.request.PmsProductParam;
import com.example.demo.repository.CmsPrefrenceAreaProductRelationRepository;
import com.example.demo.repository.CmsSubjectProductRelationRepository;
import com.example.demo.repository.PmsMemberPriceRepository;
import com.example.demo.repository.PmsProductAttributeValueRepository;
import com.example.demo.repository.PmsProductFullReductionRepository;
import com.example.demo.repository.PmsProductLadderRepository;
import com.example.demo.repository.PmsProductRepository;
import com.example.demo.repository.PmsSkuStockRepository;

@Service
public class PmsProductParamService {
	@Autowired
	private PmsProductRepository pmsProductRepository;
	@Autowired
	private PmsMemberPriceRepository pmsMemberPriceRepository;
	@Autowired
	private CmsPrefrenceAreaProductRelationRepository pmsPrefrenceAreaProductRelationRepository;
	@Autowired
	private PmsProductAttributeValueRepository pmsProductAttributeValueRepository;
	@Autowired
	private PmsProductFullReductionRepository pmsProductFullReductionRepository;
	@Autowired
	private PmsProductLadderRepository pmsProductLadderRepository;
	@Autowired
	private PmsSkuStockRepository pmsSkuStockRepository;
	@Autowired
	private CmsSubjectProductRelationRepository pmsSubjectProductRelationRepository;

	// @Transactional(rollbackOn = Exception.class)//保证所有数据一次性执行成功，如果执行中出错的话进行回滚
	public void create(PmsProductParam productParam) {// 向数据库存储数据
		PmsProduct pmsProduct = new PmsProduct();//

		BeanUtils.copyProperties(productParam, pmsProduct);
		pmsProductRepository.save(pmsProduct);

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
		List<PmsProductLadder> productLadderList = productParam.getProductLadderList();
		if (productLadderList != null) {
			for (PmsProductLadder pmsProductLadder : productLadderList) {
				pmsProductLadderRepository.saveAndFlush(pmsProductLadder);
			}
		}
		List<PmsSkuStock> skuStockList = productParam.getSkuStockList();
		if (skuStockList != null) {
			for (PmsSkuStock pmsSkuStock : skuStockList) {
				pmsSkuStockRepository.saveAndFlush(pmsSkuStock);
			}
		}
		List<CmsSubjectProductRelation> subjectProductRelationList = productParam.getSubjectProductRelationList();
		if (skuStockList != null) {
			for (CmsSubjectProductRelation pmsSubjectProductRelation : subjectProductRelationList) {
				pmsSubjectProductRelationRepository.saveAndFlush(pmsSubjectProductRelation);
			}
		}
	}

//	public List<PmsProduct> search() {
//
//		return pmsProductRepository.findAll();
//
//	}
	

}
