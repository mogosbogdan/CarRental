package ro.jademy.carrental.make;

import ro.jademy.carrental.Engine;
import ro.jademy.carrental.Person;

import java.util.Objects;

public abstract class Car implements Comparable {

    private String make;
    private String model;
    private Integer year;
    private String carType; // coupe, sedan, hatchback, convertible, wagon, SUV
    private Integer doorNumber;
    private String color;
    private int basePrice;
    private Engine engineSpecs;
    private boolean isRented;


    public Car(String make, String model, Integer year, String carType, Integer doorNumber, String color, int basePrice, Engine engineSpecs) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.carType = carType;
        this.doorNumber = doorNumber;
        this.color = color;
        this.basePrice = basePrice;
        this.engineSpecs = engineSpecs;

    }


    public Car(String make, String model, Integer year, String carType, Integer doorNumber, String color, int basePrice, Engine engineSpecs, boolean isRented) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.carType = carType;
        this.doorNumber = doorNumber;
        this.color = color;
        this.basePrice = basePrice;
        this.engineSpecs = engineSpecs;
        this.isRented = isRented;

    }


    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Integer getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(Integer doorNumber) {
        this.doorNumber = doorNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public Engine getEngineSpecs() {
        return engineSpecs;
    }

    public void setEngineSpecs(Engine engineSpecs) {
        this.engineSpecs = engineSpecs;
    }




    public int compareTo (Car other) {
        return this.make.compareTo(other.make);
    }



    public int compareToBasePrice (Car other) {

        return Integer.compare(this.basePrice, other.basePrice);
    }




    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", carType='" + carType + '\'' +
                ", doorNumber=" + doorNumber +
                ", color='" + color + '\'' +
                ", basePrice=" + basePrice +
                ", engineSpecs=" + engineSpecs +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return basePrice == car.basePrice &&
                model.equals(car.model) &&
                year.equals(car.year) &&
                carType.equals(car.carType) &&
                doorNumber.equals(car.doorNumber) &&
                color.equals(car.color) &&
                engineSpecs.equals(car.engineSpecs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, carType, doorNumber, color, basePrice, engineSpecs);
    }



}
