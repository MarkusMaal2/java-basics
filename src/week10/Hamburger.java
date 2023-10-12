package week10;

import java.util.ArrayList;

public class Hamburger {
    String name;
    String meat;
    String breadRollType;
    double price;

    String addition1Name; String addition2Name; String addition3Name; String addition4Name;
    double addition1Price; double addition2Price; double addition3Price; double addition4Price;
    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;

        this.addition1Price = 0.0;
        this.addition2Price = 0.0;
        this.addition3Price = 0.0;
        this.addition4Price = 0.0;
        this.addition1Name = "";
        this.addition2Name = "";
        this.addition3Name = "";
        this.addition4Name = "";
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double totalPrice = this.price + this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price;
        System.out.println(this.name + " Hamburger on a " + this.breadRollType + " with " + this.meat + ", price is " + this.price);
        if (!this.addition1Name.isEmpty()) { System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price); }
        if (!this.addition2Name.isEmpty()) { System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price); }
        if (!this.addition3Name.isEmpty()) { System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price); }
        if (!this.addition4Name.isEmpty()) { System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price); }
        return totalPrice;
    }
}
