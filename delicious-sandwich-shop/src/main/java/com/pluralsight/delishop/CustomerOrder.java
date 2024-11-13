package com.pluralsight.delishop;

public class CustomerOrder {
    String firstName;
    String lastName;
    int orderID;
    //TODO make variables that are involve with customer orders


    public CustomerOrder(String firstName, String lastName, int orderID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.orderID = orderID;
    }

    @Override
    public String toString() {
        return "CustomerOrder{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", orderID=" + orderID +
                '}';
    }
    private void customerReceipt() {



    }
}
