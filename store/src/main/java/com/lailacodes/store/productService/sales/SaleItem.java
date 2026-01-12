package com.lailacodes.store.productService.sales;

import java.math.BigDecimal;
import java.util.List;

public class SaleItem {

    private String name;
    private List<String> tags;
    private BigDecimal price;
    private int quantity;

    public String getName() {
        return name;
    }

    public List<String> getTags() {
        return tags;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
