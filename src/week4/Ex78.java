package week4;
import java.util.Scanner;
public class Ex78 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        System.out.print("seconds: ");
        int s = Integer.parseInt(scn.nextLine());
        System.out.print("minutes: ");
        int m = Integer.parseInt(scn.nextLine());
        System.out.print("hours: ");
        int h = Integer.parseInt(scn.nextLine());
        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);
        while ( true ) {
            System.out.println( hours + ":" + minutes + ":" + seconds);   // the current time printed
            seconds.next();
            if (seconds.getValue() == 0) {
                minutes.next();
                if (minutes.getValue() == 0) {
                    hours.next();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
