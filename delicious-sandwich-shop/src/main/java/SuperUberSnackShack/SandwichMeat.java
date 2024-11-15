package SuperUberSnackShack;

import EnumClasses.BreadLength;

public class SandwichMeat extends PremiumToppings {
    public SandwichMeat(boolean haveExtra, BreadLength breadLength) {
        super(haveExtra, breadLength);
    }

    //hard code the prices for each bread length and if user wants extra meat
    //inside a recursive loop
    public double getMeatPrice() {
        if (breadLength == BreadLength.FOUR_INCHES) {
            price = 1.00;
            if (haveExtraToppings) price = getMeatPrice() + .50;
        } else if (breadLength == BreadLength.EIGHT_INCHES) {
            price = 2.00;
            if (haveExtraToppings) price = getMeatPrice() + 1.00;
        } else if (breadLength == BreadLength.TWELVE_INCHES) {
            price = 3.00;
            if (haveExtraToppings) price = getMeatPrice() + 1.50;
        }
        return price;
    }
}
