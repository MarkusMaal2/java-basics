package week2;
import java.util.Random;
import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        int guessable = drawNumber();
        int guess = -1;
        Scanner scn = new Scanner(System.in);
        while (guess != guessable) {
            System.out.print("Your guess: ");
            guess = Integer.parseInt(scn.nextLine());
            if (guess > guessable) {
                System.out.println("The number is lower!");
            } else if (guess < guessable) {
                System.out.println("The number is higher!");
            }
        }
        System.out.println("Correct! :-)");
    }

    public static int drawNumber() {
        Random r = new Random();
        return r.nextInt(100);
    }
}
