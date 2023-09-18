package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex60 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        while (true) {
            String name;
            System.out.print("Enter a name: ");
            name = scn.nextLine();
            if (name.isEmpty()) {
                break;
            } else {
                names.add(name);
            }
        }
        Collections.sort(names);
        for (String name: names) {
            System.out.println(name);
        }
    }
}
