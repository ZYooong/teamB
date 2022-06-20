package com.example.demo.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.terasoluna.gfw.common.query.QueryEscapeUtils;

import com.example.demo.model.PmsProduct;

@Repository
public class ListProductRepository  {
	  @PersistenceContext
	    EntityManager entityManager; // 
	public List<PmsProduct> searchPmsProductList(int brandId, String keyword, 
									int productCategoryId, String productSn, 
									int publishStatus, int verifyStatus){

        //条件とパラメーター変数
        List<String> andConditions = new ArrayList<String>();
        Map<String, Object> bindParameters = new HashMap<String, Object>();

        // 条件とパラメーターを設定
        if (brandId != 0) {
            andConditions.add("p.brandId = :brandId");
            bindParameters.put("brandId", brandId);
        }
        if (keyword != null && !"".equals(keyword)) {
            andConditions.add("p.name LIKE :keyword");
            bindParameters.put("keyword", QueryEscapeUtils
                    .toLikeCondition(keyword));
        }
        if (productCategoryId != 0) {
            andConditions.add("p.productCategoryId = :productCategoryId");
            bindParameters.put("productCategoryId", productCategoryId);
        }
        if (productSn != null && !"".equals(productSn)) {
            andConditions.add("p.name LIKE :productSn");
            bindParameters.put("productSn", QueryEscapeUtils
                    .toLikeCondition(productSn));
        }
        if (publishStatus != 0) {
            andConditions.add("p.publishStatus = :publishStatus");
            bindParameters.put("publishStatus", publishStatus);
        }
        if (verifyStatus != 0) {
            andConditions.add("p.verifyStatus = :verifyStatus");
            bindParameters.put("verifyStatus", verifyStatus);
        }
        
        // 条件無い場合、emptyListを戻す
        if (andConditions.isEmpty()) {
            return Collections.emptyList();
        }

        // JPQL文用StringBuilder
        final StringBuilder queryString = new StringBuilder();

        // JPQL文（※ JPA専用SQL文、普通のSQL文と少し違う）
        queryString.append("SELECT p FROM PmsProduct p");

        // 条件をJPQLに追加
        Iterator<String> andConditionsIt = andConditions.iterator();
        if (andConditionsIt.hasNext()) {
            queryString.append(" WHERE ").append(andConditionsIt.next());
        }
        while (andConditionsIt.hasNext()) {
            queryString.append(" AND ").append(andConditionsIt.next());
        }

//        // ソートはある場合、ORDER BYを追加
//        queryString.append(" ORDER BY p.brandId");

        // findQueryを作成
        final TypedQuery<PmsProduct> findQuery = entityManager.createQuery(
                queryString.toString(), PmsProduct.class);
        // パラメーターをバインディング
        for (Map.Entry<String, Object> bindParameter : bindParameters
                .entrySet()) {
            findQuery.setParameter(bindParameter.getKey(), bindParameter
                    .getValue());
        }

        // findQueryを実行し結果を戻す
        return findQuery.getResultList();
	}

}
