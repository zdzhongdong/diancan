package com.lovo.diancan.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lovo.diancan.entity.OrderEntity;

@Service
public interface OrderService {

	public int addOrder(OrderEntity order);
	public int delOrder(String id);
	public int updateOrder(String id,String buyerNamem,String buyerTel,String buyerAddress,
			String buyerOpenId,BigDecimal orderMoney,String orderStatus,String payStatus);
	public List<OrderEntity> findAll();
	public OrderEntity findOne(String orderId);
	public List<OrderEntity> findByItem(String buyerName,String orderStatus,String payStatus);
}
