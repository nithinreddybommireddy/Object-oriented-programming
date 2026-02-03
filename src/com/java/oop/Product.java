package com.java.oop;

public class Product {
    //instance variable
    int id, quantity, availableStock, shippingcharge;
    int price;
    char memberShip;
    String name;
    float stateTax, centralTax, discountAmount, totalPrice, discountPercentage;
    float stateTaxPercentage;
    float centralTaxPercentage;

    Product() {
        System.out.println("Product page: ");

    }

    public Product(int id, int quantity, int availableStock, int shippingcharge, int price, char memberShip, String name, float stateTax, float centralTax, float discountAmount, float totalPrice, float discountPercentage, float stateTaxPercentage, float centralTaxPercentage) {
        this.id = id;
        this.quantity = quantity;
        this.availableStock = availableStock;
        this.shippingcharge = shippingcharge;
        this.price = price;
        this.memberShip = memberShip;
        this.name = name;
        this.stateTax = stateTax;
        this.centralTax = centralTax;
        this.discountAmount = discountAmount;
        this.totalPrice = totalPrice;
        this.discountPercentage = discountPercentage;
        this.stateTaxPercentage = stateTaxPercentage;
        this.centralTaxPercentage = centralTaxPercentage;
    }


    public Product(int id, int price, String name, float centralTax, float totalPrice) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.centralTax = centralTax;
        this.totalPrice = totalPrice;
    }

}

