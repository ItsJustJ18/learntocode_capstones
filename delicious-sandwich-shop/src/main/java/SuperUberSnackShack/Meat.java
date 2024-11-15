package SuperUberSnackShack;

import EnumClasses.BreadLength;

public class Meat extends SandwichMeat {

    private Meat meatWanted;

    public Meat(boolean haveExtra, BreadLength breadLength, Meat meatWanted) {
        super(haveExtra, breadLength);
        this.meatWanted = meatWanted;
    }

    public Meat getMeatWanted() {
        return meatWanted;
    }

    @Override
    public double getMeatPrice() {
        return super.getMeatPrice();
    }

    public String toString() {
        return "$" + price + " " + meatWanted;
    }

    public enum Meats {
        STEAK,
        HAM,
        SALAMI,
        ROAST_BEEF,
        CHICKEN,
        BACON;
    }

}
