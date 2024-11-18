package SuperUberSnackShack;

import EnumClasses.BreadLength;

public class RegularToppings extends Topping {

    public double PRICE = 0;

    public RegularToppings(BreadLength breadLength, boolean haveExtraToppings) {
        super(breadLength, haveExtraToppings);
    }

}
