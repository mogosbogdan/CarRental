package ro.jademy.carrental.make;

public enum CarType {

    SEDAN("Sedan" , 5),
    COUPE("Coupe" , 3),
    COVERTIBLE("Convertible" , 3),
    SUV("SUV" , 5),
    HATCHBACK("Hatchback" , 5),
    WAGON("WAGON" , 5 );

    private String name;
    private int doorNumber;

    CarType(String name, int doorNumber) {
        this.name = name;
        this.doorNumber = doorNumber;
    }

    public String getName() {
        return name;
    }

    public int getDoorNumber() {
        return doorNumber;
    }
}
