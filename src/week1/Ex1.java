package week1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.print("How old are you? ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Hello, " + name + "! You are " + age + " years old!");
    }
}
