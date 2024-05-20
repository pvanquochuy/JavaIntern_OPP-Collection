package Polymorphism.example12;

public class Main {
    public static void main(String[] args){
        Triangle triangle = new Triangle(3, 4);
        Square square = new Square(5);

        System.out.println("Triangle area: " + triangle.area());
        System.out.println("Triangle perimeter: " + triangle.perimeter());

        System.out.println("Square area: " + square.area());
        System.out.println("Square perimeter: " + square.perimeter());
    }
}
