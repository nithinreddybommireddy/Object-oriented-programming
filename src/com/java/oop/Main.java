package com.java.oop;

public class Main {
    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public static void main(String[] args) {
        Product product1;//reference var
        product1 = new Product();
        System.out.println("name: " + product1.name);
        System.out.println("Id: " + product1.id);
        System.out.println("quantity: " + product1.quantity);
        System.out.println("shippingCharge: " + product1.shippingcharge);
        System.out.println("availableStock: " + product1.availableStock);
        System.out.println("membership: " + product1.memberShip);
        System.out.println("price: " + product1.price);
        System.out.println("StateTax: " + product1.stateTax);
        System.out.println("CentralTax: " + product1.centralTax);
        System.out.println("discountAmount: " + product1.discountAmount);
        System.out.println("TotalPrice: " + product1.totalPrice);
        System.out.println("discountPercentage: " + product1.discountPercentage);
        System.out.println("stateTaxPercentage: " + product1.stateTaxPercentage);
        System.out.println("centalTaxPercentage: " + product1.centralTaxPercentage);
        System.out.println("----------------------------------------------------");

        Product product2;
        product2 = new Product(2341, 2, 125, 50, 3000, 's', "lenovo", 2.5F, 2.5F, 1000.0F, 40000.0F, 1.5F, 2000.0F, 2000.0F);
        System.out.println("name: " + product2.name);
        System.out.println("Id: " + product2.id);
        System.out.println("quantity: " + product2.quantity);
        System.out.println("shippingCharge: " + product2.shippingcharge);
        System.out.println("availableStock: " + product2.availableStock);
        System.out.println("membership: " + product2.memberShip);
        System.out.println("price: " + product2.price);
        System.out.println("StateTax: " + product2.stateTax);
        System.out.println("CentralTax: " + product2.centralTax);
        System.out.println("discountAmount: " + product2.discountAmount);
        System.out.println("TotalPrice: " + product2.totalPrice);
        System.out.println("discountPercentage: " + product2.discountPercentage);
        System.out.println("stateTaxPercentage: " + product2.stateTaxPercentage);
        System.out.println("centalTaxPercentage: " + product2.centralTaxPercentage);
        System.out.println("---------------------------------------------------");

        Product product3;
        product3 = new Product(2323, 30000, "lenovo", 2.5F, 35000.00F);
        System.out.format("Id: %d%n" + "Price: %d%n" + "name: %s%n" + "centralTax: %.2f%n" + "TotalPrice: %.2f%n",
                product3.id,
                product3.price,
                product3.name,
                product3.centralTax, product3.totalPrice);
        System.out.println("-------------------------------------------------");

        //table formate
        System.out.format("%-5s %-10s %-10s %-15s %-15s%n",

                "Id", "Price", "Name", "CentralTax", "TotalPrice");
        System.out.println("-----------------------------------------------");
        //table formate with data

        System.out.format("%-5d %-10d %-10s %-15.2f %-15.2f%n",
                product3.id,
                product3.price,
                product3.name,
                product3.centralTax,
                product3.totalPrice);

    }
}

