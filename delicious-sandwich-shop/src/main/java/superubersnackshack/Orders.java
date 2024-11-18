package superubersnackshack;

import java.util.ArrayList;
import java.util.List;

public class Orders {

    //instance variables with totalPrice and List of Items to get overall price when customer is done
    private static double totalOrderPrice;
    private static final List<Items> itemList = new ArrayList<>();

    public Orders() {

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
    public List<Items> getItemList() {
        return itemList;
    }
    //totalPrice of the Order method
    public static double totalPriceOfOrder(){
         totalOrderPrice = 0;
        for (Items item : itemList) {
             totalOrderPrice += item.getPrice();
        }
        return totalOrderPrice;
    }
}




    //TODO make variables to associate orders made for the deli and user experience

