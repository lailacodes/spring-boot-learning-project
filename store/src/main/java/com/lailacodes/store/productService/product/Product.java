// Implementation of a Product entity

package com.lailacodes.store.productService.product;

import java.math.BigDecimal;

public class Product {

    private String name;
    private BigDecimal price;
    private String description;
    private String image;
    private String category;
    private String id;

    // default constructor
    protected Product(){}

    public Product(String name, BigDecimal price, String description, String image, String category, String id) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.image = image;
        this.category = category;
        this.id = id;
    }

    // accessor methods
    // getters
    public String getName() {
        return name;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public String getImage() {
        return image;
    }
    public String getCategory() {
        return category;
    }
    public String getId() {
        return id;
    }

    //setters
    public void rename(String name) {
        this.name = name;
    }

    public void changePrice(BigDecimal price) {
        if (price == null || price.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Price must be >= 0");
        }
        this.price = price;
    }

    public void editDescription(String description) {
        this.description = description;
    }
    public void changeImage(String image) {
        this.image = image;
    }
    public void changeCategory(String category) {
        this.category = category;
    }

    // behaviors
    public void updatePrice(double amount){
        // Account for negative input
        if (amount < 0){
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        this.price = this.price.add(BigDecimal.valueOf(amount));
    }

    public boolean isFree() {
        return price.compareTo(BigDecimal.ZERO) == 0;
    }

    public boolean belongsTo(String category) {
        return this.category != null && this.category.equalsIgnoreCase(category);
    }

}
