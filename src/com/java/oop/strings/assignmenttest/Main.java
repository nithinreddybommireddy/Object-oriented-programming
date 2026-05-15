package com.java.oop.strings.assignmenttest;

public class Main {

        public static void main(String[] args) {
            CsvReader csvReader = new CsvReader();

            ProductService productService = new ProductService(csvReader);
            Product product = new Product();
            product.setId(51);
            product.setName("Batta TV");
            product.setMaxRetailPrice(52432);
            product.setDiscountPercentage(10);
            product.setAvailable(true);
            product.setCompany("Batta");
            product.setCategory("TV");
            product.setManufacturedYear(2023);
            productService.addProduct(product);
            System.out.println(productService.getAllProducts());

        }
    }

