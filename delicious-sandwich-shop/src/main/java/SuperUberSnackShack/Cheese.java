package SuperUberSnackShack;

import EnumClasses.BreadLength;

public class Cheese extends SandwichCheeses {

    private final Cheese cheeseWanted;

    public Cheese(boolean haveExtra, BreadLength breadLength, Cheese cheeseWanted) {
        super(haveExtra, breadLength);
        this.cheeseWanted = cheeseWanted;
    }

    public String toString() {
        return "$" + price + " " + cheeseWanted;
    }

    public enum CheeseType {
        AMERICAN,
        PROVOLONE,
        CHEDDAR,
        SWISS
    }
}
