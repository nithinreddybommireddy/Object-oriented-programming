
package com.java.oop.strings.assignment;

import java.util.HashSet;
import java.util.Iterator;

public class ProductService {

    private HashSet<Product> products;

    public ProductService() {
        this.products = new HashSet<>();
    }

    HashSet<Product> getProducts(String[] productsData) {

        for (String productData : productsData) {
            String[] split = productData.split(",");
            Product product = new Product();
            product.setId(split[0]);
            product.setName(split[1]);
            product.setMRP(Double.parseDouble(split[2]));
            product.setDiscountPercentage(Float.parseFloat(split[3]));
            products.add(product);
        }
        return products;

    }

    double calculateFinalPrice(Product product) {
        return product.getMRP() - (product.getMRP() * product.getDiscountPercentage() / 100);
    }

    void displayProductDetails(Product product) {
        System.out.println("=====================================");
        System.out.println("Id : " + product.getId());
        System.out.println("Name : " + product.getName());
        System.out.println("Max Retail Price: " + product.getMRP());
        System.out.println("Discount Percentage: " + product.getDiscountPercentage());
        System.out.println("Final Price: " + calculateFinalPrice(product));
    }


    HashSet<Product> getProductsById(String[] ids) {
        HashSet<Product> productsById = new HashSet<>();
        for (String id : ids) {
            Iterator<Product> iterator = products.iterator();
            while (iterator.hasNext()) {
                Product product = iterator.next();
                if (product.getId().equals(id))
                    productsById.add(product);
            }
        }
        return productsById;

    }
}
