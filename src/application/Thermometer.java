package application;

import java.util.Random;

public class Thermometer implements Sensor {
    boolean powerState;
    public Thermometer() {
        this.powerState = false;
    }
    @Override
    public boolean isOn() {
        return this.powerState;
    }

    @Override
    public void on() {
        this.powerState = true;
    }

    @Override
    public void off() {
        this.powerState = false;
    }

    @Override
    public int measure() {
        if (this.powerState) {
            Random r = new Random();
            return r.nextInt(60) - 30;
        } else {
            throw new IllegalStateException();
        }
    }
}
