package com.fiap.app.services;

import com.fiap.app.models.Order;
import com.fiap.app.models.Product;
import com.fiap.app.repositories.OrderRepository;
import com.fiap.app.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ProductRepository productRepository;

    public List<Order> findAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> findOrderById(Long id) {
        return orderRepository.findById(id);
    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    public void deleteOrderById(Long id) {
        orderRepository.deleteById(id);
    }

    public Order makeOrder(Long productId,int quantity){
        Order order = new Order();
        Float price;
        Optional<Product> p = productRepository.findById(productId);
        Product product=p.get();
        order.setProductNameOrder(product.getProductName());
        order.setProductQuantityOrder(quantity);
        order.setSupplier(product.getSupplier());
        order.setOrderPrice(product.getProductPrice()*order.getProductQuantityOrder());
        return order;
    }
}
