package com.example.aquafin.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aquafin.models.Order;
import com.example.aquafin.repositories.OrderRepository;


@Service
public class OrderServiceImpl implements OrderService {

    // @Autowired
    // private ProductRepository productRepository;

    // @Autowired
    // private ProductService productService;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void  addToCart(String id,int quantity,String email,String productName,float price){  

        // Product product = productService.getProductById(id);

        // double totalPrice = calculateTotalAmount(id,quantity);

        // float totalPrice = product.getPrice(id) * quantity;

        // Product product = productRepository.findById(id)
        //     .orElseThrow(() -> new RuntimeException("Product not found")); 

        float totalPrice = price * quantity;

        Order order = new Order();
        order.setEmail(email);
        order.setProductName(productName);
        order.setProductId(id);
        order.setQuantity(quantity);
        order.setPrice(price);
        order.setTotalPrice(totalPrice);

        orderRepository.save(order);
    }

    
    @Override
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    @Override
    public List<Order> getOrdersByEmail(String email) {
        return orderRepository.findByEmail(email);
    }

    @Override
    public void deleteOrdersByEmail(String email) {
        orderRepository.deleteByEmail(email);
    }


    
    // @Override
    // public double calculateTotalAmount(Long id,int quantity){

    //     double productPrice = getProductPrice(id);

    //     return  productPrice * quantity;
    // }

    // @Override
    // public double getProductPrice(Long id) {
    //     return getProduct(id).getPrice();
    // }
    
    // private Product getProduct(Long id) {
    //     return productRepository.findById(id)
    //         .orElseThrow(() -> new RuntimeException("Product not found with ID: " + id));
    // }

    

}
