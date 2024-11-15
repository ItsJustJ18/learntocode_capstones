package SuperUberSnackShack;

import EnumClasses.BreadLength;
import EnumClasses.BreadType;
import EnumClasses.SauceFlavor;
import EnumClasses.SideType;

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
    public Sandwich() {

    }
    public void removeTopping (Topping topping){
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

    public void setCheeses(ArrayList<Cheese> cheeses) {
        this.cheeses = cheeses;
    }

    public void setBigMeats(ArrayList<Meat> bigMeats) {
        this.bigMeats = bigMeats;
    }

    public void setToppingList(ArrayList<Topping> toppingList) {
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
    private void sandwichList(List<Sandwich> sandwichArrayList) {
    String breadLength = "BreadLength";
    String breadType = "Bread";
    String cheeseType = "Cheese(s)";
    String meatType = "Meat(s)";
    String toppings = "Topping(s)";
    String sauce = "Sauce Flavor";
    String side = "Side";
        System.out.printf("%3s\n %3s\n %3s\n %3s\n %3s\n %3s\n %3s\n %3s\n", breadLength, breadType, cheeseType, meatType, toppings, sauce, side, toastedSandwich);
        for (Sandwich sandwich : sandwichArrayList) {

            System.out.printf("%3s\n %3s\n %3s\n %3s\n %3s\n %3s\n %3s\n %3s\n", sandwich.getBreadLength(), sandwich.getBreadType(), sandwich.getCheeses(), sandwich.getBigMeats(), sandwich.getToppingList(), sandwich.getSauceFlavor(), sandwich.getSideType());
        }
    }

}
