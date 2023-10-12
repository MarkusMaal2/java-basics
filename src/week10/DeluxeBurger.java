package week10;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White roll");
        this.addition1Price = 2.75;
        this.addition1Name = "Chips";
        this.addition2Price = 1.81;
        this.addition2Name = "Drink";
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Could not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Could not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Could not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Could not add additional items to a deluxe burger");
    }
}
