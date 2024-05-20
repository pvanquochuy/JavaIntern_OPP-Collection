package Inheritance.example9;

public class Truck extends Vehicle{
    private double cargoCapacity;

    public Truck(String make, String model, int year, String fuelType, double cargoCapacity) {
        super(make, model, year, fuelType);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public double getMaxSpeed() {
        return 120;
    }
}
