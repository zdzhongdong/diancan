package com.lovo.diancan.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lovo.diancan.entity.OrderDetailEntity;

@Service
public interface OrderDetailService {

	public int addOrderDetail(OrderDetailEntity od);
	public int delOrderDetail(String detailId,String orderid,String productId);
	public int updateOrderDetail(String detailId,int productNum);
	public List<OrderDetailEntity> findAll();
	public List<OrderDetailEntity> findByOrderId(String orderId);
	public OrderDetailEntity findOneByDetailId(String detailId);
}
