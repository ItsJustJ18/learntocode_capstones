import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalTime;

import static java.time.LocalDate.*;

public class Ledger {

    public static void main(String[] args) throws IOException {

        //the amount that could be in the user's account
        double userAccount = 0;
        //scanner to read the user's input whenever we asked for it
        Scanner userInput = new Scanner(System.in);
        //variable chosen as to detect a user
        String choice;
        //to tell the local time when using LocalTime.now
        LocalTime currentTime = LocalTime.now();
        //boolean while loop until statement is false
        boolean user_choice = true;
        while (user_choice) {
            System.out.print("""
                    Welcome to Banking of Money, what could we do for you today?
                    
                    Press and enter D to make a deposit
                    Press and enter P to make a payment or pay off a debt
                    Press and enter L for Ledger screen option
                    Press and enter X to exit the application
                    """);

            choice = userInput.nextLine();
            if (choice.equals("D")) {

                //user determines how much they would like to deposit into the prompt
                System.out.println("How much of a deposit are we going to make today? ");
                double depositAmount = userInput.nextDouble();
                userInput.nextLine();

                //user tell who is paying them
                System.out.println("Who is paying you? ");
                String payer = userInput.nextLine();

                //the description of the payment being made to user
                System.out.println("What is the payment for? ");
                String description = userInput.nextLine();

                //what's their association with them or company they are with
                System.out.println("What business or association do they have? ");
                String vendor = userInput.nextLine();

                //user's original amount in bank account then adds it to the account
                userAccount = userAccount + depositAmount;

                //prints total of user account and then prints rest of info on separate lines
                System.out.printf("You now have: $%.2f", userAccount);
                System.out.println();
                System.out.println("Here's the transaction made to your account: ");
                System.out.printf("Date: " + String.valueOf(LocalDate.now()) + " Time: " + LocalTime.now().withNano(0) + " Desc: " + description + " Vendor: " + vendor + " Account Amount: $%.2f", userAccount);
                System.out.println();
                //to do show money they want to add to the account
                //to do show money that's added to the account (no calculations)
                // consume the leftover new line character

            } else if (choice.equals("P")) {
                String statement = "";
                System.out.println("What would you like to make a payment towards and the amount? ");
                double paymentAmount = userInput.nextDouble();
                statement = statement + paymentAmount + " | ";
                userInput.nextLine();

                System.out.println("Who are you going to pay towards? ");
                String payer = userInput.nextLine();
                statement = statement + payer;
                //to do show money they want to subtract towards the account
                //to do show money that's being subtracted from the account (no calculations)

                System.out.println("What is the payment for? ");
                String description = userInput.nextLine();
                statement = statement + description;

                System.out.println("What is your business or association? ");
                String vendor = userInput.nextLine();
                statement = statement + vendor;

                userAccount = userAccount - paymentAmount;

                System.out.printf("You now have: $%.2f", userAccount);
                System.out.println();
                System.out.println("Here's the transaction made to your account: ");
                System.out.printf("Date: " + String.valueOf(LocalDate.now()) + " Time: " + LocalTime.now().withNano(0) + " Desc: " + description + " Vendor: " + vendor + " Account Amount: $%.2f", userAccount);
                System.out.println();


            } else if (choice.equals("L")) {

                FileReader ledgerreader = new FileReader("./src/main/resources/transaction.csv");
                BufferedReader bufferedReader = new BufferedReader(ledgerreader);
                String superReader = bufferedReader.readLine();

                System.out.println("Here's all of the entries made during your time with us. Please select the following options if needed for filtering or anything else. ");
                boolean ledger_decision = true;
                while (ledger_decision) {
                    System.out.println("""
                            You can choose from to see more:
                            Press and enter A to see all entries that have been made this session.
                            Press and enter D to see deposits made only to this account.
                            Press and enter P to see payments that are outgoing from this account.
                            Press and enter R to see any reports made or make a search for what you're looking for.
                            Press and enter H to return to the home screen.
                            """);
                    choice = userInput.nextLine();

                    boolean transaction_reader = true;

                    if (choice.equals("A")) {
                        System.out.println("These are the following entries made to your account as of " + LocalTime.now().withNano(0) + " " + now());
                        while ((superReader = bufferedReader.readLine()) != null) {
                            String[] boomba = superReader.split("\\|");
                            Transactions transaction = new Transactions((parse(boomba[0])), ((LocalTime.parse(boomba[1]))), (boomba[2]), (boomba[3]), (Double.parseDouble(boomba[4])));
                            System.out.println(transaction);
                            //print all transactions made from the user

                        }
                    } else if (choice.equals("D")) {

                        System.out.println("Here are all the deposits made so far. ");
                        while ((superReader = bufferedReader.readLine()) != null) {
                            String[] boomba = superReader.split("\\|");
                            Transactions transaction = new Transactions((parse(boomba[0])), ((LocalTime.parse(boomba[1]))), (boomba[2]), (boomba[3]), (Double.parseDouble(boomba[4])));
                            if (transaction.getUserAmount() > 0) {
                                System.out.println(transaction);
                            }


                        }


                        //to do get all listed deposits made in the project
                    } else if (choice.equals("P")) {

                        System.out.println("Here are all the payments you have made so far. ");
                        String[] boomba = superReader.split("\\|");
                        Transactions transaction = new Transactions((parse(boomba[0])), ((LocalTime.parse(boomba[1]))), (boomba[2]), (boomba[3]), (Double.parseDouble(boomba[4])));
                        if (transaction.getUserAmount() < 0) {
                            System.out.println(transaction);

                        } else if (choice.equals("R")) {

                            System.out.println("Select one of the options below to fit your needs. ");
                        }
                    } else {

                        System.out.println("Sorry but that isn't one of the following options provided. Please select either D (deposit), P (make payment), L (Ledger), or X (Exit application). ");
                    }

                }
            } else if (choice.equals("X")) {

                user_choice = false;

                System.out.println("Thank you for visiting and we hope for your return to do more business with us. ");
            }
        }
    }
}




