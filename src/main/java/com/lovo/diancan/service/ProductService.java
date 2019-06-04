package com.lovo.diancan.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lovo.diancan.entity.ProductEntity;

@Service
public interface ProductService {

	public int addProduct(ProductEntity pro);
	public int delProduct(String id);
	public int updateProduct(Integer id,String pName,BigDecimal pPrice,int pStock,
			String pDescription,String Pimg,int categoryType);
	public List<ProductEntity> findAll();
	public List<ProductEntity> findByType(int categoryType);
	public ProductEntity findOne(String id);
}
