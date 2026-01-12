package com.lailacodes.store.productService.sales;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.List;

@Document(collection = "sales")
public class Sale {

    @Id
    private String id;

    private Instant saleDate;
    private List<SaleItem> items;
    private String storeLocation;

    protected Sale() {}

    public List<SaleItem> getItems() {
        return items;
    }
}
