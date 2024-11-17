package SuperUberSnackShack;


import EnumClasses.BreadLength;

//Topping extends to Items amd calculates the price based what is needed with the method
public class Topping extends Items {
    BreadLength breadLength;
    boolean haveExtraToppings;


    public Topping(BreadLength breadLength, boolean haveExtraToppings) {
        this.breadLength = breadLength;
        this.haveExtraToppings = haveExtraToppings;
    }

    //return price that is based off of the bread length and if it has extra toppings
    @Override
    public double getPrice() {
        return 0;
    }
}
