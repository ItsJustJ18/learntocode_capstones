package SuperUberSnackShack;


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
