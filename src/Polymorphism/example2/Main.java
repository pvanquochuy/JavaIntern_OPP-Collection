package Polymorphism.example2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        System.out.println("Car:");
        car.speedUp();
        System.out.println("Current speed: " + car.getSpeed() + " km/h");

        System.out.println("\nBicycle:");
        bicycle.speedUp();
        System.out.println("Current speed: " + bicycle.getSpeed() + " km/h");
    }
}
