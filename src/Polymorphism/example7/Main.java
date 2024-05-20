package Polymorphism.example7;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Panthera panthera = new Panthera();

        animal.move();
        animal.makeSound();



        panthera.move();
        panthera.makeSound();
    }
}
