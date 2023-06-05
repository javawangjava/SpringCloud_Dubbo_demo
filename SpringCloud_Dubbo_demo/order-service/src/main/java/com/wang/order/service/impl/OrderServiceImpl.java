package com.wang.order.service.impl;


import com.wang.dubbo.domain.Order;
import com.wang.order.mapper.OrderMapper;
import com.wang.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        return orderMapper.findById(orderId);
    }
}
