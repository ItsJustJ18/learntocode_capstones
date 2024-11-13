package EnumClasses;

public enum SauceFlavor {
    KRABBY_PATTY_FORMULA(0),
    AU_JUS(0),
    WORLDS_SPICIEST_HOT_SAUCE(0),
    MAYO(0),
    MUSTARD(0),
    KETCHUP(0),
    RANCH(0),
    THOUSAND_ISLAND(0),
    VINAIGRETTE(0);

    final double price;

    public double getPrice() {
        return price;
    }

    SauceFlavor(double price) {
        this.price = price;
    }

}
