package Inheritance.example9;

abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public double calculateFuelEfficiency(double distance, double fuelConsumed) {
        if (fuelConsumed == 0) {
            return 0;
        }
        return distance / fuelConsumed;
    }

    public double calculateDistance(double speed, double time) {
        return speed * time;
    }

    public abstract double getMaxSpeed();
}
