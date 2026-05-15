package com.java.oop.statics;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("1111", "customer1");
        customer.displayCustomer();
        Customer customer2 = new Customer("2222", "customer2");
        customer2.displayCustomer();

        System.out.println(Customer.MAX_DISCOUNT_PERCENTAGE);
        System.out.println(customer.MAX_DISCOUNT_PERCENTAGE);
         System.out.println(customer2.MAX_DISCOUNT_PERCENTAGE);

        Customer.displayCompanyDetails();
    }
}


