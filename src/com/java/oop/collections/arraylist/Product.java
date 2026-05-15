package com.java.oop.collections.arraylist;

public class Product {
    private String id;
    private String name;
    private double maxRetailPrice;
    private float discountPercentage;
    Product(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxRetailPrice() {
        return maxRetailPrice;
    }

    public void setMaxRetailPrice(double maxRetailPrice) {
        this.maxRetailPrice = maxRetailPrice;
    }

    public float getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(float discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", maxRetailPrice=" + maxRetailPrice +
                ", discountPercentage=" + discountPercentage +
                '}';
    }
}
