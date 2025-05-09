package com.example.aquafin.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.aquafin.models.Product;

@Service
public interface ProductService {

    void addProduct(Product product);

    List<Product> getAllProducts();

    void deleteProductById(Long id);

    void updateProduct(Product existProduct);
    
    Product getProductById(Long id);

    List<Product> searchProducts(String name);

    


    // List<Product> getAvailableProducts();

}
