package com.septa.Ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.septa.Ecommerce.model.OrderItem;
import com.septa.Ecommerce.repository.OrderItemRepository;

        import java.util.List;
import java.util.Optional;

@Service
public class OrderItemService {
    private final OrderItemRepository orderItemRepository;

    @Autowired
    public OrderItemService(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    public List<OrderItem> getAllOrderItems() {
        return orderItemRepository.findAll();
    }

    //public OrderItem getOrderItemById(OrderItemId orderItemId) {
      //  return orderItemRepository.findById(orderItemId)
           //     .orElseThrow(() -> new OrderItemNotFoundException("OrderItem not found with id: " + orderItemId));
    //}

    public Optional<OrderItem> getOrderItemById(Long orderId) {
        return orderItemRepository.findById(orderId);
    }

    public OrderItem createOrderItem(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

}

