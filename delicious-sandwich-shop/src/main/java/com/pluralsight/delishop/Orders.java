package com.pluralsight.delishop;

public class Orders {
    String customerName;
    String orderNumber;
    String sandwichForOrder;
    boolean sandwichSpecial;
    boolean drink;
    boolean chips;
    boolean sauce;

    public Orders(String customerName, String orderNumber, String sandwichForOrder, boolean sandwichSpecial, boolean drink, boolean chips, boolean sauce) {
        this.customerName = customerName;
        this.orderNumber = orderNumber;
        this.sandwichForOrder = sandwichForOrder;
        this.sandwichSpecial = sandwichSpecial;
        this.drink = drink;
        this.chips = chips;
        this.sauce = sauce;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getSandwichForOrder() {
        return sandwichForOrder;
    }

    public boolean isSandwichSpecial() {
        return sandwichSpecial;
    }

    public boolean isDrink() {
        return drink;
    }

    public boolean isChips() {
        return chips;
    }

    public boolean isSauce() {
        return sauce;
    }
}

    //TODO make variables to associate orders made for the deli and user experience

