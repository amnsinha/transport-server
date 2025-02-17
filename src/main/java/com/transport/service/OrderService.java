package com.transport.service;

import com.transport.entitiy.Order;
import com.transport.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    public Order createOrder(Order order) {
        order.setStatus("Pending");
        return orderRepository.save(order);
    }

    public Order updateOrder(Long id, Order updatedOrder) {
        return orderRepository.findById(id).map(order -> {
            order.setClientName(updatedOrder.getClientName());
            order.setOrigin(updatedOrder.getOrigin());
            order.setDestination(updatedOrder.getDestination());
            order.setFreightWeight(updatedOrder.getFreightWeight());
            order.setAssignedTruck(updatedOrder.getAssignedTruck());
            order.setAssignedDriver(updatedOrder.getAssignedDriver());
            order.setStatus(updatedOrder.getStatus());
            return orderRepository.save(order);
        }).orElseThrow(() -> new RuntimeException("Order not found with ID: " + id));
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}