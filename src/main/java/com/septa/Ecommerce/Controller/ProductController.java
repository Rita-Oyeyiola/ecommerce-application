package com.septa.Ecommerce.Controller;

import com.septa.Ecommerce.dto.ProductDTO;
import com.septa.Ecommerce.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping("/create")
    public Object CreateProduct (ProductDTO productDTO){
        return productService.CreateProduct(productDTO);
    }

    @GetMapping("/get")
    public Object GetAllProduct(){return productService.GetAllProduct();}

    @GetMapping("/get/{id}")
    public Object GetProductById(@PathVariable Long id)
    {return productService.GetProductById(id);}




}
