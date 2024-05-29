package com.example.shoppappspring.services;

import com.example.shoppappspring.dtos.OrderDTO;
import com.example.shoppappspring.exceptions.DataNotFoundException;
import com.example.shoppappspring.models.Order;

import java.util.List;

public interface IOrderService {
    Order createOrder(OrderDTO orderDTO) throws Exception;
    Order getOrder(Long id);
    Order updateOrder(Long id, OrderDTO orderDTO) throws DataNotFoundException;
    void deleteOrder(Long id);
    List<Order> findByUserId(Long userId);
}
