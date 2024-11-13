package EnumClasses;

public enum ChipFlavor {
    BBQ(1.50),
    SOUR_CREAM_AND_ONION(1.50),
    HONEY_BUTTER(1.50),
    CLASSIC(1.50),
    SALT_AND_VINEGAR(1.50);

    final double price;

    ChipFlavor(double price) {
        this.price = price;
    }
}
