package com.pluralsight.delishop;

import java.util.Scanner;

public class SandwichApplication {

    public static String picker;


    Scanner user = new Scanner(System.in);

    boolean sandwichShopIsOpen = true;

    public void customerOrderScreen() {

        while (sandwichShopIsOpen) {

            System.out.print("""
                    
                    Super Uber Snack Shack
                    
                    Welcome value customer, what would you like to order today?
                    
                    1) Make a new order
                    
                    2) Leave the Super Uber Snack Shack
                    
                    """);

            picker = user.nextLine();

            switch (picker) {

                case "1":
                    System.out.println("Order in Progress");
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
    private void createOrderMenu() {
        System.out.println("""
                You have entered the order menu. What would like to add with your order?
                
                1) Make a Super Uber Sandwich
                
                2) Add a Drink
                
                3) Add A Chip
                
                4) Checkout (Pay for Order)
                
                5) Cancel Order (Delete Order)
                
                """);
    }
}