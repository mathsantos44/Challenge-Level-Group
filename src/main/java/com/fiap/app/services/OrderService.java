package com.fiap.app.services;

import com.fiap.app.models.Client;
import com.fiap.app.models.Order;
import com.fiap.app.models.Product;
import com.fiap.app.repositories.ClientRepository;
import com.fiap.app.repositories.OrderRepository;
import com.fiap.app.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ClientRepository clientRepository;

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
        Float price;
        Scanner scan = new Scanner(System.in);
        Order order = new Order();
        System.out.println("Digite o seu Client ID:");
        Long id = Long.parseLong(scan.next());
        Client client = clientRepository.findById(id).get();
        Product product=productRepository.findById(productId).get();
        order.setProductNameOrder(product.getProductName());
        order.setProductQuantityOrder(quantity);
        order.setSupplier(product.getSupplier());
        order.setOrderPrice(product.getProductPrice()*order.getProductQuantityOrder());
        order.setClient(client);
        return order;
    }
}
