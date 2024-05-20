package Polymorphism.example3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4);

        System.out.println("Circle:");
        System.out.println("Area: " + circle.calculateArea());

        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.calculateArea());

        System.out.println("\nTriangle:");
        System.out.println("Area: " + triangle.calculateArea());
    }
}
