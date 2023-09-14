package week1;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        System.out.print("Enter the number of points [0-60]: ");
        Scanner scanner = new Scanner(System.in);
        int points = Integer.parseInt(scanner.nextLine());
        if (points < 0) {
            System.out.println("out of bounds");
        }
        else if (points < 30) {
            System.out.println("failed");
        }
        else if (points < 35) {
            System.out.println("1");
        }
        else if (points < 40) {
            System.out.println("2");
        }
        else if (points < 45) {
            System.out.println("3");
        }
        else if (points < 50) {
            System.out.println("4");
        }
        else if (points < 61) {
            System.out.println("5");
        } else {
            System.out.println("out of bounds");
        }
    }
}
