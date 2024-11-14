package SuperUberSnackShack;

import java.util.ArrayList;

public class Orders {

    //instance variables with totalPrice and List of Items to get overall price when customer is done
    private double totalOrderPrice;
    private ArrayList<Items> itemList;

    public Orders(double totalOrderPrice, ArrayList<Items> itemList) {
        this.totalOrderPrice = totalOrderPrice;
        this.itemList = new ArrayList<>();
    }
    //adds item to a list formed by the customer depending on what they select
    public void addOrderItem(Items item) {
        itemList.add(item);
    }

    //returns totalPrice after getting every item's cost amount
    public double getTotalOrderPrice() {
        return totalOrderPrice;
    }

    //returns a list of items that a customer picks and makes it into a list
    public ArrayList<Items> getItemList() {
        return itemList;
    }
    //totalPrice of the Order method
    public double totalPriceOfOrder(){
         this.totalOrderPrice = 0;
        for (Items item : itemList) {
             totalOrderPrice += item.getPrice();
        }
        return totalOrderPrice;
    }
}




    //TODO make variables to associate orders made for the deli and user experience
