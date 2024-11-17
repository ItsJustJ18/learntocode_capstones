package SuperUberSnackShack;

import EnumClasses.DrinkSize;
import Interfaces.Price;

public class Drink extends Items implements Price {

    DrinkSize size;
    DrinkFlavor flavor;

    public Drink() {
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

    //the format that drink will print with size and flavor in the toString
    @Override
    public String toString() {
        return "$" + size + " " + flavor;
    }

    //Enum list of the drink flavors a user can select
    public enum DrinkFlavor {
        HI_C,
        ROOT_BEER,
        RIG_JUICE,
        BUTTER_BEER,
        HEAL_POTION;
    }
}
