package com.lailacodes.store.productService;

import com.lailacodes.store.productService.product.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProductServiceApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ProductServiceApplication.class, args);
        var productService = context.getBean(ProductService.class);
        productService.getAllProducts();
    }
}
