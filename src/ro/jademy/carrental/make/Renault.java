package ro.jademy.carrental.make;

import ro.jademy.carrental.Engine;

public class Renault extends Car {

    public Renault(String model, Integer year, String carType, Integer doorNumber, String color, int basePrice, Engine engineSpecs) {
        super("Renault", model, year, carType, doorNumber, color, basePrice, engineSpecs);
    }

    public Renault(String model, Integer year, String carType, Integer doorNumber, String color, int basePrice, Engine engineSpecs, boolean isRented) {
        super("Renault", model, year, carType, doorNumber, color, basePrice, engineSpecs, isRented);
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
