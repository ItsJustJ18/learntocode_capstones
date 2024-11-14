package SuperUberSnackShack.Screen;

import EnumClasses.BreadLength;
import EnumClasses.BreadType;
import SuperUberSnackShack.Topping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SandwichApplication {

    private final Scanner user = new Scanner(System.in);
    private double breadLengthPrice;
    private List<Topping> toppingsOnSandwich = new ArrayList<>();

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
                    
                    4) Checkout (Pay for Order)
                    
                    5) Cancel Order (Delete Order)
                    
                    """);

            String decision = user.nextLine();

            switch (decision) {

                case "1":
                    //activates the sandwich screen for the user to make a sandwich
                    sandwichMakerMenu();
                    break;

//                case "2":
//                    drinkMakerMenu();
//                    break;
//
//                case "3":
//                    chipMakerMenu();
//                    break;

                case "4":
                    System.out.println(" Ready to checkout? ");
                    orderIsDone = true;

                default:
                    System.out.println(" Invalid response. Please select from the options provided. ");

            }


        }

    }

    public void sandwichMakerMenu() {

        Sandwich superUberSandwich = new Sandwich(BreadLength, BreadType, toppingsOnSandwich, )

        boolean sandwichBuilder = true;

        while (sandwichBuilder) {

            System.out.print("""
                    
                    Select a bread length that you wish.
                    
                    1) 4" Inches $5.50
                    
                    2) 8" Inches $7.00
                    
                    3) 12" Inches $8.50
                    
                    """);

            String choice = user.nextLine();

            switch (choice) {
                case "1":
                    System.out.println(" You have selected Four (4) Inches ");
                    System.out.printf("%2s $%4.2f", BreadLength.FOUR_INCHES.getBreadLength(), BreadLength.FOUR_INCHES.getPrice());
                    break;

                case "2":
                    System.out.println(" You have selected Eight (8) Inches ");
                    System.out.printf("%2s $%4.2f", BreadLength.EIGHT_INCHES.getBreadLength(), BreadLength.EIGHT_INCHES.getPrice());
                    break;

                case "3":
                    System.out.println(" You have selected Twelve (12) Inches");
                    System.out.printf("%2s $%4.2f", BreadLength.TWELVE_INCHES.getBreadLength(), BreadLength.EIGHT_INCHES.getPrice());
                    break;

                default:
                    System.out.println("Invalid option has been detected. Please pick from the following options. ");
            }
            return;
        }
    }
}
    public void breadPicker() {

        while (sandwichBuilder) {

            System.out.println("""
                    Select a Bread of your choosing.

                    1) White

                    2) Wheat

                    3) Rye

                    4) Wrap

                    """);
            switch (choice) {

                case "1":
                    System.out.println();
            }
        }
    }
}




