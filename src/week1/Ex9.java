package week1;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number: ");
        double x = Double.parseDouble(scanner.nextLine());
        System.out.print("Type another number: ");
        double y = Double.parseDouble(scanner.nextLine());
        System.out.println(x + "/" +y + " = " + (x/y));
    }
}
