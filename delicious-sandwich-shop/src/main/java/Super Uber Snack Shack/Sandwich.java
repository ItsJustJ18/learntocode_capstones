package com.pluralsight.delishop;

import EnumClasses.*;


import java.util.List;

//Class extends to Item to use the getPrice() method (Line 13 in Items Super Class)
public class Sandwich extends com.pluralsight.delishop.Items {

    //instance variables to determine what a sandwich needs to be made
    private BreadLength breadLength;
    private BreadType breadType;
    private com.pluralsight.delishop.Cheese cheeses;
    private Meat bigMeats;
    private List<com.pluralsight.delishop.Topping> toppingList;
    private SauceFlavor sauceFlavor;
    private SideType sideType;
    private boolean toastedSandwich;

    public Sandwich(BreadLength breadLength, BreadType breadType, com.pluralsight.delishop.Cheese cheeses, Meat bigMeats, List<com.pluralsight.delishop.Topping> toppingList, SauceFlavor sauceFlavor, SideType sideType, boolean toastedSandwich) {
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

    public BreadType getBreadType() {
        return breadType;
    }

    public com.pluralsight.delishop.Cheese getCheeses() {
        return cheeses;
    }

    public Meat getBigMeats() {
        return bigMeats;
    }

    public List<com.pluralsight.delishop.Topping> getToppingList() {
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

    //TODO have this class extend or implement towards the order class for it to be made
//TODO have the order extend out to the ORDER CLASS -> (.addSandwich) on a receipt that will be given to the customer\


}
