package Polymorphism.example1;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Cat cat = new Cat();

        System.out.println("Bird:");
        bird.sound();

        System.out.println("\nCat:");
        cat.sound();
    }
}
