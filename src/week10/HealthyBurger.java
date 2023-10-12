package week10;

public class HealthyBurger extends Hamburger {
    String healthyExtra1Name;
    String healthyExtra2Name;
    double healthyExtra1Price;
    double healthyExtra2Price;
    public HealthyBurger(String meat, double price) {
        super("Healthy hamburger", meat, price, "Brown rye roll");
        this.healthyExtra1Name = "";
        this.healthyExtra1Price = 0.0;
        this.healthyExtra2Name = "";
        this.healthyExtra2Price = 0.0;
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = this.price + this.healthyExtra1Price + this.healthyExtra2Price + this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price;
        System.out.println(this.name + " Hamburger on a " + this.breadRollType + " with " + this.meat + ", price is " + this.price);
        if (!this.healthyExtra1Name.isEmpty()) { System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price); }
        if (!this.healthyExtra2Name.isEmpty()) { System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price); }
        if (!this.addition1Name.isEmpty()) { System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price); }
        if (!this.addition2Name.isEmpty()) { System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price); }
        if (!this.addition3Name.isEmpty()) { System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price); }
        if (!this.addition4Name.isEmpty()) { System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price); }
        return totalPrice;
    }
}
