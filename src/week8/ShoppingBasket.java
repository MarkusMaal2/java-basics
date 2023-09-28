package week8;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
    List<Purchase> basketItems;
    public ShoppingBasket() {
        this.basketItems = new ArrayList<>();
    }

    public void add(String product, int price) {
        boolean alreadyInBasket = false;
        for (Purchase p : this.basketItems) {
            if (p.product.equals(product)) {
                alreadyInBasket = true;
                p.increaseAmount();
            }
        }
        if (!alreadyInBasket) {
            this.basketItems.add(new Purchase(product, 1, price));
        }
    }

    public int price() {
        int totalPrice = 0;
        for (Purchase p: this.basketItems) {
            totalPrice += p.price();
        }
        return totalPrice;
    }

    public void print() {
        for (Purchase p: this.basketItems) {
            System.out.println(p.toString());
        }
    }
}
