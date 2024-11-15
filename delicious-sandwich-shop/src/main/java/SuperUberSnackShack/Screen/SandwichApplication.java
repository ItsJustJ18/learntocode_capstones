package SuperUberSnackShack.Screen;

import EnumClasses.BreadLength;
import EnumClasses.BreadType;
import SuperUberSnackShack.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SandwichApplication {

    private final Scanner user = new Scanner(System.in);

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
                    
                    """);

            String decision = user.nextLine();

            switch (decision) {

                case "1":
                    //activates the sandwich screen for the user to make a sandwich
                    sandwichMakerMenu();
                    break;

//                case "2":
                //activates the drinkMakerMenu for people that would like to add a drink
//                    drinkMakerMenu();
//                    break;
//
//                case "3":
                //activates the chipMakerMenu for people that would like to add a chip
//                    chipMakerMenu();
//                    break;
                case "4":
                    System.out.println(" Your Items: ");

                case "5":
                    checkOutMenu();

                case "6":
                    System.out.println(" Order has been removed. ");
                    createOrderMenu();
                    break;

                default:
                    System.out.println(" Invalid response. Please select from the options provided. ");

            }
        }
    }
    public void checkOutMenu() {


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
                    breadPicker();
                    break;

                case "2":
                    System.out.println(" You have selected Eight (8) Inches ");
                    System.out.printf("%2s $%4.2f", BreadLength.EIGHT_INCHES.getBreadLength(), BreadLength.EIGHT_INCHES.getPrice());
                    breadPicker();
                    break;

                case "3":
                    System.out.println(" You have selected Twelve (12) Inches");
                    System.out.printf("%2s $%4.2f", BreadLength.TWELVE_INCHES.getBreadLength(), BreadLength.TWELVE_INCHES.getPrice());
                    breadPicker();
                    break;

                case "4":
                    createOrderMenu();
                    sandwichBuilder = false;

                default:
                    System.out.println("Invalid option has been detected. Please pick from the following options. ");
                    break;
            }
        }
    }

    public void breadPicker() {

        boolean breadPicked = false;

        while (!breadPicked) {

            System.out.println("""
                    
                    
                    Select a bread type from the options below:
                    
                    1) White
                    
                    2) Wheat
                    
                    3) Rye
                    
                    4) Wrap
                    
                    """);

            String breadPick = user.nextLine();

            switch (breadPick) {
                case "1":
                    System.out.println(" You have selected White bread. ");
                    System.out.print(BreadType.WHITE + " FREE ");
                    pickTheCheese();
                    break;

                case "2":
                    System.out.println(" You have selected Wheat bread.");
                    System.out.print(BreadType.WHEAT + " FREE ");
                    pickTheCheese();
                    break;

                case "3":
                    System.out.println(" You have selected Rye bread. ");
                    System.out.print(BreadType.RYE + " FREE ");
                    pickTheCheese();
                    break;

                case "4":
                    System.out.println(" You have selected Wrap style. ");
                    System.out.print(BreadType.WRAP + " FREE ");
                    pickTheCheese();
                    break;

                case "5":

                default:
                    System.out.println(" These options are not available. Please pick a provided option. ");
                    break;
            }

        }

    }

    public void pickTheCheese() {

        boolean cheesePicked = false;

        while (!cheesePicked) {
            System.out.print("""
                    
                    Select a cheese you would like.
                    
                    1) American Cheese
                    
                    2) Provolone
                    
                    3) Cheddar
                    
                    4) Swiss
                    
                    """);
            String cheesePick = user.nextLine();

            switch (cheesePick) {

                case "1":
                    System.out.println(" You have selected American Cheese. ");
                    System.out.print(Cheese.CheeseType.AMERICAN);
                    meatPickerMenu();
            }

        }

    }
}
