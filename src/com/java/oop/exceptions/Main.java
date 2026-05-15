package com.java.oop.exceptions;

public class Main {
    public static void main(String[] args) {
        ProductController productController = new ProductController();

        try {
            Product product = new Product("111", "laptop", 50000);
            System.out.println(productController.save(product));

        } catch (ProductExistsException e) {
            System.out.println(e.getMessage());

        }
        try {
            // ProductController productController = new ProductController();
            Product product = new Product("111","laptop", 50000);
            System.out.println(productController.save(product));

        } catch (ProductExistsException e) {
            System.out.println(e.getMessage());

        }

    }

}
