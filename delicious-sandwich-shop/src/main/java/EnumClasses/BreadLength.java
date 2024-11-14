package EnumClasses;

public enum BreadLength {

    //List of breadLengths set in a String and Price format that are set to final
    FOUR_INCHES("Four Inches", 5.50),
    EIGHT_INCHES("Eight Inches", 7.00),
    TWELVE_INCHES("Twelve Inches", 8.50);

    private final String breadLength;
    private final double price;

    //Constructor of what makes the breadLength what it is
    BreadLength(String breadLength, double price) {
        this.breadLength = breadLength;
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public String getBreadLength() {
        return breadLength;
    }
}
