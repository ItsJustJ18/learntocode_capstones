package SuperUberSnackShack;

import EnumClasses.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Sandwich extends Items {

    //instance variables to determine what a sandwich needs to be made
    private BreadLength breadLength;
    private BreadType breadType;
    private ArrayList<Cheese> cheeses;
    private ArrayList<Meat> bigMeats;
    private ArrayList<Topping> toppingList;
    private SauceFlavor sauceFlavor;
    private SideType sideType;
    private boolean toastedSandwich;

    public Sandwich(BreadLength breadLength, BreadType breadType, ArrayList<Cheese> cheeses, ArrayList<Meat> bigMeats, ArrayList<Topping> toppingList, SauceFlavor sauceFlavor, SideType sideType, boolean toastedSandwich) {
        this.breadLength = breadLength;
        this.breadType = breadType;
        this.cheeses = cheeses;
        this.bigMeats = bigMeats;
        this.toppingList = toppingList;
        this.sauceFlavor = sauceFlavor;
        this.sideType = sideType;
        this.toastedSandwich = toastedSandwich;
    }

    public void addTopping(Topping topping) {
        Topping.add(topping);
    }

    public BreadLength getBreadLength() {
        return breadLength;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public ArrayList<Cheese> getCheeses() {
        return cheeses;
    }

    public ArrayList<Meat> getBigMeats() {
        return bigMeats;
    }

    public ArrayList<Topping> getToppingList() {
        return toppingList;
    }

    public SauceFlavor getSauceFlavor() {
        return sauceFlavor;
    }

    public SideType getSideType() {
        return sideType;
    }

    public boolean isToastedSandwich() {
        return toastedSandwich;
    }

//TODO have the order extend out to the ORDER CLASS -> (.addSandwich) on a receipt that will be given to the customer\
}

    public void makingSandwich() {

}

