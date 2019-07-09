package ro.jademy.carrental;

public class Engine {

    private String fuelType;
    private boolean isManual;
    private int engineSizeCc;

    public Engine(String fuelType, boolean isManual, int engineSizeCc) {
        this.fuelType = fuelType;
        this.isManual = isManual;
        this.engineSizeCc = engineSizeCc;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "fuelType='" + fuelType + '\'' +
                ", isManual=" + isManual +
                ", engineSizeCc=" + engineSizeCc +
                '}';
    }
}
