package week1;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Type a number: ");
        int parsedint = Integer.parseInt(scn.nextLine());
        if (parsedint % 2 == 0) {
            System.out.println("Number " + parsedint + " is even!");
        } else {
            System.out.println("Number " + parsedint + " is odd!");
        }
    }
}
