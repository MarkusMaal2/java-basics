package week1;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        int r = Integer.parseInt(scn.nextLine());
        double c = 2 * Math.PI * r;
        System.out.println("Circumference is equal to " + c);
    }
}
