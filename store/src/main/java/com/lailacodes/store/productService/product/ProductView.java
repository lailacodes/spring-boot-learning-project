package com.lailacodes.store.productService.product;

import java.math.BigDecimal;
import java.util.List;

public class ProductView {

    private final String name;
    private final List<String> tags;
    private final BigDecimal price;
    private final int totalQuantitySold;

    public ProductView(String name, List<String> tags, BigDecimal price, int totalQuantitySold) {
        this.name = name;
        this.tags = tags;
        this.price = price;
        this.totalQuantitySold = totalQuantitySold;
    }

    public String getName() {
        return name;
    }

    public List<String> getTags() {
        return tags;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getTotalQuantitySold() {
        return totalQuantitySold;
    }
}
