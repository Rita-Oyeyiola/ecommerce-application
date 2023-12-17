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
    public Object CreateOrder (OrderDTO orderDTO){
        return orderService.CreateOrder(orderDTO);
    }

    @GetMapping("")
    public Object GetAllProduct() {return orderService.GetAllOrder();}

    @GetMapping("/{id}")
    public Object GetProductById(@PathVariable Long id)
    {return orderService.GetOrderById(id);}



}
