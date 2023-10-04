package week9;

import application.AverageSensor;
import application.ConstantSensor;
import application.Sensor;
import application.Thermometer;

public class Ex20 {
    public static void main(String[] args) {
        Sensor kumpula = new ConstantSensor(5);
        Sensor kaisaniemi = new Thermometer();
        Sensor helsinkiVantaa = new ConstantSensor(2);

        AverageSensor helsinkiArea = new AverageSensor();
        helsinkiArea.addSensor(kumpula);
        helsinkiArea.addSensor(kaisaniemi);
        helsinkiArea.addSensor(helsinkiVantaa);

        helsinkiArea.on();
        System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");
        System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");
        System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");

        System.out.println("readings: "+helsinkiArea.readings());
        System.out.println("average reading in Helsinki: "+helsinkiArea.measure());
    }
}
