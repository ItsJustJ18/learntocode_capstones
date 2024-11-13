package EnumClasses;

import java.util.ArrayList;

public enum Meat {
    STEAK("Steak",0),
    HAM("Ham", 0),
    SALAMI("Salami",  0),
    ROAST_BEEF("Roast Beef", 0),
    CHICKEN("Chicken", 0),
    BACON("Bacon", 0);

    private String meatChoice;
    private double price;

    Meat(String meatChoice, double price) {
        this.meatChoice = meatChoice;
        this.price = price;
    }

    public String getMeatChoice() {
        return meatChoice;
    }

    public double getPrice() {
        return price;
    }
}

