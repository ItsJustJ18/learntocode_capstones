package EnumClasses;

public enum DrinkFlavor {
    HI_C(0),
    ROOT_BEER(0),
    RIG_JUICE(0),
    BUTTER_BEER(0),
    HEAL_POTION(0);

    private final double price;

    DrinkFlavor(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
