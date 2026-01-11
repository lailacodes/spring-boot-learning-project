// Error Handling - Product Not Found

package com.lailacodes.store.productService.product;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {
        super(message);
    }
}
