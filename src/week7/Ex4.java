package week7;

public class Ex4 {
    public static void main(String[] args) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        // adding 100 suitcases with one brick in each
        for (int i = 0; i < 100; i++) {
            Suitcase sc = new Suitcase(20);
            sc.addThing(new Thing("Brick", 20));
            container.addSuitcase(sc);
        }
    }
}
