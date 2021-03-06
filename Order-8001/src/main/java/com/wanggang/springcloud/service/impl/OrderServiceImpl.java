package com.wanggang.springcloud.service.impl;

import com.wanggang.springcloud.dao.OrderDao;
import com.wanggang.springcloud.entity.Order;
import com.wanggang.springcloud.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName : OrderServiceImpl
 * @Description :
 * @Author : wanggang
 * @Date: 2020-09-21 18:37
 * @Version 1.0
 **/
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Override
    public int createOrderInfo(Order order) {
        return 0;
    }

    @Override
    public void deleteOrderInfoById(long id) {

    }

    @Override
    public int updateOrderInfoById(Order order) {
        return 0;
    }

    @Override
    public Order getOrderInfoById(long id) {
        return this.orderDao.getOrderInfoById(id);
    }
}
