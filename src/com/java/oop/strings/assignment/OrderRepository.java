package com.java.oop.strings.assignment;

import java.util.HashSet;
import java.util.Iterator;

public class OrderRepository {

    HashSet<Order> orders;

    public OrderRepository() {
        orders = new HashSet<>();
    }

    // create new order
    Order save(Order order) {
        orders.add(order);
        return order;
    }

    // get all orders
    HashSet<Order> getAll() {
        return orders;
    }

    // get order by id
    Order getById(String id) {
        System.out.println("id: " + id);

        Order orderById = null;

        for (Order order : orders) {
            if (order.getId().equals(id)) {
                orderById = order;
                break;
            }
        }

        return orderById;
    }

    // update order
    Order update(Order order) {

        Iterator<Order> iterator = orders.iterator();

        while (iterator.hasNext()) {

            Order existingOrder = iterator.next();

            if (existingOrder.getId().equals(order.getId())) {
                iterator.remove();
                break;
            }
        }

        orders.add(order);

        return order;
    }

    // delete order by id
    void delete(String id) {

        Iterator<Order> iterator = orders.iterator();

        while (iterator.hasNext()) {

            Order existingOrder = iterator.next();

            if (existingOrder.getId().equals(id)) {
                iterator.remove();
                break;
            }
        }
    }

    // print all products from all orders
    void printProducts() {

        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%-10s %-30s %-10s %-15s%n", "ID", "NAME", "MRP", "DISCOUNT %");
        System.out.println("-----------------------------------------------------------------");

        for (Order order : orders) {

            for (Product product : order.getProducts()) {

                System.out.printf("%-10s %-30s %-10.2f %-15.2f%n",
                        product.getId(),
                        product.getName(),
                        product.getMRP(),
                        product.getDiscountPercentage());
            }
        }
    }
}