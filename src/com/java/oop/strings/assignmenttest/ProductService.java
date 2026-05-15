package com.java.oop.strings.assignmenttest;

import java.util.List;

public class ProductService {
    private List<Product> products;
    private CsvReader csvReader;

    public ProductService(CsvReader csvReader){
        this.csvReader = csvReader;
        products = this.csvReader.getProductsFromCsv();
    }


    public List<Product> getAllProducts(){
        return products;
    }
    public Product addProduct(Product product){
        products.add(product);
        return product;
    }
    public Product getProductById(int id){
        Product getProductById = null;
        for(Product product : products){
            if(product.getId() == id){
                getProductById = product;
            }
        }
        return getProductById;
    }

    public Product updateProduct(Product product){
        int index = 0;
        for(Product p : products){
            if(p.getId() == product.getId()){
                products.set(index, product);
                return product;
            }
            index++;
        }
        return null;

    }
}

