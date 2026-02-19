package com.java.oop.strings.assignment;

import java.util.HashSet;

public class ProductService {
    HashSet<Product> getProducts(String[] productsData) {

        HashSet<Product> productsSet = new HashSet<>();
        for (String productData : productsData) {
          //  System.out.println(productData);
            String[] split = productData.split(",");
            Product product = new Product();
            product.setId(split[0]);
            product.setName(split[1]);
            product.setPrice(Double.parseDouble(split[2]));
            product.setDiscountPercentage(Float.parseFloat(split[3]));
            productsSet.add(product);

        }

        return productsSet;
    }

    public double calculateFinalPrice(Product product) {
          double finalPrice = product.getPrice()-(product.getPrice()*product.getDiscountPercentage()/100);
        return finalPrice;

    }

    void displayProductDetails(Product product) {
        System.out.println("-------------------------------");
        System.out.println("Product Id:" + product.getId());
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Price: " + product.getPrice());
        System.out.println("Discount Percentage: " + product.getDiscountPercentage());
        System.out.println("Final Price:" + calculateFinalPrice(product));
        System.out.println();
    }
}




