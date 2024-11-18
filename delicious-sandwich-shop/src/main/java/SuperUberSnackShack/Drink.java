package SuperUberSnackShack;

import EnumClasses.DrinkFlavor;
import EnumClasses.DrinkSize;


public class Drink extends Items {

    DrinkSize size;
    DrinkFlavor flavor;

    public Drink(DrinkSize size, DrinkFlavor flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    public DrinkFlavor getFlavor() {
        return flavor;
    }

    public DrinkSize getSize() {
        return size;
    }

    public void setSize(DrinkSize size) {
        this.size = size;
    }

    public void setFlavor(DrinkFlavor flavor) {
        this.flavor = flavor;
    }

    public Drink() {

    }

    public double getDrinkPrice() {

        //provides the switch case based on the size the user picks and the price correlated with it
        return switch (size) {
            case SMALL -> 2.00;
            case MEDIUM -> 2.50;
            case LARGE -> 3.00;

        };
    }

    //returns the price of the drink from the items super class method
    @Override
    public double getPrice() {
        return getDrinkPrice();

    }


    public String printToReceipt() {
        return "";
    }

    //the format that drink will print with size and flavor in the toString
    @Override
    public String toString() {
        return "$" + getDrinkPrice() + " " + flavor;
    }
}

