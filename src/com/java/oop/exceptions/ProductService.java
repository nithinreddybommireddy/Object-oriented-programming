package com.java.oop.exceptions;

public class ProductService {
     final ProductRepository productRepository ;

    public ProductService() {
        productRepository=new ProductRepository();
    }

    Product save(Product product) throws ProductExistsException {
        if (productRepository.exists(product.getId()))
            throw new ProductExistsException("Product Already exists");
        return productRepository.save(product);

    }
   Product getById(String id) throws ProductExistsException {
        if(productRepository.getById(id)==null){
            throw new ProductExistsException("Product Not Found");
        }
        return productRepository.getById(id);

   }
   Product update(Product product) throws ProductExistsException {
        if(productRepository.getById(product.getId())==null){
            throw new ProductExistsException("Product Not Found");
        }
        return productRepository.update(product);
   }

}






