package SuperUberSnackShack;

import EnumClasses.BreadLength;

public class SandwichCheeses extends PremiumToppings {
    public SandwichCheeses(boolean haveExtra, BreadLength breadLength) {
        super(haveExtra, breadLength);
    }

    public double getCheesePrice() {
        if (breadLength == BreadLength.FOUR_INCHES) {
            price = .75;
            if (haveExtraToppings) price = getCheesePrice() + .30;
        } else if (breadLength == BreadLength.EIGHT_INCHES) {
            price = 1.50;
            if (haveExtraToppings) price = getCheesePrice() + .60;
        } else if (breadLength == BreadLength.TWELVE_INCHES) {
            price = 2.25;
            if (haveExtraToppings) price = getCheesePrice() + .90;
        }
        return price;
    }
}
