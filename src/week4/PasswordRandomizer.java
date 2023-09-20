package week4;

import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private final String characters;

    public PasswordRandomizer(int length) {
        this.length = length;
        this.characters = "abcdefghijklmnopqrstuvwxyz";
    }

    public String createPassword() {
        // generate a new seed for random number generator
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.length; i++) {
            int idx = r.nextInt(this.characters.length());
            char newCharacter = this.characters.charAt(idx);
            sb.append(newCharacter);
        }
        return sb.toString();
    }
}