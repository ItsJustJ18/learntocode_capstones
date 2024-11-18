package superubersnackshack;

import enumclasses.BreadLength;
import enumclasses.BreadType;
import enumclasses.RegularToppings;
import enumclasses.SauceFlavor;
import enumclasses.SideType;


public class Sandwich extends Items {

    //instance variables to determine what a sandwich needs to be made
    private BreadLength breadLength;
    private BreadType breadType;
    private Cheese.CheeseType cheeses;
    private Meat.Meats bigMeats;
    private RegularToppings toppingList;
    private SauceFlavor sauceFlavor;
    private SideType sideType;
    private boolean toastedSandwich;
    private boolean haveExtraToppings;

    public Sandwich() {
    }

    public Sandwich(BreadLength breadLength, BreadType breadType, Cheese.CheeseType cheeses, Meat.Meats bigMeats, RegularToppings toppingList, SauceFlavor sauceFlavor, SideType sideType, boolean toastedSandwich) {
        this.breadLength = breadLength;
        this.breadType = breadType;
        this.cheeses = cheeses;
        this.bigMeats = bigMeats;
        this.toppingList = toppingList;
        this.sauceFlavor = sauceFlavor;
        this.sideType = sideType;
        this.toastedSandwich = toastedSandwich;
    }

    public BreadLength getBreadLength() {
        return breadLength;
    }

    public void setBreadLength(BreadLength breadLength) {
        this.breadLength = breadLength;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public void setBreadType(BreadType breadType) {
        this.breadType = breadType;
    }

    public Cheese.CheeseType getCheeses() {
        return cheeses;
    }

    public void setCheeses(Cheese.CheeseType cheeses) {
        this.cheeses = cheeses;
    }

    public Meat.Meats getBigMeats() {
        return bigMeats;
    }

    public void setBigMeats(Meat.Meats bigMeats) {
        this.bigMeats = bigMeats;
    }

    public RegularToppings getToppingList() {
        return toppingList;
    }

    public boolean isHaveExtraToppings() {
        return haveExtraToppings;
    }

    public void setToppingList(RegularToppings toppingList) {
        this.toppingList = toppingList;
    }

    public SauceFlavor getSauceFlavor() {
        return sauceFlavor;
    }

    public void setSauceFlavor(SauceFlavor sauceFlavor) {
        this.sauceFlavor = sauceFlavor;
    }

    public SideType getSideType() {
        return sideType;
    }

    public void setSideType(SideType sideType) {
        this.sideType = sideType;
    }

    public boolean isToastedSandwich() {
        return toastedSandwich;
    }

    public void setToastedSandwich(boolean toastedSandwich) {
        this.toastedSandwich = toastedSandwich;
    }

    public void setHaveExtraToppings(boolean haveExtraToppings) {
        this.haveExtraToppings = haveExtraToppings;
    }

    @Override
    public double getPrice() {

        double sizePrice = 0.0;
        sizePrice = getSandwichSizePrice();

        double cheesePrice = 0.0;
        cheesePrice = getCheesePrice();

        double meatPrice = 0.0;
        meatPrice = getMeatPrice();

       return sizePrice + cheesePrice + meatPrice;
    }

    public double getSandwichSizePrice() {
        double sandwichSizePrice = 0.0;
        return switch (breadLength) {
            case FOUR_INCHES -> sandwichSizePrice + 5.50;
            case EIGHT_INCHES -> sandwichSizePrice + 7.00;
            case TWELVE_INCHES -> sandwichSizePrice + 8.50;
        };
    }

    //hard code the prices for each bread length and if user wants extra cheese
    //inside a recursive loop
    public double getCheesePrice() {

        double cheesePrice = 0.0;

        if (breadLength == BreadLength.FOUR_INCHES) {
            cheesePrice = .75;
            if (haveExtraToppings) cheesePrice = cheesePrice + .30;
        } else if (breadLength == BreadLength.EIGHT_INCHES) {
            cheesePrice = 1.50;
            if (haveExtraToppings) cheesePrice = cheesePrice + .60;
        } else if (breadLength == BreadLength.TWELVE_INCHES) {
            cheesePrice = 2.25;
            if (haveExtraToppings) cheesePrice = cheesePrice + .90;
        }
        else {
            return 0.0;
        }
        return cheesePrice;
    }


    //hard code the prices for each bread length and if user wants extra meat
    //inside a recursive loop
    public double getMeatPrice() {

        double meatPrice = 0.0;

        if (breadLength == BreadLength.FOUR_INCHES) {
            meatPrice = 1.00;
            if (haveExtraToppings) meatPrice = meatPrice + .50;
        } else if (breadLength == BreadLength.EIGHT_INCHES) {
            meatPrice = 2.00;
            if (haveExtraToppings) meatPrice = meatPrice + 1.00;
        } else if (breadLength == BreadLength.TWELVE_INCHES) {
            meatPrice = 3.00;
            if (haveExtraToppings) meatPrice = meatPrice + 1.50;
        }
        else {
            return 0.0;
        }
        return meatPrice;
    }


    public String printToReceipt() {
        return String.format("%s %s", breadLength, breadType);
    }
    public String toString() {
        return "$" + getSandwichSizePrice() + " \n" + breadLength + " \n" + breadType + " \n" + isToastedSandwich() + " \n" + bigMeats + " \n" + cheeses + " \n" + getToppingList() + " \n" + sauceFlavor + " \n" + sideType;
    }
}