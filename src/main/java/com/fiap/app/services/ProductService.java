package com.fiap.app.services;

import com.fiap.app.models.Order;
import com.fiap.app.models.Product;
import com.fiap.app.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Service
public class ProductService {


    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAllProducts(){
        return productRepository.findAll();
    }

    public Optional<Product> findProductById(Long id){
        return productRepository.findById(id);
    }

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public void deleteProductById(Long id){
        productRepository.deleteById(id);
    }

    public Optional<List<Product>> findProductByPrice(Double productPrice, String productName) {
        return Optional.ofNullable(productRepository.findByPrice(productPrice, productName));
    }

    public Optional<List<Product>> findProductByName(String productName) {
        return Optional.ofNullable(productRepository.findByName(productName));
    }

    public Optional<List<Product>> findProductByFeatures(String productName,Float productPrice, int productQuantity){
        Optional<List<Product>> products =Optional.ofNullable(productRepository.findByFeatures(productName,productPrice,productQuantity));
        System.out.println(products);
        return products;
    }

    public Optional<Product> getOrderInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre as opções disponívies, escreva o ID do produto que você deseja pedir: ");
        String productId = scanner.nextLine();
        Optional<Product> productOptional = productRepository.findById(Long.parseLong(productId));
        return productOptional;

    }
}

