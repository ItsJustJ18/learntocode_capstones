package SuperUberSnackShack.UserInterface;

import EnumClasses.*;
import EnumClasses.RegularToppings;
import ReceiptKeeper.PrintReceipt;
import SuperUberSnackShack.*;
import java.util.Scanner;
import static EnumClasses.DrinkSize.SMALL;

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
                    customerOrderSummary();

                case "5":
                    orderIsDone = true;
                    checkOutMenu(orders);
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

    public void customerOrderSummary() {
        System.out.println("""
                
                ︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿
                                  ORDER SUMMARY
                ︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿
                
                """);
        System.out.println(orders.getItemList());
        for (Items item : orders.getItemList()) {
            if (item instanceof Sandwich superUberSandwich) {
                System.out.print(" \n BreadLength:" + " " + superUberSandwich.getBreadLength());
                System.out.print(" \n Bread:" + " " + superUberSandwich.getBreadType());
                System.out.print(" \n Sandwich Toasted:" + superUberSandwich.isToastedSandwich());
                System.out.print(" \n Meat(s):" + " " + superUberSandwich.getBigMeats());
                System.out.print(" \n Cheese(s):" + " " + superUberSandwich.getCheeses());
                System.out.print(" \n Topping(s):" + " " + superUberSandwich.getToppingList());
                System.out.print(" \n Extra Topping(s):" + " " + superUberSandwich.isHaveExtraToppings());
                System.out.print(" \n Sauce:" + " " + superUberSandwich.getSauceFlavor());
                System.out.print(" \n Side(s):" + " " + superUberSandwich.getSideType());
                System.out.printf(" \n Total Price of Sandwich:  $%2.2f", superUberSandwich.getPrice());

            } else if (item instanceof Drink drink) {
                System.out.print(" \n Flavor: " + drink.getFlavor());
                System.out.print(" \n Size: " + drink.getSize());
                System.out.printf(" \n Price of Drink:  $%4.2f", drink.getPrice());

            } else if (item instanceof Chips chips) {
                System.out.print(" \n Flavor: " + chips.getChipName());
                System.out.printf(" \n Price of Chips:  $%4.2f", chips.getPrice());
            } else {
                System.out.println(" There is no order to price. ");
            }

        }
        System.out.println("\n ︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿");
        System.out.printf(" Total Price of Order: $%4.2f", Orders.totalPriceOfOrder());
        System.out.println("\n ︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿");
    }


    public void checkOutMenu(Orders orders) {

        boolean leave = true;

        while (leave) {
            String userLeaves = user.nextLine();

            System.out.println(" Ready to checkout? Select y for yes and n for no. ");

            if (userLeaves.equalsIgnoreCase("y")) {

                System.out.println("Here's your order and have a nice day!");

                PrintReceipt.makeReceipt(orders);
                customerOrderScreen();

            } else if (userLeaves.equalsIgnoreCase("n")) {
                System.out.println(" Now Returning. ");
                customerOrderScreen();
                leave = false;
            } else {
                System.out.println(" Must select Y for yes or N for no. ");
            }

        }
    }

    public void sandwichMakerMenu() {

        Sandwich superUberSandwich = new Sandwich();

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
                    wantsExtraCheese(superUberSandwich);
                    break;

                case "2":
                    System.out.println(" You have selected Provolone Cheese. ");
                    System.out.println(Cheese.CheeseType.PROVOLONE);
                    superUberSandwich.setCheeses(Cheese.CheeseType.PROVOLONE);
                    wantsExtraCheese(superUberSandwich);
                    break;

                case "3":
                    System.out.println(" You have selected Cheddar Cheese. ");
                    System.out.println(Cheese.CheeseType.CHEDDAR);
                    superUberSandwich.setCheeses(Cheese.CheeseType.CHEDDAR);
                    wantsExtraCheese(superUberSandwich);
                    break;

                case "4":
                    System.out.println(" You have selected Swiss Cheese. ");
                    System.out.println(Cheese.CheeseType.SWISS);
                    superUberSandwich.setCheeses(Cheese.CheeseType.SWISS);
                    wantsExtraCheese(superUberSandwich);
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

    public void wantsExtraCheese(Sandwich superUberSandwich) {

        boolean wantsExtra = false;

        System.out.println(" Would you like to add extra cheese? Yes or No ");
        String userChoice = user.nextLine();
        if (userChoice.equalsIgnoreCase("yes")) {

            wantsExtra = true;
            superUberSandwich.setHaveExtraToppings(true);

        } else if (userChoice.equalsIgnoreCase("no")) {

            superUberSandwich.setHaveExtraToppings(false);
            System.out.println(" No extra cheese. ");

        } else {
            System.out.println(" Please either Yes or No. ");
        }
        meatPickerMenu(superUberSandwich);
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
                    wantsExtraMeat(superUberSandwich);
                    break;

                case "2":
                    System.out.println(" You have selected Ham. ");
                    System.out.println(Meat.Meats.HAM);
                    superUberSandwich.setBigMeats(Meat.Meats.HAM);
                    wantsExtraMeat(superUberSandwich);
                    break;

                case "3":
                    System.out.println(" You have selected Salami. ");
                    System.out.println(Meat.Meats.SALAMI);
                    superUberSandwich.setBigMeats(Meat.Meats.SALAMI);
                    wantsExtraMeat(superUberSandwich);
                    break;

                case "4":
                    System.out.println(" You have selected Roast Beef. ");
                    System.out.println(Meat.Meats.ROAST_BEEF);
                    superUberSandwich.setBigMeats(Meat.Meats.ROAST_BEEF);
                    wantsExtraMeat(superUberSandwich);
                    break;

                case "5":
                    System.out.println(" You have selected Chicken. ");
                    System.out.println(Meat.Meats.CHICKEN);
                    superUberSandwich.setBigMeats(Meat.Meats.CHICKEN);
                    wantsExtraMeat(superUberSandwich);


                case "6":
                    System.out.println(" You have selected Bacon. ");
                    System.out.println(Meat.Meats.BACON);
                    superUberSandwich.setBigMeats(Meat.Meats.BACON);
                    wantsExtraMeat(superUberSandwich);

                case "7":
                    System.out.println(" You have selected no Meat. ");
                    wantsExtraMeat(superUberSandwich);

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

    public void wantsExtraMeat(Sandwich superUberSandwich) {

        boolean wantsExtra = false;

        System.out.println(" Would you like to add extra meat? Yes or No ");
        String userChoice = user.nextLine();
        if (userChoice.equalsIgnoreCase("yes")) {

            wantsExtra = true;
            superUberSandwich.setHaveExtraToppings(true);

        } else if (userChoice.equalsIgnoreCase("no")) {

            superUberSandwich.setHaveExtraToppings(false);
            System.out.println(" No extra meat. ");

        } else {
            System.out.println(" Please either Yes or No. ");
        }
        regularToppings(superUberSandwich);

    }

    public void regularToppings(Sandwich superUberSandwich) {

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
                    wantsExtraToppings(superUberSandwich);
                    break;

                case "2":
                    System.out.println(" You have selected Peppers. ");
                    System.out.println(RegularToppings.PEPPERS);
                    superUberSandwich.setToppingList(RegularToppings.PEPPERS);
                    wantsExtraToppings(superUberSandwich);
                    break;

                case "3":
                    System.out.println(" You have selected Onions. ");
                    System.out.println(RegularToppings.ONIONS);
                    superUberSandwich.setToppingList(RegularToppings.ONIONS);
                    wantsExtraToppings(superUberSandwich);
                    break;

                case "4":
                    System.out.println(" You have selected Tomatoes. ");
                    System.out.println(RegularToppings.TOMATOES);
                    superUberSandwich.setToppingList(RegularToppings.TOMATOES);
                    wantsExtraToppings(superUberSandwich);
                    break;

                case "5":
                    System.out.println(" You have selected Jalepenos. ");
                    System.out.println(RegularToppings.JALEPENOS);
                    superUberSandwich.setToppingList(RegularToppings.JALEPENOS);
                    wantsExtraToppings(superUberSandwich);
                    break;


                case "6":
                    System.out.println(" You have selected Cucumbers. ");
                    System.out.println(RegularToppings.CUCUMBERS);
                    superUberSandwich.setToppingList(RegularToppings.CUCUMBERS);
                    wantsExtraToppings(superUberSandwich);
                    break;

                case "7":
                    System.out.println(" You have selected Pickles. ");
                    System.out.println(RegularToppings.PICKLES);
                    superUberSandwich.setToppingList(RegularToppings.PICKLES);
                    wantsExtraToppings(superUberSandwich);
                    break;

                case "8":
                    System.out.println(" You have selected Guacamole. ");
                    System.out.println(RegularToppings.GUACAMOLE);
                    superUberSandwich.setToppingList(RegularToppings.GUACAMOLE);
                    wantsExtraToppings(superUberSandwich);
                    break;

                case "9":
                    System.out.println(" You have selected Pickles. ");
                    System.out.println(RegularToppings.MUSHROOMS);
                    superUberSandwich.setToppingList(RegularToppings.MUSHROOMS);
                    wantsExtraToppings(superUberSandwich);
                    break;

                case "10":
                    System.out.println(" You have selected no Toppings. ");
                    wantsExtraToppings(superUberSandwich);
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

    public void wantsExtraToppings(Sandwich superUberSandwich) {

        boolean wantsExtra = false;

        System.out.println(" Would you like to add extra toppings? Yes or No ");
        String userChoice = user.nextLine();
        if (userChoice.equalsIgnoreCase("yes")) {

            wantsExtra = true;
            superUberSandwich.setHaveExtraToppings(true);

        } else if (userChoice.equalsIgnoreCase("no")) {

            System.out.println(" No extra cheese. ");
            superUberSandwich.setHaveExtraToppings(false);

        } else {
            System.out.println(" Please either Yes or No. ");
        }
        wantsSandwichToasted(superUberSandwich);
    }

    public void wantsSandwichToasted(Sandwich superUberSandwich) {

        boolean sandwichIsToasted = false;

        while (!sandwichIsToasted) {
            System.out.println(" Do you want your sandwich toasted? Yes or No? ");
            String userChoice = user.nextLine();

            if (userChoice.equalsIgnoreCase("yes")) {

                System.out.println(" Sandwich will be toasted. ");
                superUberSandwich.setToastedSandwich(true);


            } else if (userChoice.equalsIgnoreCase("no")) {

                System.out.println(" Sandwich will not be toasted. ");
                superUberSandwich.setToastedSandwich(false);


            } else {
                System.out.println(" Please say if you would like it toasted or not. ");
            }
            sauceMenu(superUberSandwich);
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
                    orders.addOrderItem(superUberSandwich);
                    createOrderMenu();
                    break;

                case "2":
                    System.out.println(" You have selected Pepper. ");
                    System.out.println(SideType.PEPPER);
                    superUberSandwich.setSideType(SideType.PEPPER);
                    orders.addOrderItem(superUberSandwich);
                    createOrderMenu();
                    break;

                case "3":
                    System.out.println(" You have selected Pepper Flakes. ");
                    System.out.println(SideType.PEPPER_FLAKES);
                    superUberSandwich.setSideType(SideType.PEPPER_FLAKES);
                    orders.addOrderItem(superUberSandwich);
                    createOrderMenu();
                    break;

                case "4":
                    System.out.println(" You have selected no Side. ");
                    orders.addOrderItem(superUberSandwich);
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
        }
    }

    public void drinkMakerMenu() {

        Drink drink = new Drink();

        DrinkSize size;

        boolean drinkConfirmed = false;

        while (!drinkConfirmed) {

            System.out.println("""
                    
                     Welcome to our drinks menu. What size drink would you like to get?
                    
                    1) Small
                    
                    2) Medium
                    
                    3) Large
                    
                    4) Cancel Drink Order
                    
                    """);

            String drinkPicker = user.nextLine().toUpperCase();

            switch (drinkPicker) {

                case "SMALL":
                    System.out.print(" You have selected Small. ");
                    System.out.printf("$%4.2f", SMALL.getPrice());
                    size = DrinkSize.valueOf(drinkPicker);
                    drink.setSize(size);
                    drinkFlavorPicker(drink);
                    break;

                case "MEDIUM":
                    System.out.print(" You have selected Medium. ");
                    System.out.printf("$%4.2f", DrinkSize.MEDIUM.getPrice());
                    size = DrinkSize.valueOf(drinkPicker);
                    drink.setSize(size);
                    drinkFlavorPicker(drink);
                    break;

                case "LARGE":
                    System.out.print(" You have selected Large. ");
                    System.out.printf("$%4.2f", DrinkSize.LARGE.getPrice());
                    size = DrinkSize.valueOf(drinkPicker);
                    drink.setSize(size);
                    drinkFlavorPicker(drink);
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
        }
    }

    public void drinkFlavorPicker(Drink drink) {

        DrinkFlavor flavor;

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

            String drinkFlavorPicker = user.nextLine().toUpperCase();

            switch (drinkFlavorPicker) {

                case "HI_C":
                    System.out.print(" You have selected: ");
                    System.out.printf("%2s", DrinkFlavor.HI_C);
                    flavor = DrinkFlavor.valueOf(drinkFlavorPicker);
                    drink.setFlavor(flavor);
                    orders.addOrderItem(drink);
                    createOrderMenu();
                    break;

                case "ROOT_BEER":
                    System.out.print(" You have selected: ");
                    System.out.printf("%2s", DrinkFlavor.ROOT_BEER);
                    flavor = DrinkFlavor.valueOf(drinkFlavorPicker);
                    drink.setFlavor(flavor);
                    orders.addOrderItem(drink);
                    createOrderMenu();
                    break;

                case "RIG_JUICE":
                    System.out.print(" You have selected: ");
                    System.out.printf("%2s", DrinkFlavor.RIG_JUICE);
                    flavor = DrinkFlavor.valueOf(drinkFlavorPicker);
                    drink.setFlavor(flavor);
                    orders.addOrderItem(drink);
                    createOrderMenu();
                    break;

                case "BUTTER_BEER":
                    System.out.print(" You have selected: ");
                    System.out.printf("%2s", DrinkFlavor.BUTTER_BEER);
                    flavor = DrinkFlavor.valueOf(drinkFlavorPicker);
                    drink.setFlavor(flavor);
                    orders.addOrderItem(drink);
                    createOrderMenu();
                    break;

                case "HEAL_POTION":
                    System.out.print(" You have selected: ");
                    System.out.printf("%2s", DrinkFlavor.HEAL_POTION);
                    flavor = DrinkFlavor.valueOf(drinkFlavorPicker);
                    drink.setFlavor(flavor);
                    orders.addOrderItem(drink);
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
        }
    }

    public void chipMakerMenu() {

        ChipFlavor flavor;

        Chips chips = new Chips();

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

            String chipsPicker = user.nextLine().toUpperCase();

            switch (chipsPicker) {

                case "BBQ":
                    System.out.print(" You have selected: ");
                    System.out.printf("%s", ChipFlavor.BBQ);
                    flavor = ChipFlavor.valueOf(chipsPicker);
                    chips.setChipName(flavor);
                    chipsPicked = true;
                    break;

                case "SOUR_CREAM_AND_ONION":
                    System.out.print(" You have selected: ");
                    System.out.printf("%s", ChipFlavor.SOUR_CREAM_AND_ONION);
                    flavor = ChipFlavor.valueOf(chipsPicker);
                    chips.setChipName(flavor);
                    chipsPicked = true;
                    break;

                case "HONEY_BUTTER":
                    System.out.print(" You have selected: ");
                    System.out.printf("%s", ChipFlavor.HONEY_BUTTER);
                    flavor = ChipFlavor.valueOf(chipsPicker);
                    chips.setChipName(flavor);
                    chipsPicked = true;
                    break;

                case "CLASSIC":
                    System.out.print(" You have selected: ");
                    System.out.printf("%s", ChipFlavor.CLASSIC);
                    flavor = ChipFlavor.valueOf(chipsPicker);
                    chips.setChipName(flavor);
                    chipsPicked = true;
                    break;

                case "SALT_AND_VINEGAR":
                    System.out.print(" You have selected: ");
                    System.out.printf("%s", ChipFlavor.SALT_AND_VINEGAR);
                    flavor = ChipFlavor.valueOf(chipsPicker);
                    chips.setChipName(flavor);
                    chipsPicked = true;
                    break;


                default:
                    System.out.println(" These options are not available. Please pick a provided option. ");
                    break;

            }
            orders.addOrderItem(chips);
        }
    }
}