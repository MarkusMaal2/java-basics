package week2;
import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Until what? ");
        int max = Integer.parseInt(scn.nextLine());
        int current = 1;
        int sum = 0;
        while (current <= max) {
            sum += current;
            current++;
        }
        System.out.println("The sum is " + sum);
    }
}
