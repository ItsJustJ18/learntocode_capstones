package SuperUberSnackShack;

import EnumClasses.BreadLength;
import EnumClasses.BreadType;
import EnumClasses.RegularToppings;
import EnumClasses.SauceFlavor;
import EnumClasses.SideType;
import Interfaces.Price;
import java.util.ArrayList;

public class Sandwich extends Items implements Price {

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

    public Sandwich(BreadLength breadLength, BreadType breadType, Meat.Meats meatType, Cheese.CheeseType cheeseType, RegularToppings regularToppings, SauceFlavor sauceFlavor, SideType sideType) {

    }

    public void removeTopping(Topping topping) {
        this.toppingList.remove(topping);
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

    public void setBreadLength(BreadLength breadLength) {
        this.breadLength = breadLength;
    }

    public void setBreadType(BreadType breadType) {
        this.breadType = breadType;
    }

    public void setCheeses(Cheese.CheeseType cheeses) {
        this.cheeses = cheeses;
    }

    public void setBigMeats(Meat.Meats bigMeats) {
        this.bigMeats = bigMeats;
    }

    public void setToppingList(RegularToppings toppingList) {
        this.toppingList = toppingList;
    }

    public void setSauceFlavor(SauceFlavor sauceFlavor) {
        this.sauceFlavor = sauceFlavor;
    }

    public void setSideType(SideType sideType) {
        this.sideType = sideType;
    }

    public void setToastedSandwich(boolean toastedSandwich) {
        this.toastedSandwich = toastedSandwich;
    }

}