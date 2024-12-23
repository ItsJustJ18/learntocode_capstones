package superubersnackshack;

import enumclasses.BreadLength;

public class Cheese extends PremiumToppings {

    //cheeses that are picked can't be adjusted unless user cancels order
    private final Cheese cheeseWanted;

    //the result price of cheese varies on bread length and if they would like extra cheese
    public Cheese(boolean haveExtra, BreadLength breadLength, Cheese cheeseWanted) {
        super(haveExtra, breadLength);
        this.cheeseWanted = cheeseWanted;
    }

    //how the cheese will be printed in a toString
    public String toString() {
        return "$" + price + " " + cheeseWanted;
    }

    @Override
    public String printToReceipt() {
        return "";
    }

    //list of cheese types
    public enum CheeseType {
        AMERICAN,
        PROVOLONE,
        CHEDDAR,
        SWISS
    }
}
