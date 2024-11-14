package EnumClasses;

public enum RegularToppings {
    LETTUCE (0),
    PEPPERS(0),
    ONIONS(0),
    TOMATOES(0),
    JALEPENOS(0),
    CUCUMBERS(0),
    PICKLES(0),
    GUACAMOLE(0),
    MUSHROOMS(0);

    final double price;

    RegularToppings(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

}
