package com.dishant.productgeneralinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dishant.productgeneralinfo.entity.Product;

@Repository
public interface ProductInfoRepository extends JpaRepository<Product, Long> {

	Product findByProductId(Long userId);

}
