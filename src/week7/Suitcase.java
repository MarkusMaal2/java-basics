package week7;

import java.util.ArrayList;

public class Suitcase {
    int maxWeight;
    ArrayList<Thing> things;
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<>();
    }

    public void addThing(Thing thing) {
        if (thing.getWeight() + this.totalWeight() <= this.maxWeight) {
            things.add(thing);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Thing t : this.things) {
            totalWeight += t.getWeight();
        }
        return totalWeight;
    }

    public String toString() {
        if (this.things.size() > 1) {
            return this.things.size() + " things (" + this.totalWeight() + " kg)";
        } else if (this.things.size() == 1) {
            return "1 thing (" + this.totalWeight() + " kg)";
        } else {
            return "empty (" + this.totalWeight() + " kg)";
        }
    }

    public void printThings() {
        for (Thing t: this.things) {
            System.out.println(t.toString());
        }
    }

    public Thing heaviestThing() {
        Thing heaviest = null;
        if (this.things.isEmpty()) {
            return null;
        }
        for (Thing t : this.things) {
            if (t.getWeight() > (heaviest != null ? heaviest.getWeight() : 0)) {
                heaviest = t;
            }
        }
        return heaviest;
    }
}
