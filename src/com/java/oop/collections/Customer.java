package com.java.oop.collections;

import java.util.Objects;

public class Customer {
    private String id;
    private String name;
    private String email;

    public Customer(String number, String name, String mail) {
        this.id = number;
        this.name = name;
        this.email = mail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(name, customer.name) && Objects.equals(email, customer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ",name='" + name + '\'' +
                ",email='" + email + '\'' +
                '}' + "\n";
    }
}

