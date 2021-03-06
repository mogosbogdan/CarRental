package ro.jademy.carrental.make;

import ro.jademy.carrental.Engine;

public class Skoda extends Car {

    public Skoda(String model, Integer year, String carType, Integer doorNumber, String color, int basePrice, Engine engineSpecs) {
        super("Skoda", model, year, carType, doorNumber, color, basePrice, engineSpecs);
    }

    public Skoda(String make, String model, Integer year, String carType, Integer doorNumber, String color, int basePrice, Engine engineSpecs, boolean isRented) {
        super(make, model, year, carType, doorNumber, color, basePrice, engineSpecs, isRented);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
