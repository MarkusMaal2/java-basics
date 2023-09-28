package week8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    Map<String, Integer> products;
    Map<String, Integer> stock;
    public Storehouse() {
        this.products = new HashMap<String, Integer>();
        this.stock = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        this.products.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        if(this.products.get(product) != null) {
            return this.products.get(product);
        } else {
            return -99;
        }
    }

    public int stock(String product) {
        if (this.stock.get(product) == null) {
            return 0;
        }
        return this.stock.get(product);
    }

    public boolean take(String product) {
        if ((this.stock.get(product) == null) || (this.stock.get(product) == 0)) {
            return false;
        }
        this.stock.replace(product, this.stock.get(product)-1);
        return true;
    }

    public Set<String> products() {
        Set<String> set = new HashSet<String>(this.products.keySet());
        return set;
    }
}
