package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    ArrayList<Sensor> sensors;
    public AverageSensor() {
        this.sensors = new ArrayList<>();
    }

    public void addSensor(Sensor sensor) {
        this.sensors.add(sensor);
    }

    @Override
    public boolean isOn() {
        boolean imOn = true;
        for (Sensor s : this.sensors) {
            if (!s.isOn()) {
                imOn = false;
            }
        }
        return imOn;
    }

    @Override
    public void on() {
        for (Sensor s : this.sensors) {
            if (!s.isOn()) { s.on(); }
        }
    }

    @Override
    public void off() {
        for (Sensor s : this.sensors) {
            if (s.isOn()) {
                s.off();
                return;
            }
        }
    }

    @Override
    public int measure() {
        if (this.isOn()) {
            int count = this.sensors.size();
            int all = 0;
            for (Sensor s : this.sensors) {
                all += s.measure();
            }
            return all / count;
        } else {
            throw new IllegalStateException();
        }
    }

    public List<Integer> readings() {
        ArrayList<Integer> readings = new ArrayList<>();
        for (Sensor s : this.sensors) {
            readings.add(s.measure());
        }
        return readings;
    }
}
