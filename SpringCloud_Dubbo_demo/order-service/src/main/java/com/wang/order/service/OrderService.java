package com.wang.order.service;


import com.wang.dubbo.domain.Order;

public interface OrderService {

    Order queryOrderById(Long orderId);
}
