package com.pluralsight.delishop;


import EnumClasses.BreadLength;

public class Topping extends Items {
    BreadLength breadLength;
    boolean haveExtraToppings;

    public Topping(BreadLength breadLength, boolean haveExtraToppings) {
        this.breadLength = breadLength;
        this.haveExtraToppings = haveExtraToppings;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
//TODO the SUPER CLASS that the Premium and Regular toppings are going to extend to
    //TODO extend this to the Items class

