package SuperUberSnackShack;

import EnumClasses.BreadLength;

public class Meat extends SandwichMeat {

    private Meat meatWanted;

    //meat price changes depending on the bread length and based on if there are extra
    public Meat(boolean haveExtra, BreadLength breadLength, Meat meatWanted) {
        super(haveExtra, breadLength);
        this.meatWanted = meatWanted;
    }

    public Meat getMeatWanted() {
        return meatWanted;
    }

    //return meat price with SandwichMeat class that goes into Premium Toppings
    @Override
    public double getMeatPrice() {
        return super.getMeatPrice();
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
        BACON;
    }

}
