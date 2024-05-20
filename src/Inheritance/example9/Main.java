package Inheritance.example9;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck("Ford", "F150", 2022, "Gasoline", 2000);
        Car car = new Car("Toyota", "Camry", 2023, "Gasoline");

        System.out.println("Maximum speed of truck: " + truck.getMaxSpeed() + " km/h");
        System.out.println("Maximum speed of car: " + car.getMaxSpeed() + " km/h");
    }
}
