package SuperUberSnackShack;

import Interfaces.Price;

//made the class abstract to make an Override for each price
public abstract class Items implements Price {

    double price;

    public static void add(Items itemList) {

    }

    public double getPrice() {
        return price;

    }

}
