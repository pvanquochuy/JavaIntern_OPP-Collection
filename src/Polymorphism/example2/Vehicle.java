package Polymorphism.example2;

public class Vehicle {
    private int speed;
    public Vehicle() {
        this.speed = 0;
    }

    public void speedUp() {
        System.out.println("Speeding up the vehicle.");
        speed += 10;
    }

    public int getSpeed() {
        return speed;
    }
}
