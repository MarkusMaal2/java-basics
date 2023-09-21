package week7;

import java.util.ArrayList;

public class Container {
    int maxWeight;
    ArrayList<Suitcase> suitcases;
    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }

    private int totalWeight() {
        int total = 0;
        for (Suitcase s : this.suitcases) {
            total += s.totalWeight();
        }
        return total;
    }

    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }

    public void printThings() {
        for (Suitcase s : this.suitcases) {
            s.printThings();
        }
    }
}
