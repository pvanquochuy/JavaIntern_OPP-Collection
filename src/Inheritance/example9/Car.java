package Inheritance.example9;

public class Car extends Vehicle{
    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double getMaxSpeed() {
        return 150;
    }
}
