package com.fiap.app;

import com.fiap.app.models.Request;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
		Request request = new Request();
		request.setR_product_name("Furadeira");
		request.setPrice(300.0);
		request.setQuantity(20);


	}



}
