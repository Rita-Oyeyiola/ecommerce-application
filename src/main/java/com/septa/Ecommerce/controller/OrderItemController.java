package com.septa.Ecommerce.controller;

import com.septa.Ecommerce.model.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.HttpStatus;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.*;
import com.septa.Ecommerce.service.OrderItemService;
import java.util.List;

@RestController
@RequestMapping("/api/order-items")
public class OrderItemController {
    private final OrderItemService orderItemService;

    @Autowired
    public OrderItemController(OrderItemService orderItemService) {
        this.orderItemService = orderItemService;
    }

    @GetMapping
    public List<OrderItem> getAllOrderItems() {
        return orderItemService.getAllOrderItems();
    }

    //@GetMapping("/{orderId}/{productId}")
    //public ResponseEntity<OrderItem> getOrderItemById(@PathVariable Long orderId, @PathVariable Long productId) {
    //    OrderItemId orderItemId = new OrderItemId(orderId, productId);
   //     OrderItem orderItem = orderItemService.getOrderItemById(orderItemId);
    //    return new ResponseEntity<>(orderItem, HttpStatus.OK);
    //}

   //@GetMapping("/{id}")
    //public ResponseEntity<Customer> getOrderItemById(@PathVariable Long id) {
      //Optional<OrderItem> orderItem = orderItemService.getOrderItemById(id);
      // return orderItem.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
      //         .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    //}

    @GetMapping("/get/{id}")
   public Object GetOrderItemById(@PathVariable Long id)
    {return orderItemService.getOrderItemById(id);}

    @PostMapping
    public ResponseEntity<OrderItem> createOrderItem(@RequestBody OrderItem orderItem) {
        OrderItem createdOrderItem = orderItemService.createOrderItem(orderItem);
        return new ResponseEntity<>(createdOrderItem, HttpStatus.CREATED);
    }

}


