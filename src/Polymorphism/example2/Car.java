package Polymorphism.example2;

public class Car extends Vehicle{
    @Override
    public void speedUp() {
        System.out.println("Accelerating the car.");
        super.speedUp();
    }
}
