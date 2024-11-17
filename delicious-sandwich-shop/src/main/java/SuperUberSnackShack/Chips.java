package SuperUberSnackShack;

import java.util.Scanner;

//chips extends to the Items superclass
public class Chips extends Items {

    //sets the price and chipName as not changeable with final keyword
    private final ChipFlavor chipName;
    private final double PRICE = 1.50;

    public Chips(ChipFlavor chipName) {
        this.chipName = chipName;
    }

    public ChipFlavor getChipName() {
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
        BBQ("BBQ"),
        SOUR_CREAM_AND_ONION("Sour Cream and Onion"),
        HONEY_BUTTER("Honey Butter"),
        CLASSIC("Classic"),
        SALT_AND_VINEGAR("Salt and Vinegar");

        ChipFlavor(String chipName) {

        }
    }
}
