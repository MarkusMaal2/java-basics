package week3;
import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = scn.nextLine();
        System.out.print("Length of first part: ");
        int lenPartFirst = Integer.parseInt(scn.nextLine());
        String result = word.substring(0, lenPartFirst);
        System.out.println("Result: " + result);
    }
}
