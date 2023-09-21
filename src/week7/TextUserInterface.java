package week7;

import java.util.Scanner;

public class TextUserInterface {
    Scanner reader;
    Dictionary dictionary;
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statements:\n\tquit - quits the text user interface\n\tadd - adds a word pair to the dictionary\n\ttranslate - asks a word and prints its translation");
        while (true) {
            System.out.println();
            System.out.print("Statement: ");
            String stmt = this.reader.nextLine();
            if (stmt.equalsIgnoreCase("quit")) {
                System.out.println("Good bye!");
                break;
            } else if (stmt.equalsIgnoreCase("add")) {
                System.out.print("In Finnish: ");
                String orig = this.reader.nextLine();
                System.out.print("Translation: ");
                String translation = this.reader.nextLine();
                this.dictionary.add(orig, translation);
            }  else if (stmt.equalsIgnoreCase("translate")) {
                System.out.print("Give a word: ");
                String orig = this.reader.nextLine();
                System.out.println("Translation: " + this.dictionary.translate(orig));
            } else {
                System.out.println("Unknown statement");
            }
        }
    }
}
