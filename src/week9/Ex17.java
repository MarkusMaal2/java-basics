
package week9;
import mooc.logic.ApplicationLogic;
import mooc.ui.UserInterface;
import mooc.ui.TextUserInterface;

public class Ex17 {

    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);
    }
}