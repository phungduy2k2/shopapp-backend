package com.example.shoppappspring.services;

import com.example.shoppappspring.dtos.OrderDetailDTO;
import com.example.shoppappspring.exceptions.DataNotFoundException;
import com.example.shoppappspring.models.OrderDetail;

import java.util.List;

public interface IOrderDetailService {
    OrderDetail createOrderDetail(OrderDetailDTO orderDetailDTO) throws Exception;
    OrderDetail getOrderDetail(Long id) throws DataNotFoundException;
    OrderDetail updateOrderDetail(Long id, OrderDetailDTO orderDetailDTO) throws DataNotFoundException;
    void deleteById(Long id);
    List<OrderDetail> findByOrderId(Long orderId);

}
