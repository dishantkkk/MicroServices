package com.dishant.productgeneralinfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.dishant.productgeneralinfo.entity.Product;
import com.dishant.productgeneralinfo.repository.ProductInfoRepository;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class ProductInfoService {
	@Autowired
	private ProductInfoRepository productInfoRepository;

	public Product saveProductInfo(Product product) {
		log.info("Inside saveProductInfo of ProductInfoService");
		return productInfoRepository.save(product);
	}

	public Product findByProductId(Long productId) {
		log.info("Inside saveProductInfo of ProductInfoService");
		return productInfoRepository.findByProductId(productId);
	}

}
