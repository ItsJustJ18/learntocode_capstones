package SuperUberSnackShack;

import EnumClasses.DrinkFlavor;
import EnumClasses.DrinkSize;
import Interfaces.Price;

public class Drink extends Items implements Price {

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

    public void getDrinkPrice() {

        //provides the switch case based on the size the user picks and the price correlated with it

        switch (size) {
            case SMALL -> price = 2.00;
            case MEDIUM -> price = 2.50;
            case LARGE -> price = 3.00;
            default -> {
                System.out.print(" Sorry that size is not recognized. ");
            }
        }
    }

    //returns the price of the drink from the items super class method
    @Override
    public double getPrice() {
        return super.getPrice();
    }


    public String printToReceipt() {
        return "";
    }

    //the format that drink will print with size and flavor in the toString
    @Override
    public String toString() {
        return "$" + size + " " + flavor;
    }
}

