package com.septa.Ecommerce.Controller;

import com.septa.Ecommerce.dto.OrderDTO;
import com.septa.Ecommerce.dto.ProductDTO;
import com.septa.Ecommerce.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @PostMapping("/create")
    public Object CreateOrder (OrderDTO orderDTO){
        return orderService.CreateOrder(orderDTO);
    }

    @GetMapping("/get")
    public Object GetAllProduct() {return orderService.GetAllOrder();}

    @GetMapping("/get/{id}")
    public Object GetProductById(@PathVariable Long id)
    {return orderService.GetOrderById(id);}



}
