package com.lovo.diancan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lovo.diancan.entity.ProductEntity;
@Repository
public interface ProductDao extends JpaRepository<ProductEntity, String> {

}
