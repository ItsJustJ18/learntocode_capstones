package EnumClasses;

public enum ChipFlavor {
    BBQ("BBQ", 1.50),
    SOUR_CREAM_AND_ONION("Sour Cream and Onion", 1.50),
    HONEY_BUTTER("Honey Butter", 1.50),
    CLASSIC("Classic", 1.50),
    SALT_AND_VINEGAR("Salt and Vinegar", 1.50);

    private final String chipName;
    private final double price;

    ChipFlavor(String chipName, double price) {
        this.chipName = chipName;
        this.price = price;
    }

    public String getChipName() {
        return chipName;
    }

    public double getPrice() {
        return price;
    }
}
