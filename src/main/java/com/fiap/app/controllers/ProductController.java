package com.fiap.app.controllers;

import com.fiap.app.models.Product;
import com.fiap.app.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts(){
        return ResponseEntity.ok(productService.findAllProducts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id){
        Optional<Product> product = productService.findProductById(id);
        if (!product.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(product.get());
    }

    @GetMapping("/by-price")
    public ResponseEntity<List<Product>> getProductByPrice(@RequestParam Double price, @RequestParam String name){
        Optional<List<Product>> productList=productService.findProductByPrice(price,name);
        return ResponseEntity.ok(productList.get());
    }

    @GetMapping("/by-name")
    public ResponseEntity<List<Product>> getProductByName(@RequestParam String name){
        Optional<List<Product>> productList=productService.findProductByName(name);
        return ResponseEntity.ok(productList.get());
    }

    @GetMapping("/by-features")
    public ResponseEntity<List<Product>> getProductByFeatures(@RequestParam String name,@RequestParam Float maxPrice, @RequestParam int quantity){
        Optional<List<Product>> productList=productService.findProductByFeatures(name,maxPrice,quantity);
        return ResponseEntity.ok(productList.get());
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        return ResponseEntity.ok(productService.saveProduct(product));
    }

    @PutMapping("/{id}")
        public ResponseEntity<Product> updateProduct(@PathVariable Long id,@RequestBody Product product){
            if(productService.findProductById(id).isEmpty()){
                return ResponseEntity.notFound().build();
            }
            product.setId(id);
            return ResponseEntity.ok(productService.saveProduct(product));
        }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProductById(@PathVariable Long id){
        if(productService.findProductById(id).isEmpty()){
            return ResponseEntity.notFound().build();
        }
        productService.deleteProductById(id);
        return ResponseEntity.noContent().build();
    }
}



