package com.pluralsight.delishop;

import Interfaces.Price;

//made the class abstract to make an Override for each price
public abstract class Items implements Price {

    double price;

    public static void add(Items item) {

    }

    public double getPrice() {
        return price;

    }

}
