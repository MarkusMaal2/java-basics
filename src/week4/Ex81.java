package week4;

public class Ex81 {
    public static void main(String[] args) {
        PasswordRandomizer randomizer = new PasswordRandomizer(13);
        for (int i = 0; i < 999; i++) {
            System.out.println("Password: " + randomizer.createPassword());
        }
    }
}
