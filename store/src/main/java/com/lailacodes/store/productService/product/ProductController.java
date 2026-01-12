package com.lailacodes.store.productService.product;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductView> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{name}")
    public ProductView getProductByName(@PathVariable String name) {
        return productService.getProductByName(name)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }
}
