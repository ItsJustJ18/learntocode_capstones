package SuperUberSnackShack;

import Interfaces.Price;

//made the class abstract to make an Override for each price
public abstract class Items implements Price {

    double price;

    //returns the price of the class that extend to it
    public double getPrice() {
        return price;

    }

    public abstract String printToReceipt();

}
