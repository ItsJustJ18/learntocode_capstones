package com.pluralsight.delishop;

import EnumClasses.*;

import java.util.List;

public class Sandwich extends Items {

    private BreadLength breadLength;
    private BreadType breadType;
    List<Topping> toppings;
    private RegularToppings regularToppings;
    private SideType sideType;

    public Sandwich(BreadLength breadLength, BreadType breadType, List<Topping> toppings, RegularToppings regularToppings, SideType sideType) {
        this.breadLength = breadLength;
        this.breadType = breadType;
        this.toppings = toppings;
        this.regularToppings = regularToppings;
        this.sideType = sideType;
    }

    public BreadLength getBreadLength() {
        return breadLength;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public RegularToppings getRegularToppings() {
        return regularToppings;
    }

    public SideType getSideType() {
        return sideType;
    }
    //TODO have this class extend or implement towards the order class for it to be made
//TODO have the order extend out to the ORDER CLASS -> (.addSandwich) on a receipt that will be given to the customer\


}
