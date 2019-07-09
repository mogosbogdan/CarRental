package ro.jademy.carrental.make;

import ro.jademy.carrental.Engine;

public class Volkswagen extends Car {

    public Volkswagen(String model, Integer year, String carType, Integer doorNumber, String color, int basePrice, Engine engineSpecs) {
        super("Volkswagen" ,model, year, carType, doorNumber, color, basePrice, engineSpecs);
    }

    public Volkswagen(String make, String model, Integer year, String carType, Integer doorNumber, String color, int basePrice, Engine engineSpecs, boolean isRented) {
        super(make, model, year, carType, doorNumber, color, basePrice, engineSpecs, isRented);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
