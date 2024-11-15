package SuperUberSnackShack;

//chips extends to the Items superclass
public class Chips extends Items {

    //sets the price and chipName as not changable with final keyword
    private final String chipName;
    private final double price;

    Chips(String chipName, double price) {
        this.chipName = chipName;
        this.price = price;
    }

    //return the chipName of the Chip
    public String getChipName() {
        return chipName;
    }

    //return the price of Chips which is hard coded as $1.50
    public double getPrice() {
        return price;
    }

    //How the chipName with price will be printed
    @Override
    public String toString() {
        return "$" + price + " " + chipName;
    }

    //Hard set data types and list of chips that are going to be in the shop
    public enum ChipFlavor {
        BBQ("BBQ", 1.50),
        SOUR_CREAM_AND_ONION("Sour Cream and Onion", 1.50),
        HONEY_BUTTER("Honey Butter", 1.50),
        CLASSIC("Classic", 1.50),
        SALT_AND_VINEGAR("Salt and Vinegar", 1.50);

        ChipFlavor(String chipName, double price) {

        }
    }
}
