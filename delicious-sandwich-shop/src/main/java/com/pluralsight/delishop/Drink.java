package com.pluralsight.delishop;

public class Drink extends Items {
    String size;

    @Override
    public double getPrice() {
        return super.getPrice();
    }
    Drink() {
        switch (size) {
            case "small" -> price = 2;
            case "medium" -> price = 2.5;
            case "large" -> price = 3;
            default -> System.out.print(" Sorry that size is not recognized. ");
        }
    }
}
