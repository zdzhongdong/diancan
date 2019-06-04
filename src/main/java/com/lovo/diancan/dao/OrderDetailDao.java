package com.lovo.diancan.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lovo.diancan.entity.OrderDetailEntity;
@Repository
public interface OrderDetailDao extends CrudRepository<OrderDetailEntity, String> {

}
