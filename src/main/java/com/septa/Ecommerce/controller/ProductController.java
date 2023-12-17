package com.septa.Ecommerce.controller;

import com.septa.Ecommerce.dto.ProductDTO;
import com.septa.Ecommerce.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping("")
    public Object CreateProduct (ProductDTO productDTO){
        return productService.CreateProduct(productDTO);
    }

    @GetMapping("")
    public Object GetAllProduct(){return productService.GetAllProduct();}

    @GetMapping("/{id}")
    public Object GetProductById(@PathVariable Long id)
    {return productService.GetProductById(id);}




}
