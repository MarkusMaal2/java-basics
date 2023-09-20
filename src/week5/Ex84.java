package week5;

public class Ex84 {
    public static void main(String[] args) {
        System.out.println("Constructor 1: no arguments specified");
        Counter c = new Counter();
        System.out.println(c.value());
        c.increase();
        System.out.println("increase method, no amount specified");
        System.out.println(c.value());
        c.increase(5);
        System.out.println("increase method, amount is 5");
        System.out.println(c.value());
        System.out.println("Constructor 2: starting value specified");
        Counter c2 = new Counter(12);
        System.out.println(c2.value());
        System.out.println("decrease method, no amount specified");
        c2.decrease();
        System.out.println(c2.value());
        System.out.println("decrease method, amount is 11");
        c2.decrease(11);
        System.out.println(c2.value());
        System.out.println("decrease method, amount is 11 (again)");
        c2.decrease(11);
        System.out.println(c2.value());
        System.out.println("Constructor 3: start value and check specified, check is on");
        Counter c3 = new Counter(13, true);
        System.out.println(c3.value());
        System.out.println("decrease method, amount is 12");
        c3.decrease(12);
        System.out.println(c3.value());
        System.out.println("decrease method, amount is 1");
        c3.decrease(1);
        System.out.println(c3.value());
        System.out.println("decrease method, no amount specified");
        c3.decrease();
        System.out.println(c3.value());
    }
}
