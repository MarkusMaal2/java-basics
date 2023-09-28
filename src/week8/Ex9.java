package week8;
public class Ex9 {
    public static void main(String[] args) {
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "BWQ-431");

        VehicleRegister vr = new VehicleRegister();
        if (!vr.add(reg1, "Arto")) {
            System.out.println("Arto not added!");
        }
        if (!vr.add(reg3, "Jürgen")) {
            System.out.println("Jürgen not added!");
        }
        if (!vr.add(reg3, "Saamuel")) {
            System.out.println("Saamuel not added!");
        }
        if (vr.get(reg1) != null) {
            System.out.println("Reg 1 exists!");
        }
        if (vr.get(reg2) != null) {
            System.out.println("Reg 2 exists!");
        }
        System.out.println("\nRegistration plates:");
        vr.printRegistrationPlates();
        System.out.println("\nOwners:");
        vr.printOwners();
        System.out.println();
        if (!vr.delete(reg2)) {
            System.out.println("Reg 2 wasn't deleted!");
        }
        if (!vr.delete(reg1)) {
            System.out.println("Reg 1 wasn't deleted!");
        } else {
            System.out.println("Reg 1 was deleted!");
        }
    }
}
