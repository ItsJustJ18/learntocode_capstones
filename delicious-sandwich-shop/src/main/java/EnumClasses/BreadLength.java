package EnumClasses;

public enum BreadLength {

    FOUR_INCHES(5.50),
    EIGHT_INCHES(7.00),
    TWELVE_INCHES(8.50);

    private double price;

    BreadLength(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
