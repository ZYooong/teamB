package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.model.PmsBrand;
import com.example.demo.model.request.PmsBrandParam;
import com.example.demo.model.responses.CommonPage;
import com.example.demo.repository.PmsBrandRepository;

@Service
public class PmsBrandService {
	@Autowired
	private PmsBrandRepository pmsBrandRepository;

	public void create(PmsBrandParam pmsBrandParam) {
	}

//	public CommonPage<PmsBrand> search(Integer pageSize ,Integer pageNum ) {
//	long pmsBrandCount = pmsBrandRepository.count();
//	Long totalCount = pmsBrandCount;// 总个数
//	Integer total = totalCount.intValue();
//	Integer result = total % pageSize;
//	// 总页数
//	Integer totalPage = (Integer) (result > 0 ? // 如果取模大于0说明总个数和每页显示个数整除后需要加一页
//			total / pageSize + 1 : total / pageSize);
//
//	CommonPage<PmsBrand> commonpage = new CommonPage<PmsBrand>(
//			pmsBrandRepository.findRequiredBrands((pageNum - 1) * pageSize, pageSize), pageNum, pageSize,
//			(long) total, totalPage);
//
//	return commonpage;
//
//}


	public CommonPage<PmsBrand> search(Integer pageNum, Integer pageSize, String keyword) {
		
		CommonPage<PmsBrand> commonPage;
		Pageable pageable = PageRequest.of(pageNum - 1, pageSize);
		List<PmsBrand> brandsList;
		Page<PmsBrand> brands;

		if (keyword == null) {
			brands = pmsBrandRepository.findAll(pageable);
		} else {
			brands = pmsBrandRepository.findByNameLike(pageable, ("%" + keyword + "%"));
		}
		brandsList = brands.getContent();

		commonPage = new CommonPage<PmsBrand>(brandsList, pageNum, pageSize, brands.getTotalElements(),
				brands.getTotalPages());
		return commonPage;
	}

}
