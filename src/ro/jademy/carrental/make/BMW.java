package ro.jademy.carrental.make;

import ro.jademy.carrental.Engine;

public class BMW extends Car {

    public BMW(String model, Integer year, String carType, Integer doorNumber, String color, int basePrice, Engine engineSpecs) {
        super("BMW" , model, year, carType, doorNumber, color, basePrice, engineSpecs);
    }

    public BMW(String make, String model, Integer year, String carType, Integer doorNumber, String color, int basePrice, Engine engineSpecs, boolean isRented) {
        super(make, model, year, carType, doorNumber, color, basePrice, engineSpecs, isRented);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
