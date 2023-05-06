package com.course.oop;

import java.util.ArrayList;

public class User {
    private static int countId = 1;
    private int id;
    private String firstName;
    private String lastName;
    private String fullName;
    private Address billingAddress;
    private Address deliveryAddress;
    private Role role;
    private String email;
    private User manager;
    private String phoneNumber;
    private ArrayList<Card> cards;

    // Constructor with a fullName
    public User(String fullName, RoleType roleType, String email) {
        this.id = countId++;
        this.fullName = fullName;
        this.role = new Role(roleType);
        this.email = email;
        String[] names = fullName.split("\\s+");
        this.firstName = names[0];
        this.lastName = names[1];
    }

    // Constructor with firstName and lastName
    public User(String firstName, String lastName, RoleType roleType, String email) {
        this.id = countId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.role = new Role(roleType);
        this.email = email;
    }

    // Getter and setter methods for all fields except id
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }

    public User getManager() {
        return manager;
    }

    public void setManager(User manager) {
        this.manager = manager;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.startsWith("+")) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Error: Phone number must start with a '+' symbol");
        }
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", billingAddress=" + billingAddress +
                ", deliveryAddress=" + deliveryAddress +
                ", role=" + role +
                ", email='" + email + '\'' +
                ", manager=" + manager +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    //method printUserInfo
    public void printUserInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Billing Address: " + billingAddress);
        System.out.println("Role: " + role);
        System.out.println("First Name: " + firstName);
        System.out.println("Email: " + email);
        System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("Last Name: " + lastName);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
