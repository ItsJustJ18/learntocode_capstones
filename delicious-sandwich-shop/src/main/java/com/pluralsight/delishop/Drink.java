package com.pluralsight.delishop;

import EnumClasses.DrinkFlavor;
import EnumClasses.DrinkSize;

public class Drink extends Items {

    DrinkSize size;
    DrinkFlavor flavor;

    @Override
    public double getPrice() {
        return super.getPrice();
    }
    Drink() {
        switch (size) {
            case SMALL -> price = 2;
            case MEDIUM -> price = 2.5;
            case LARGE -> price = 3;
            default -> System.out.print(" Sorry that size is not recognized. ");
        }
        System.out.println("$" + size + " " + flavor);
    }
}
