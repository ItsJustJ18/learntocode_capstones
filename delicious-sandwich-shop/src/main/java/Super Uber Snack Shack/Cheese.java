package com.pluralsight.delishop;

import EnumClasses.BreadLength;

public class Cheese extends com.pluralsight.delishop.PremiumToppings {

    private Cheese cheeseWanted;

    public Cheese(boolean haveExtra, BreadLength breadLength, Cheese cheeseWanted) {
        super(haveExtra, breadLength);
        this.cheeseWanted = cheeseWanted;
    }

    public Cheese getCheeseWanted() {
        return cheeseWanted;
    }

    @Override
    public double getCheesePrice() {
        if (breadLength == BreadLength.FOUR_INCHES) {
            price = .75;
            if (haveExtraToppings) price = getCheesePrice() + .30;
        }
        else if (breadLength == BreadLength.EIGHT_INCHES) {
            price = 1.50;
            if (haveExtraToppings) price = getCheesePrice() + .60;
        }
        else if (breadLength == BreadLength.TWELVE_INCHES) {
            price = 2.25;
            if (haveExtraToppings) price = getCheesePrice() + .90;
        }
        return price;
    }

    public enum CheeseType {
        AMERICAN,
        PROVOLONE,
        CHEDDAR,
        SWISS;
    }
}
