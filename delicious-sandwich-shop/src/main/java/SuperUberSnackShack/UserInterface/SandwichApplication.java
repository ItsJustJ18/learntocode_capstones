package SuperUberSnackShack.UserInterface;

import EnumClasses.*;
import EnumClasses.RegularToppings;
import ReceiptKeeper.PrintReceipt;
import SuperUberSnackShack.*;

import java.util.Scanner;

import static ScreenMethods.SandwichApplicationMethods.*;

public class SandwichApplication {

    private final Scanner user = new Scanner(System.in);

    Orders orders = new Orders();

    public void customerOrderScreen() {

        boolean sandwichShopIsOpen = true;

        while (sandwichShopIsOpen) {

            System.out.print("""
                    
                    Super Uber Snack Shack
                    
                    Welcome value customer, what would you like to order today?
                    
                    1) Make a new order
                    
                    2) Leave the Super Uber Snack Shack
                    
                    """);

            String picker = user.nextLine();

            switch (picker) {

                case "1":

                    System.out.println(" New order in progress. ");
                    createOrderMenu();
                    break;

                case "2":

                    //Ends the program with Exit Code 0
                    System.out.println("Thank you for visit. Return soon =p");
                    sandwichShopIsOpen = false;
                    break;

                default:

                    //this catches any user error that they decide to use in the interface
                    System.out.println(" These inputs aren't available. Please input either 1 to make an order or 2 to leave Super Uber Snack Shack. ");
                    break;
            }
        }
    }

    public void createOrderMenu() {

        boolean orderIsDone = false;

        while (!orderIsDone) {
            System.out.print("""
                    
                    You have entered the order menu. What would like to add with your order?
                    
                    1) Make a Super Uber Sandwich
                    
                    2) Add a Drink
                    
                    3) Add A Chip
                    
                    4) View Current Order
                    
                    5) Checkout (Pay for Order)
                    
                    6) Cancel Order (Delete Order)
                    
                    7) Go back to Home Screen
                    
                    """);

            String decision = user.nextLine();

            switch (decision) {

                case "1":
                    //activates the sandwich screen for the user to make a sandwich
                    sandwichMakerMenu();
                    break;

                case "2":
                    //activates the drinkMakerMenu for people that would like to add a drink
                    drinkMakerMenu();
                    break;

                case "3":
                    //activates the chipMakerMenu for people that would like to add a chip
                    chipMakerMenu();
                    break;

                case "4":
                    System.out.println(" Your Items: ");

                case "5":
                    orderIsDone = true;
                    checkOutMenu();
                    break;

                case "6":
                    System.out.println(" Order has been removed. ");

                    break;

                case "7":
                    customerOrderScreen();
                    orderIsDone = true;
                    break;

                default:
                    System.out.println(" Invalid response. Please select from the options provided. ");

            }
        }
    }

    public void checkOutMenu() {

        boolean leave = true;

        String userLeaves = user.nextLine();

        System.out.println(" Ready to checkout? Select y for yes and n for no. ");

        if (userLeaves.equalsIgnoreCase("y")) {
            userLeaves.matches("y");
            PrintReceipt.makeReceipt(orders);

            System.out.println("Here's your order and have a nice day!");

        } else if (userLeaves.equalsIgnoreCase("n")) {
            leave = false;
        }

    }

    public void sandwichMakerMenu(BreadLength breadLength, BreadType breadType, Meat.Meats meatType, Cheese.CheeseType cheeseType, RegularToppings regularToppings, SauceFlavor sauceFlavor, SideType sideType) {

        Sandwich superUberSandwich = new Sandwich(breadLength, breadType, meatType, cheeseType, regularToppings, sauceFlavor, sideType);

        boolean sandwichBuilder = true;

        while (sandwichBuilder) {

            System.out.print("""
                    
                    Select a bread length that you wish.
                    
                    1) 4" Inches $5.50
                    
                    2) 8" Inches $7.00
                    
                    3) 12" Inches $8.50
                    
                    4) Cancel Option
                    
                    """);

            String choice = user.nextLine();

            switch (choice) {
                case "1":
                    System.out.println(" You have selected Four (4) Inches ");
                    System.out.printf("%2s $%4.2f", BreadLength.FOUR_INCHES.getBreadLength(), BreadLength.FOUR_INCHES.getPrice());
                    superUberSandwich.setBreadLength(BreadLength.FOUR_INCHES);
                    breadPicker(superUberSandwich);
                    break;

                case "2":
                    System.out.println(" You have selected Eight (8) Inches ");
                    System.out.printf("%2s $%4.2f", BreadLength.EIGHT_INCHES.getBreadLength(), BreadLength.EIGHT_INCHES.getPrice());
                    superUberSandwich.setBreadLength(BreadLength.EIGHT_INCHES);
                    breadPicker(superUberSandwich);
                    break;

                case "3":
                    System.out.println(" You have selected Twelve (12) Inches");
                    System.out.printf("%2s $%4.2f", BreadLength.TWELVE_INCHES.getBreadLength(), BreadLength.TWELVE_INCHES.getPrice());
                    superUberSandwich.setBreadLength(BreadLength.TWELVE_INCHES);
                    breadPicker(superUberSandwich);
                    break;

                case "4":
                    System.out.println(" Order has been cancelled. ");
                    createOrderMenu();
                    sandwichBuilder = false;

                default:
                    System.out.println(" Invalid option has been detected. Please pick from the following options. ");
                    break;
            }
        }
    }

    public void breadPicker(Sandwich superUberSandwich) {

        boolean breadPicked = false;

        while (!breadPicked) {

            System.out.println("""
                    
                    
                    Select a bread type from the options below:
                    
                    1) White
                    
                    2) Wheat
                    
                    3) Rye
                    
                    4) Wrap
                    
                    5) Cancel Order
                    
                    """);

            String breadPick = user.nextLine();

            switch (breadPick) {

                case "1":
                    System.out.println(" You have selected White bread. ");
                    System.out.println(BreadType.WHITE + " FREE ");
                    superUberSandwich.setBreadType(BreadType.WHITE);
                    pickTheCheese(superUberSandwich);
                    break;

                case "2":
                    System.out.println(" You have selected Wheat bread.");
                    System.out.println(BreadType.WHEAT + " FREE ");
                    superUberSandwich.setBreadType(BreadType.WHEAT);
                    pickTheCheese(superUberSandwich);
                    break;

                case "3":
                    System.out.println(" You have selected Rye bread. ");
                    System.out.println(BreadType.RYE + " FREE ");
                    superUberSandwich.setBreadType(BreadType.RYE);
                    pickTheCheese(superUberSandwich);
                    break;

                case "4":
                    System.out.println(" You have selected Wrap style. ");
                    System.out.println(BreadType.WRAP + " FREE ");
                    superUberSandwich.setBreadType(BreadType.WRAP);
                    pickTheCheese(superUberSandwich);
                    break;

                case "5":
                    System.out.println(" Order has been cancelled. ");
                    createOrderMenu();
                    breadPicked = true;
                    break;

                default:
                    System.out.println(" These options are not available. Please pick a provided option. ");
                    break;
            }

        }

    }

    public void pickTheCheese(Sandwich superUberSandwich) {

        boolean cheesePicked = false;

        boolean wantsExtra = false;

        while (!cheesePicked) {
            System.out.println("""
                    
                    Select a cheese you would like.
                    
                    1) American Cheese
                    
                    2) Provolone
                    
                    3) Cheddar
                    
                    4) Swiss
                    
                    5) No Cheese
                    
                    6) Cancel Order
                    
                    """);

            String cheesePick = user.nextLine();

            switch (cheesePick) {

                case "1":
                    System.out.println(" You have selected American Cheese. ");
                    System.out.println(Cheese.CheeseType.AMERICAN);
                    superUberSandwich.setCheeses(Cheese.CheeseType.AMERICAN);
                    meatPickerMenu(superUberSandwich);
                    break;

                case "2":
                    System.out.println(" You have selected Provolone Cheese. ");
                    System.out.println(Cheese.CheeseType.PROVOLONE);
                    superUberSandwich.setCheeses(Cheese.CheeseType.PROVOLONE);
                    meatPickerMenu(superUberSandwich);
                    break;

                case "3":
                    System.out.println(" You have selected Cheddar Cheese. ");
                    System.out.println(Cheese.CheeseType.CHEDDAR);
                    superUberSandwich.setCheeses(Cheese.CheeseType.CHEDDAR);
                    meatPickerMenu(superUberSandwich);
                    break;

                case "4":
                    System.out.println(" You have selected Swiss Cheese. ");
                    System.out.println(Cheese.CheeseType.SWISS);
                    superUberSandwich.setCheeses(Cheese.CheeseType.SWISS);
                    meatPickerMenu(superUberSandwich);
                    break;

                case "5":
                    System.out.println(" You have selected no Cheese. ");
                    meatPickerMenu(superUberSandwich);


                case "6":
                    System.out.println(" Order cancelled. ");
                    cheesePicked = true;
                    createOrderMenu();

                default:
                    System.out.println(" These options are not available. Please pick a provided option. ");
                    break;
            }

        }

    }

    public void meatPickerMenu(Sandwich superUberSandwich) {

        boolean meatPicked = false;

        while (!meatPicked) {
            System.out.println("""
                    
                     Select a Meat you would like.
                    
                    1) Steak
                    
                    2) Ham
                    
                    3) Salami
                    
                    4) Roast Beef
                    
                    5) Chicken
                    
                    6) Bacon
                    
                    7) No Meat
                    
                    8) Cancel Order
                    
                    
                    """);

            String meatPicker = user.nextLine();

            switch (meatPicker) {

                case "1":
                    System.out.println(" You have selected Steak. ");
                    System.out.println(Meat.Meats.STEAK);
                    superUberSandwich.setBigMeats(Meat.Meats.STEAK);
                    regularToppingMenu(superUberSandwich);
                    break;

                case "2":
                    System.out.println(" You have selected Ham. ");
                    System.out.println(Meat.Meats.HAM);
                    superUberSandwich.setBigMeats(Meat.Meats.HAM);
                    regularToppingMenu(superUberSandwich);
                    break;

                case "3":
                    System.out.println(" You have selected Salami. ");
                    System.out.println(Meat.Meats.SALAMI);
                    superUberSandwich.setBigMeats(Meat.Meats.SALAMI);
                    regularToppingMenu(superUberSandwich);
                    break;

                case "4":
                    System.out.println(" You have selected Roast Beef. ");
                    System.out.println(Meat.Meats.ROAST_BEEF);
                    superUberSandwich.setBigMeats(Meat.Meats.ROAST_BEEF);
                    regularToppingMenu(superUberSandwich);
                    break;

                case "5":
                    System.out.println(" You have selected Chicken. ");
                    System.out.println(Meat.Meats.CHICKEN);
                    superUberSandwich.setBigMeats(Meat.Meats.CHICKEN);
                    regularToppingMenu(superUberSandwich);


                case "6":
                    System.out.println(" You have selected Bacon. ");
                    System.out.println(Meat.Meats.BACON);
                    superUberSandwich.setBigMeats(Meat.Meats.BACON);
                    regularToppingMenu(superUberSandwich);

                case "7":
                    System.out.println(" You have selected no Meat. ");
                    regularToppingMenu(superUberSandwich);

                case "8":
                    System.out.println("Order has been cancelled. ");
                    createOrderMenu();
                    meatPicked = true;

                default:
                    System.out.println(" These options are not available. Please pick a provided option. ");
                    break;
            }


        }
    }

    public void regularToppingMenu(Sandwich superUberSandwich) {

        boolean regularToppingPicked = false;

        while (!regularToppingPicked) {
            System.out.println("""
                    
                     Select a Topping you would like to add onto your Sandwich.
                    
                    1) Lettuce
                    
                    2) Peppers
                    
                    3) Onions
                    
                    4) Tomatoes
                    
                    5) Jalepenos
                    
                    6) Cucumbers
                    
                    7) Pickles
                    
                    8) Guacamole
                    
                    9) Mushrooms
                    
                    10) No Toppings
                    
                    11) Cancel Order
                    
                    
                    """);
            String toppingPicker = user.nextLine();

            switch (toppingPicker) {

                case "1":
                    System.out.println(" You have selected Lettuce. ");
                    System.out.println(RegularToppings.LETTUCE);
                    superUberSandwich.setToppingList(RegularToppings.LETTUCE);
                    sauceMenu(superUberSandwich);
                    break;

                case "2":
                    System.out.println(" You have selected Peppers. ");
                    System.out.println(RegularToppings.PEPPERS);
                    superUberSandwich.setToppingList(RegularToppings.PEPPERS);
                    sauceMenu(superUberSandwich);
                    break;

                case "3":
                    System.out.println(" You have selected Onions. ");
                    System.out.println(RegularToppings.ONIONS);
                    superUberSandwich.setToppingList(RegularToppings.ONIONS);
                    sauceMenu(superUberSandwich);
                    break;

                case "4":
                    System.out.println(" You have selected Tomatoes. ");
                    System.out.println(RegularToppings.TOMATOES);
                    superUberSandwich.setToppingList(RegularToppings.TOMATOES);
                    sauceMenu(superUberSandwich);
                    break;

                case "5":
                    System.out.println(" You have selected Jalepenos. ");
                    System.out.println(RegularToppings.JALEPENOS);
                    superUberSandwich.setToppingList(RegularToppings.JALEPENOS);
                    sauceMenu(superUberSandwich);
                    break;


                case "6":
                    System.out.println(" You have selected Cucumbers. ");
                    System.out.println(RegularToppings.CUCUMBERS);
                    superUberSandwich.setToppingList(RegularToppings.CUCUMBERS);
                    sauceMenu(superUberSandwich);
                    break;

                case "7":
                    System.out.println(" You have selected Pickles. ");
                    System.out.println(RegularToppings.PICKLES);
                    superUberSandwich.setToppingList(RegularToppings.PICKLES);
                    sauceMenu(superUberSandwich);
                    break;

                case "8":
                    System.out.println(" You have selected Guacamole. ");
                    System.out.println(RegularToppings.GUACAMOLE);
                    superUberSandwich.setToppingList(RegularToppings.GUACAMOLE);
                    sauceMenu(superUberSandwich);
                    break;

                case "9":
                    System.out.println(" You have selected Pickles. ");
                    System.out.println(RegularToppings.MUSHROOMS);
                    superUberSandwich.setToppingList(RegularToppings.MUSHROOMS);
                    sauceMenu(superUberSandwich);
                    break;

                case "10":
                    System.out.println(" You have selected no Toppings. ");
                    sauceMenu(superUberSandwich);
                    break;

                case "11":
                    System.out.println(" Order has been cancelled. ");
                    createOrderMenu();
                    regularToppingPicked = true;
                    break;

                default:
                    System.out.println(" These options are not available. Please pick a provided option. ");
                    break;
            }
        }
    }

    public void sauceMenu(Sandwich superUberSandwich) {

        boolean saucePicked = false;

        while (!saucePicked) {
            System.out.println("""
                    
                     Select a Sauce you would like to add onto your Sandwich.
                    
                    1) Krabby Patty Formula
                    
                    2) Au Jus
                    
                    3) World's Spiciest Hot Sauce
                    
                    4) Mayo
                    
                    5) Mustard
                    
                    6) Ketchup
                    
                    7) Ranch
                    
                    8) Thousand Island
                    
                    9) Vinaigrette
                    
                    10) No Sauce
                    
                    11) Cancel Order
                    
                    
                    """);

            String saucePicker = user.nextLine();

            switch (saucePicker) {

                case "1":
                    System.out.println(" You have selected Krabby Patty Formula. ");
                    System.out.println(SauceFlavor.KRABBY_PATTY_FORMULA);
                    superUberSandwich.setSauceFlavor(SauceFlavor.KRABBY_PATTY_FORMULA);
                    sideMenu(superUberSandwich);
                    break;

                case "2":
                    System.out.println(" You have selected Au Jus. ");
                    System.out.println(SauceFlavor.AU_JUS);
                    superUberSandwich.setSauceFlavor(SauceFlavor.AU_JUS);
                    sideMenu(superUberSandwich);
                    break;

                case "3":
                    System.out.println(" You have selected World Spiciest Hot Sauce. ");
                    System.out.println(SauceFlavor.WORLDS_SPICIEST_HOT_SAUCE);
                    superUberSandwich.setSauceFlavor(SauceFlavor.WORLDS_SPICIEST_HOT_SAUCE);
                    sideMenu(superUberSandwich);
                    break;

                case "4":
                    System.out.println(" You have selected Mayo. ");
                    System.out.println(SauceFlavor.MAYO);
                    superUberSandwich.setSauceFlavor(SauceFlavor.MAYO);
                    sideMenu(superUberSandwich);
                    break;

                case "5":
                    System.out.println(" You have selected Mustard. ");
                    System.out.println(SauceFlavor.MUSTARD);
                    superUberSandwich.setSauceFlavor(SauceFlavor.MUSTARD);
                    sideMenu(superUberSandwich);
                    break;


                case "6":
                    System.out.println(" You have selected Ketchup. ");
                    System.out.println(SauceFlavor.KETCHUP);
                    superUberSandwich.setSauceFlavor(SauceFlavor.KETCHUP);
                    sideMenu(superUberSandwich);
                    break;

                case "7":
                    System.out.println(" You have selected Ranch. ");
                    System.out.println(SauceFlavor.RANCH);
                    superUberSandwich.setSauceFlavor(SauceFlavor.RANCH);
                    sideMenu(superUberSandwich);
                    break;

                case "8":
                    System.out.println(" You have selected Thousand Island. ");
                    System.out.println(SauceFlavor.THOUSAND_ISLAND);
                    superUberSandwich.setSauceFlavor(SauceFlavor.THOUSAND_ISLAND);
                    sideMenu(superUberSandwich);
                    break;

                case "9":
                    System.out.println(" You have selected Vinaigrette. ");
                    System.out.println(SauceFlavor.VINAIGRETTE);
                    superUberSandwich.setSauceFlavor(SauceFlavor.VINAIGRETTE);
                    sideMenu(superUberSandwich);
                    break;

                case "10":
                    System.out.println(" You have selected no Sauce. ");
                    sideMenu(superUberSandwich);
                    break;

                case "11":
                    System.out.println(" Order has been cancelled. ");
                    createOrderMenu();
                    saucePicked = true;
                    break;

                default:
                    System.out.println(" These options are not available. Please pick a provided option. ");
                    break;
            }

        }
    }

    public void sideMenu(Sandwich superUberSandwich) {

        boolean sidePicked = false;

        while (!sidePicked) {

            System.out.println("""
                    
                     Select a Topping you would like to add onto your Sandwich.
                    
                    1) Salt
                    
                    2) Pepper
                    
                    3) Pepper Flakes
                    
                    4) No Side
                    
                    5) Cancel Order
                    
                    """);

            String sidePicker = user.nextLine();

            switch (sidePicker) {

                case "1":
                    System.out.println(" You have selected Salt. ");
                    System.out.println(SideType.SALT);
                    superUberSandwich.setSideType(SideType.SALT);
                    createOrderMenu();
                    break;

                case "2":
                    System.out.println(" You have selected Pepper. ");
                    System.out.println(SideType.PEPPER);
                    superUberSandwich.setSideType(SideType.PEPPER);
                    createOrderMenu();
                    break;

                case "3":
                    System.out.println(" You have selected Pepper Flakes. ");
                    System.out.println(SideType.PEPPER_FLAKES);
                    superUberSandwich.setSideType(SideType.PEPPER_FLAKES);
                    createOrderMenu();
                    break;

                case "4":
                    System.out.println(" You have selected no Side. ");
                    createOrderMenu();
                    break;

                case "5":
                    System.out.println(" Order has been cancelled. ");
                    createOrderMenu();
                    sidePicked = true;
                    break;


                default:
                    System.out.println(" These options are not available. Please pick a provided option. ");
                    break;

            }
            orders.addOrderItem(superUberSandwich);
        }
    }

    public void drinkMakerMenu(Drink drinkSize) {

        boolean drinkConfirmed = false;

        while (!drinkConfirmed) {

            System.out.println("""
                    
                     Welcome to our drinks menu. What size drink would you like to get?
                    
                    1) Small
                    
                    2) Medium
                    
                    3) Large
                    
                    4) Cancel Drink Order
                    
                    """);

            String drinkPicker = user.nextLine();

            switch (drinkPicker) {

                case "1":
                    System.out.print(" You have selected Small. ");
                    System.out.printf("$%4.2f", DrinkSize.SMALL.getPrice());
                    drinkSize.setSize(DrinkSize.SMALL);
                    addDrinkToOrder(drinkSize);
                    drinkFlavorPicker();
                    break;

                case "2":
                    System.out.print(" You have selected Medium. ");
                    System.out.printf("$%4.2f", DrinkSize.MEDIUM.getPrice());
                    drinkSize.setSize(DrinkSize.MEDIUM);
                    addDrinkToOrder(drinkSize);
                    drinkFlavorPicker();
                    break;

                case "3":
                    System.out.print(" You have selected Large. ");
                    System.out.printf("$%4.2f", DrinkSize.LARGE.getPrice());
                    drinkSize.setSize(DrinkSize.LARGE);
                    addDrinkToOrder(drinkSize);
                    drinkFlavorPicker();
                    break;

                case "4":
                    System.out.println(" Order has been cancelled. ");
                    createOrderMenu();
                    drinkConfirmed = true;
                    break;


                default:
                    System.out.println(" These options are not available. Please pick a provided option. ");
                    break;

            }
            orders.addOrderItem(drinkSize);
        }

    }

    public void drinkFlavorPicker(Drink drinkFlavor) {

        boolean pickingFlavor = true;

        while (pickingFlavor) {

            System.out.println("""
                    
                    
                     What flavor would you like with your drink?
                    
                    1) HI-C
                    
                    2) Root Beer
                    
                    3) Rig Juice
                    
                    4) Butter Beer
                    
                    5) Heal Potion
                    
                    6) Cancel Drink Order
                    
                    """);

            String drinkFlavorPicker = user.nextLine();

            switch (drinkFlavorPicker) {

                case "1":
                    System.out.print(" You have selected: ");
                    System.out.printf("%2s", Drink.DrinkFlavor.HI_C);
                    drinkFlavor.setFlavor(Drink.DrinkFlavor.HI_C);
                    addDrinkToOrder();
                    createOrderMenu();
                    break;

                case "2":
                    System.out.print(" You have selected: ");
                    System.out.printf("%2s", Drink.DrinkFlavor.ROOT_BEER);
                    drinkFlavor.setFlavor(Drink.DrinkFlavor.ROOT_BEER);
                    createOrderMenu();
                    break;

                case "3":
                    System.out.print(" You have selected: ");
                    System.out.printf("%2s", Drink.DrinkFlavor.RIG_JUICE);
                    drinkFlavor.setFlavor(Drink.DrinkFlavor.RIG_JUICE);
                    createOrderMenu();
                    break;

                case "4":
                    System.out.print(" You have selected: ");
                    System.out.printf("%2s", Drink.DrinkFlavor.BUTTER_BEER);
                    drinkFlavor.setFlavor(Drink.DrinkFlavor.BUTTER_BEER);
                    createOrderMenu();
                    break;

                case "5":
                    System.out.print(" You have selected: ");
                    System.out.printf("%2s", Drink.DrinkFlavor.HEAL_POTION);
                    drinkFlavor.setFlavor(Drink.DrinkFlavor.HEAL_POTION);
                    createOrderMenu();
                    break;

                case "6":
                    System.out.println(" Drink has been cancelled. ");
                    pickingFlavor = false;
                    createOrderMenu();

                default:
                    System.out.println(" These options are not available. Please pick a provided option. ");
                    break;
                    
            }
            orders.addOrderItem(drinkFlavor);
        }
    }

    public void chipMakerMenu(Chips chipFlavor) {

        boolean chipsPicked = false;

        while (!chipsPicked) {

            System.out.println("""
                    
                    
                    Welcome to our drinks menu. What size drink would you like to get?
                    
                    1) BBQ
                    
                    2) Sour Cream and Onion
                    
                    3) Honey Butter
                    
                    4) Classic
                    
                    5) Salt and Vinegar
                    
                    6) Cancel Chips Order
                    
                    """);

            String chipsPicker = user.nextLine();

            switch (chipsPicker) {

                case "1":
                    System.out.print(" You have selected: ");
                    System.out.printf("%2s", Chips.ChipFlavor.BBQ);
                    addChipsToOrder(Chips.ChipFlavor.BBQ);
                    chipsPicked = true;
                    break;

                case "2":
                    System.out.print(" You have selected: ");
                    System.out.printf("%2s", Chips.ChipFlavor.SOUR_CREAM_AND_ONION);
                    chipsPicked = true;
                    addChipsToOrder(Chips.ChipFlavor.SOUR_CREAM_AND_ONION);
                    break;

                case "3":
                    System.out.print(" You have selected: ");
                    System.out.printf("%2s", Chips.ChipFlavor.HONEY_BUTTER);
                    addChipsToOrder(Chips.ChipFlavor.HONEY_BUTTER);
                    chipsPicked = true;
                    break;

                case "4":
                    System.out.print(" You have selected: ");
                    System.out.printf("%2s", Chips.ChipFlavor.CLASSIC);
                    addChipsToOrder(Chips.ChipFlavor.CLASSIC);
                    chipsPicked = true;
                    break;

                case "5":
                    System.out.print(" You have selected: ");
                    System.out.printf("%2s", Chips.ChipFlavor.SALT_AND_VINEGAR);
                    addChipsToOrder(Chips.ChipFlavor.SALT_AND_VINEGAR);
                    chipsPicked = true;
                    break;


                default:
                    System.out.println(" These options are not available. Please pick a provided option. ");
                    break;
                    
            }
            orders.addOrderItem(chipFlavor);
        }
    }
}