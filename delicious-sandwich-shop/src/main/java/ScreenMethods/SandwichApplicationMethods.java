package ScreenMethods;

import EnumClasses.*;
import EnumClasses.RegularToppings;
import SuperUberSnackShack.*;

public class SandwichApplicationMethods {

    static Orders orders = new Orders();

//    public void addSandwichToOrder(Orders orderReady) {
//        orderReady.addOrderItem();
//
//    }
//    public BreadLength chooseBreadLength() {
//
//    }
//    public BreadType chooseBreadType() {
//
//    }
//    public Meat chooseMeatType() {
//
//    }
//    public Cheese chooseCheeseType() {
//
//    }
//    public RegularToppings chooseRegularToppings() {
//
//    }
//    public SauceFlavor chooseSauceFlavor() {
//
//    }
//    public SideType chooseSideType() {
//
//    }
    public static void addChipsToOrder(Chips.ChipFlavor chipFlavor) {
    Chips chips = new Chips(chipFlavor);
    orders.addOrderItem(chips);
}
    public static void addDrinkToOrder(DrinkSize drinkSize, Drink.DrinkFlavor drinkFlavor) {
        Drink drink = new Drink(drinkSize, drinkFlavor);
        orders.addOrderItem(drink);
    }

    public static void addSandwichToOrder(BreadLength breadLength, BreadType breadType, Meat.Meats meatType, Cheese.CheeseType cheeseType, RegularToppings regularToppings, SauceFlavor sauceFlavor, SideType sideType) {

    Sandwich superUberSandwich = new Sandwich(breadLength, breadType, meatType, cheeseType, regularToppings, sauceFlavor, sideType);
    orders.addOrderItem(superUberSandwich);

    }





}
