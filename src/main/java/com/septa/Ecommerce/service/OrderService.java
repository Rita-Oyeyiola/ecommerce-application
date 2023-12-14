package com.septa.Ecommerce.service;

import com.septa.Ecommerce.dto.OrderDTO;
import com.septa.Ecommerce.model.Order;
import com.septa.Ecommerce.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class OrderService {

        private final OrderRepository orderRepository;

        public OrderService (OrderRepository orderRepository) {
            this.orderRepository = orderRepository;
        }

        public Object CreateOrder (OrderDTO orderDTO){
            Order order = new Order();

            order.setTotalAmount(orderDTO.getTotalAmount());
            //order.setOrderItems(orderDTO.getOrderItems());

            return orderRepository.save(order);
        }

        public Object GetAllOrder() {return orderRepository.findAll();}

        public Object GetOrderById(Long id) {return orderRepository.findById(id);}
}
