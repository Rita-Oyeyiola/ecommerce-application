package com.septa.Ecommerce.service;

import com.septa.Ecommerce.dto.ProductDTO;
import com.septa.Ecommerce.model.Product;
import com.septa.Ecommerce.repository.ProductRepository;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService (ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public Object CreateProduct (ProductDTO productDTO){
        Product product = new Product();

        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setDescription(productDTO.getDescription());
        product.setStockQuantity(productDTO.getStockQuantity());

        return productRepository.save(product);
    }

    public Object GetAllProduct() {return productRepository.findAll();}

    public Object GetProductById(Long id) {return productRepository.findById(id);}

}

