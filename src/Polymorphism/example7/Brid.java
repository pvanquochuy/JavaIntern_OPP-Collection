package Polymorphism.example7;

public class Brid extends Animal{
    @Override
    public void move() {
        System.out.println("The bird flies.");
    }
    @Override
    public void makeSound() {
        System.out.println("The bird chirps.");
    }
}
