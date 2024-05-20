package Polymorphism.example8;

public class Main {
    public static void main(String[] args){
        Shape circle = new Circle(5);
        Shape square = new Square(4);
        Shape triangle = new Triangle(3, 6);

        circle.draw();
        System.out.println("Circle area: " + circle.calculateArea());

        square.draw();
        System.out.println("Square area: " + square.calculateArea());

        triangle.draw();
        System.out.println("Triangle area: " + triangle.calculateArea());
    }
}
