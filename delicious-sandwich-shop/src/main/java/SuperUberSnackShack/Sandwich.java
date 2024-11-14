package SuperUberSnackShack;

import EnumClasses.*;
import java.util.List;

//Class extends to Item to use the getPrice() method (Line 13 in Items Super Class)
public class Sandwich extends Items {

    //instance variables to determine what a sandwich needs to be made
    private BreadLength breadLength;
    private BreadType breadType;
    private Cheese cheeses;
    private SuperUberSnackShack.Meat bigMeats;
    private List<Topping> toppingList;
    private SauceFlavor sauceFlavor;
    private SideType sideType;
    private boolean toastedSandwich;

    public Sandwich(BreadLength breadLength, BreadType breadType, Cheese cheeses, SuperUberSnackShack.Meat bigMeats, List<Topping> toppingList, SauceFlavor sauceFlavor, SideType sideType, boolean toastedSandwich) {
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

    public Cheese getCheeses() {
        return cheeses;
    }

    public SuperUberSnackShack.Meat getBigMeats() {
        return bigMeats;
    }

    public List<Topping> getToppingList() {
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
public void

