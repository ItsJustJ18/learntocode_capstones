import java.io.*;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalTime;

import static java.time.LocalDate.*;

public class Ledger {
    public static String choice;
    public static List<Transactions> allTransactions;
    public static final String filePath = "src/main/resources/transaction.csv";
    static  Scanner userInput;


    public static void main(String[] args) throws IOException {
        //load in all transactions from csv file
        allTransactions = loadTransactions();


        //the amount that could be in the user's account
        double userAccount = 0;
        //scanner to read the user's input whenever we asked for it
        userInput = new Scanner(System.in);
        //variable chosen as to detect a user
        //to tell the local time when using LocalTime.now
        LocalTime currentTime = LocalTime.now();
        String filecontents;




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
                System.out.printf("Date: " + String.valueOf(now()) + " Time: " + LocalTime.now().withNano(0) + " Desc: " + description + " Vendor: " + vendor + " Account Amount: $%.2f", userAccount);
                System.out.println();
                //to do show money they want to add to the account
                //to do show money that's added to the account (no calculations)
                // consume the leftover new line character

                Transactions payTransaction = new Transactions(LocalDate.now(),LocalTime.now().withNano(0),description, vendor,depositAmount);

                writeToCsvFile(payTransaction);
                allTransactions.add(payTransaction);
            //    System.out.println(allTransactions);

            } else if (choice.equals("P")) {
                String statement = "";
                System.out.println("What would you like to make a payment amount? ");
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
                System.out.printf("Date: " + String.valueOf(now()) + " Time: " + LocalTime.now().withNano(0) + " Desc: " + description + " Vendor: " + vendor + " Account Amount: $%.2f", userAccount);
                System.out.println();

               Transactions payTransaction = new Transactions(LocalDate.now(),LocalTime.now().withNano(0),description, vendor,-paymentAmount);
                allTransactions.add(payTransaction);
               writeToCsvFile(payTransaction);


            } else if (choice.equals("L")) {

                FileReader ledgerreader = new FileReader(filePath);
                BufferedReader bufferedReader = new BufferedReader(ledgerreader);
                String superReader = bufferedReader.readLine();

                boolean ledger_decision = true;

                while (ledger_decision) {

                    System.out.println("""
                            
                            You can choose from to see more:
                            Press and enter A to see all entries that have been made.
                            Press and enter D to see deposits made only to this account.
                            Press and enter P to see payments that are outgoing from this account.
                            Press and enter R to see any reports made or make a search for what you're looking for.
                            Press and enter H to return to the home screen.
                            
                            """);
                    choice = userInput.nextLine();

                 //   boolean display_return = true;

                    if(choice.equals("A")) {
                        System.out.println("These are the following entries made to your account as of " + LocalTime.now().withNano(0) + " " + now());
                        for(Transactions transaction: allTransactions){
                            System.out.println(transaction);
                        }
                    } else if (choice.equals("D")) {

                        System.out.println("Here are all the deposits made so far. ");

                        for(Transactions transaction: allTransactions){
                            if( transaction.getUserAmount() > 0 ){
                                System.out.println(transaction);
                            }
                        }

                        //to do get all listed deposits made in the project
                    } else if (choice.equals("P")) {
                        System.out.println("Here are all the payments you have made so far. ");

                        for(Transactions transaction: allTransactions){
                            if( transaction.getUserAmount() < 0 ){
                                System.out.println(transaction);
                            }
                        }

                    } else if(choice.equals("R")){

                        System.out.println("Reports menu");
                        //reportts menu
                        reportsPage();
                    } else if (choice.equals("H")) {
                       ledger_decision = false;
                       // return;
                    } else {
                          System.out.println("Sorry but that isn't one of the following options provided. Please select either D (deposit), P (make payment), L (Ledger), R (Reports), or H (Home Screen). ");

                    }
                }

            } else if (choice.equals("X")) {

                user_choice = false;

                System.out.println("Thank you for visiting and we hope for your return to do more business with us. ");
            }
        }

    }

    public static void reportsPage() {

        boolean make_your_choice = true;

        while (make_your_choice) {

            System.out.println("""
                    
                    Welcome to the Reports screen. Here are more various options we have for you.
                    
                    1. See Month to Date transactions
                    2. See Previous Month transactions
                    3. See Year to Date transactions
                    4. See all of previous year's transactions
                    5. Search by Vendor
                    0. Return to the Ledger
                    
                    """);

            choice = userInput.nextLine();


            if (choice.equals("1")) {

                System.out.println(" The month of " + LocalDate.now());
                for(Transactions transaction: allTransactions){
                    if(transaction.getDate().isAfter(LocalDate.now().withDayOfMonth(1))){
                        System.out.println(transaction);
                    }
                }

            } else if (choice.equals("2")) {

                System.out.println(" Here's all transactions made in the previous month. ");
                for(Transactions transaction: allTransactions){
                    if(transaction.getDate().isBefore(LocalDate.now().withDayOfMonth(1)) && transaction.getDate().isAfter(LocalDate.of(2024,9,1))){
                        System.out.println(transaction);
                    }
                }


            } else if (choice.equals("3")) {
                System.out.println(" Here's all transactions made from this year to " + LocalDate.now());

                for(Transactions transaction: allTransactions){
                    if(transaction.getDate().isAfter(LocalDate.of(2024,1,1))){
                        System.out.println(transaction);
                    }
                }


            } else if (choice.equals("4")) {
                System.out.println(" Here's all the transactions made from the previous year. ");

                for(Transactions transaction: allTransactions){
                    if(transaction.getDate().isAfter(LocalDate.of(2023,1,1)) && transaction.getDate().isBefore(LocalDate.of(2024,1,1))){
                        System.out.println(transaction);
                    }
                }

            } else if(choice.equals("5")){

                System.out.println(" Which vendor would you like to search for?");
                String vendor = userInput.nextLine();

                for(Transactions transaction: allTransactions){
                    if(transaction.getVendor().equalsIgnoreCase(vendor)){
                        System.out.println(transaction);
                    }
                }


                System.out.println("  ");
            } else if(choice.equals("0")){

                make_your_choice = false;

            } else{
                System.out.println("Sorry invalid entry.");
            }

        }
    }

    //create method to load all transaction from the csv file into an arraylist as soon as the app is started
    public static List<Transactions> loadTransactions(){
        List<Transactions> transactionsFromFile = new ArrayList<>();

        try {

        FileReader ledgerreader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(ledgerreader);
        String superReader = bufferedReader.readLine();

            while ((superReader = bufferedReader.readLine()) != null) {
                String[] boomba = superReader.split("\\|");
                Transactions transaction = new Transactions((parse(boomba[0])), ((LocalTime.parse(boomba[1]))), (boomba[2]), (boomba[3]), (Double.parseDouble(boomba[4])));
              transactionsFromFile.add(transaction);
                //print all transactions made from the user
            }

        } catch (Exception exp){
            System.out.println(exp.getLocalizedMessage());
        }


        return transactionsFromFile;
    }

    //write to csv file
    //this can be used for deposits and payments

    static void writeToCsvFile(Transactions transaction){

        try {
            BufferedWriter bufWriter = new BufferedWriter(new FileWriter(filePath, true));
            bufWriter.write("\n");
            bufWriter.write(transaction.toString());
           // bufWriter.write("\n");
            System.out.println(transaction);
         //   System.out.println("if we see this we should have successfully added to the csv file");

            bufWriter.close();

        } catch (Exception exp) {
            System.out.println(exp.getLocalizedMessage());
        }

    }
}

//rambo

