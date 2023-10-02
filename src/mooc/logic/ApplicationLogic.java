package mooc.logic;

import mooc.ui.UserInterface;

public class ApplicationLogic {
    UserInterface ui;
    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }

    public void execute(int howManyTimes) {
        for (int i = 0; i < howManyTimes; i++) {
            System.out.println("This application logic works");
            this.ui.update();
        }
    }
}
