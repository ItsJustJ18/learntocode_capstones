package EnumClasses;

public enum BreadType {
    WHEAT(0),
    WHITE(0),
    RYE(0),
    WRAP(0);

    final double price;

    BreadType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

