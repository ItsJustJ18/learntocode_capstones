package SuperUberSnackShack;

import EnumClasses.BreadLength;
import EnumClasses.BreadType;
import EnumClasses.RegularToppings;
import EnumClasses.SauceFlavor;
import EnumClasses.SideType;
import Interfaces.Price;

public class Sandwich extends Items implements Price {

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

    //hard code the prices for each bread length and if user wants extra cheese
    //inside a recursive loop
    public double getCheesePrice() {
        if (breadLength == BreadLength.FOUR_INCHES) {
            price = .75;
            if (haveExtraToppings) price = getCheesePrice() + .30;
        } else if (breadLength == BreadLength.EIGHT_INCHES) {
            price = 1.50;
            if (haveExtraToppings) price = getCheesePrice() + .60;
        } else if (breadLength == BreadLength.TWELVE_INCHES) {
            price = 2.25;
            if (haveExtraToppings) price = getCheesePrice() + .90;
        }
        return price;
    }


    //hard code the prices for each bread length and if user wants extra meat
    //inside a recursive loop
    public double getMeatPrice() {
        if (breadLength == BreadLength.FOUR_INCHES) {
            price = 1.00;
            if (haveExtraToppings) price = getMeatPrice() + .50;
        } else if (breadLength == BreadLength.EIGHT_INCHES) {
            price = 2.00;
            if (haveExtraToppings) price = getMeatPrice() + 1.00;
        } else if (breadLength == BreadLength.TWELVE_INCHES) {
            price = 3.00;
            if (haveExtraToppings) price = getMeatPrice() + 1.50;
        }
        return price;
    }


    public String printToReceipt() {
      return String.format("%s %s", breadLength, breadType);
    }
}