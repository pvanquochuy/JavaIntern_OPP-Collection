package Polymorphism.example7;

public class Panthera extends Animal{
    @Override
    public void move() {
        System.out.println("The Panthera walks.");
    }

    @Override
    public void makeSound() {
        System.out.println("The Panthera roars.");
    }
}
