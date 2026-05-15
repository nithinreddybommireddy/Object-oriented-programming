package com.java.oop.exceptions;

public class ProductController {

    private final ProductService productService;

    public ProductController() {
        this.productService=new ProductService();
    }

    Product save(Product product) throws ProductExistsException{
        return productService.save(product);
    }

    Product getById(Product product) throws ProductExistsException{
        if(productService.getById(product.getId())==null)
            throw new ProductExistsException("Already exits");
        return productService.getById(product.getId());
    }


}
