package week8;

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegister {
    HashMap<RegistrationPlate, String> owners;
    public VehicleRegister() {
        this.owners = new HashMap<>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (this.owners.get(plate) != null) {
            return false;
        } else {
            owners.put(plate, owner);
            return true;
        }
    }

    public String get(RegistrationPlate plate) {
        return owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        if (this.owners.get(plate) != null) {
            owners.remove(plate);
            return true;
        } else {
            return false;
        }
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate regplate: this.owners.keySet()) {
            System.out.println(regplate.toString());
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String owner: this.owners.values()) {
            if (!owners.contains(owner)) {
                System.out.println(owner);
                owners.add(owner);
            }
        }
    }
}
