package com.java.oop.collections.arraylist;

import java.util.ArrayList;

public class ProductRepository {
    private ArrayList<Product> products;

    public ProductRepository() {
        this.products = new ArrayList<>();
    }

    ArrayList<Product> loadProducts(String[] productData) {
        for (String item : productData) {
            String[] split = item.split(",");
            Product product = new Product();
            product.setId(split[0]);
            product.setName(split[1]);
            product.setMaxRetailPrice(Double.parseDouble(split[2]));
            product.setDiscountPercentage(Float.parseFloat(split[3]));
            products.add(product);
        }
        return products;
    }

    public Product save(Product product) {
        products.add(product);
        return product;
    }


    public ArrayList<Product> getAll() {
        return products;
    }

    public Product getProductById(String id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public Product update(String id, Product product) {
        Product byId = getProductById(id);
        if (byId == null)
            return null;
        else {
            int index = products.indexOf(byId);
            products.set(index, product);
        }
        return product;
    }

    public void delete(Product product) {
        products.remove(product);
    }

    public void deleteById(String id) {
        Product byId = getProductById(id);
        if (byId != null)
            products.remove(byId);

    }

    public void displayAllProducts() {

        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%-10s %-30s %-10s %-15s%n", "ID", "NAME", "MRP", "DISCOUNT %");
        System.out.println("-----------------------------------------------------------------");
        for (Product product : products) {
            System.out.printf("%-10s %-30s %-10.2f %-15.2f%n", product.getId(), product.getName(), product.getMaxRetailPrice(), product.getDiscountPercentage());
        }
    }

    Product getHighestPriceProduct() {
        if (products.isEmpty())
            return null;
        Product highest = products.get(0);
        for (Product p : products) {
            if (p.getMaxRetailPrice() > highest.getMaxRetailPrice()) {
                highest = p;
            }
        }
        return highest;
    }

    Product getLowestPriceProduct() {
        if (products.isEmpty())
            return null;
        Product lowest = products.get(0);
        for (Product p : products) {
            if (p.getMaxRetailPrice() < lowest.getMaxRetailPrice()) {
                lowest = p;
            }
        }
        return lowest;
    }

    Product getMaxDiscountProduct() {
        if (products.isEmpty())
            return null;
        Product maxDiscount = products.get(0);
        for (Product p : products) {
            if (p.getDiscountPercentage() > maxDiscount.getDiscountPercentage()) {
                maxDiscount = p;
            }
        }
        return maxDiscount;
    }

    double getTotalValue() {
        double sum = 0;
        for (Product p : products) {
            sum += p.getMaxRetailPrice();
        }
        return sum;
    }

    double getAveragePrice() {
        if (products.isEmpty()) return 0;
        return getTotalValue() / products.size();
    }

    int countProductsAbovePrice(double price) {
        int count = 0;
        for (Product p : products) {
            if (p.getMaxRetailPrice() > price) {
                count++;
            }
        }
        return count;
    }

//    Product getProductsWithDiscountAbove(float discount) {
//        ArrayList<Product> result = new ArrayList<>();
//        for (Product p : products) {
//            if (p.getDiscountPercentage() > discount) {
//                result.add(p);
//            }
//        }
//        return result ;
//    }

    void displayProducts(Product product) {
        if (product == null) {
            System.out.println("Product not found");
            return;
        }
        System.out.println("Id : " + product.getId());
        System.out.println("Name : " + product.getName());
        System.out.println("Price : " + product.getMaxRetailPrice());
        System.out.println("Discount : " + product.getDiscountPercentage());
    }

}