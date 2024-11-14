package SuperUberSnackShack;

import EnumClasses.BreadLength;

public abstract class PremiumToppings extends Topping {

    public double price;

public PremiumToppings(boolean haveExtra, BreadLength breadLength) {
    super(breadLength, haveExtra);
}

}


