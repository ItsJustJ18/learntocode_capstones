package EnumClasses;

public enum DrinkFlavor {
    HI_C(1),
    ROOT_BEER(2),
    RIG_JUICE(3),
    BUTTER_BEER(4),
    HEAL_POTION(5);

    private final int menuOption;

    DrinkFlavor(int menuOption) {
        this.menuOption = menuOption;
    }
    public int getMenuOption() {
        return menuOption;
    }
}
