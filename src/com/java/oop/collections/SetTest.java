package com.java.oop.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SetTest {
    public static void main(String[] args) {
        HashSet<Customer> customerHashSet = new HashSet<>();
        customerHashSet.add(new Customer("111","nithin","customer1@gmail.com"));
        customerHashSet.add(new Customer("112","adhitya","customer2@gmail.com"));
        customerHashSet.add(new Customer("113"," nithin","customer3@gmil.com"));
        customerHashSet.add(new Customer("114","mani","customer@4gmail.com"));
        customerHashSet.add(new Customer("115","mahesh","customer5@gmail.com"));

        System.out.println(customerHashSet.size());

        Iterator<Customer> customerIterator = customerHashSet.iterator();

        while(customerIterator.hasNext()) {
            System.out.println(customerIterator.next());
       }

        Iterator<Customer> customerIterator1 = customerHashSet.iterator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter id to remove: ");
        String id = scanner.next();

        while (customerIterator1.hasNext()) {
            Customer c = customerIterator1.next();
            if (c.getId().equals(id)) {
                customerIterator1.remove();
            }
           }
        System.out.println(" After removing "+customerHashSet.size() +" customers");
        System.out.println(customerHashSet);

    }
}
