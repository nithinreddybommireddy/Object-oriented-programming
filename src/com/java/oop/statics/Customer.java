package com.java.oop.statics;

public class Customer {
    String id;
    String name;
    static final float MAX_DISCOUNT_PERCENTAGE = 10.5F;
    static String companyName;
    static String companyContactNo;

    static {
        companyName = "St School";
        companyContactNo = "+91-23423423";
    }

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    void displayCustomer() {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);

    }

    static void displayCompanyDetails() {
        // System.out.println("Id :" + id) ;
        System.out.println("Company Name : " + companyName);
        System.out.println("Company Contact No : " + companyContactNo);
    }

}

