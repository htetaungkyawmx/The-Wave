package com.solt.thewave.service.Impl;

import com.solt.thewave.entities.OrderDetail;
import com.solt.thewave.repository.OrderRepository;
import com.solt.thewave.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public OrderDetail create(OrderDetail order) {
        return orderRepository.save(order);
    }
}
