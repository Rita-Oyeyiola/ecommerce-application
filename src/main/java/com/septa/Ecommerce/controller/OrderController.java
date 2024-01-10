package com.septa.Ecommerce.controller;

import com.septa.Ecommerce.dto.OrderDTO;
import com.septa.Ecommerce.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @PostMapping("")
    public Object createOrder(OrderDTO orderDTO){
        return orderService.createOrder(orderDTO);
    }

    @GetMapping("")
    public Object getAllProduct() {return orderService.getAllOrder();}

    @GetMapping("/{id}")
    public Object getProductById(@PathVariable Long id)
    {return orderService.getOrderById(id);}



}
