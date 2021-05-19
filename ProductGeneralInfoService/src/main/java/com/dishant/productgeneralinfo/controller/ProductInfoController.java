package com.dishant.productgeneralinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dishant.productgeneralinfo.entity.Product;
import com.dishant.productgeneralinfo.service.ProductInfoService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/product")
@Slf4j
public class ProductInfoController {
	@Autowired
	private ProductInfoService productInfoService;

	@PostMapping("/")
	public Product saveProductInfo(@RequestBody Product product) {
		log.info("Inside saveProductInfo of ProductInfoController");
		return productInfoService.saveProductInfo(product);
	}

	@GetMapping("/{id}")
	public Product findByProductId(@PathVariable("id") Long productId) {
		log.info("Inside findByProductId of ProductInfoController");
		return productInfoService.findByProductId(productId);
	}
}
