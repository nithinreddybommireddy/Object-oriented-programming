package com.java.oop.exceptions;

import java.util.ArrayList;

public class ProductRepository {
    ArrayList<Product> products;

    public ProductRepository() {
        this.products = new ArrayList<>();

    }

    public Product save(Product product) {
        products.add(product);
        return product;
    }

    public Product getById(String id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public Product update(Product product) {
        {
            Product updateDetails = getById(product.getId());
            updateDetails.setId(product.getId());
            updateDetails.setName(product.getName());
            updateDetails.setPrice(product.getPrice());
        }
        return product;
    }

    public boolean deleteById(String id) {
        if(getById(id) == null) {
         return false;
        }
        Product deleteDetails = getById(id);
        products.remove(deleteDetails);
       return true;
    }
    boolean exists(String id) {

        for (Product product : products) {
            if (product.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
    public ArrayList<Product> getAll() {

        return products;
    }

}

