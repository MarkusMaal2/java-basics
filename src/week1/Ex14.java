package week1;
import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Type a number: ");
        int parsedint = Integer.parseInt(scn.nextLine());
        if (parsedint > 0) {
            System.out.println("The number is positive!");
        } else {
            System.out.println("The number is not positive!");
        }
    }
}
