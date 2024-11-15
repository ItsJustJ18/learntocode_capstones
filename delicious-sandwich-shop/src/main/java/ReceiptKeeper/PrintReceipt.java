package ReceiptKeeper;

import SuperUberSnackShack.Orders;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrintReceipt {
    public static void makeReceipt(Orders customerOrder) {
        LocalDateTime currentDateAndTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");

        try {
            FileWriter fileWriter = new FileWriter("src/main/resources/CopyOfReceipt" + currentDateAndTime.format(formatter) + ".txt");
            BufferedWriter buffWriter = new BufferedWriter(fileWriter);

            buffWriter.write(customerOrder.toString());
            buffWriter.write(String.format("Total Price of Order: $%2.2 ", customerOrder.getTotalOrderPrice()));
        }
        catch (IOException e) {
            throw new RuntimeException();
        }
    }
}