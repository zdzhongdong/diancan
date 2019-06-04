package com.lovo.diancan.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.lovo.diancan.entity.OrderEntity;

@Component
public interface OrderDao extends CrudRepository<OrderEntity,String> {

}
