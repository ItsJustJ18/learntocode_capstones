package superubersnackshack;

import enumclasses.BreadLength;

public class Meat extends PremiumToppings {

    private final Meat meatWanted;

    //meat price changes depending on the bread length and based on if there are extra
    public Meat(boolean haveExtra, BreadLength breadLength, Meat meatWanted) {
        super(haveExtra, breadLength);
        this.meatWanted = meatWanted;
    }

    //format how the meat will be listed with price in the toString
    public String toString() {
        return "$" + price + " " + meatWanted;
    }

    //list of meats the user can choose from
    public enum Meats {
        STEAK,
        HAM,
        SALAMI,
        ROAST_BEEF,
        CHICKEN,
        BACON
    }
}

