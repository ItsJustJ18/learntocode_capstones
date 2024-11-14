package com.pluralsight.delishop;

import java.util.ArrayList;

public class Orders {

    //instance variables with totalPrice and List of Items to get overall price when customer is done
    private double totalOrderPrice;
    private ArrayList<com.pluralsight.delishop.Items> itemList;

    public Orders(double totalOrderPrice, ArrayList<com.pluralsight.delishop.Items> itemList) {
        this.totalOrderPrice = totalOrderPrice;
        this.itemList = new ArrayList<>();
    }
    //adds item to a list formed by the customer depending on what they select
    public void addOrderItem(com.pluralsight.delishop.Items item) {
        com.pluralsight.delishop.Items.add(item);
    }

    //returns totalPrice after getting every item's cost amount
    public double getTotalOrderPrice() {
        return totalOrderPrice;
    }

    //returns a list of items that a customer picks and makes it into a list
    public ArrayList<com.pluralsight.delishop.Items> getItemList() {
        return itemList;
    }
    //totalPrice of the Order method
    public double totalPriceOfOrder(){
        double totalPrice = 0;
        for (com.pluralsight.delishop.Items item : itemList) {
            totalPrice = totalOrderPrice + item.getPrice();
        }
        return totalPrice;
    }
}




    //TODO make variables to associate orders made for the deli and user experience

