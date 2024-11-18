package superubersnackshack;

import enumclasses.ChipFlavor;

//chips extends to the Items superclass
public class Chips extends Items {

    //sets the price and chipName as not changeable with final keyword
    private ChipFlavor chipName;
    private final double PRICE = 1.50;

    public ChipFlavor getChipName() {
        return chipName;
    }

    public void setChipName(ChipFlavor chipName) {
        this.chipName = chipName;
    }

    public Chips() {
    }

    //return the price of Chips which is hard coded as $1.50
    public double getPrice() {
        return PRICE;
    }

    @Override
    public String printToReceipt() {
        return "";
    }

    //How the chipName with price will be printed
    @Override
    public String toString() {
        return "$" + PRICE + " " + chipName;
    }
}
