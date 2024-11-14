package com.pluralsight.delishop;

import EnumClasses.DrinkSize;

public class Drink extends com.pluralsight.delishop.Items {

    DrinkSize size;
    DrinkFlavor flavor;

    private Drink() {
        switch (size) {
            case SMALL -> price = 2.00;
            case MEDIUM -> price = 2.50;
            case LARGE -> price = 3.00;
            default -> {
                System.out.print(" Sorry that size is not recognized. ");
            }
        }
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "$" + size + " " + flavor;
    }

    public enum DrinkFlavor {
        HI_C,
        ROOT_BEER,
        RIG_JUICE,
        BUTTER_BEER,
        HEAL_POTION;
    }
}
