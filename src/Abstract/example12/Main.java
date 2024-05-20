package Abstract.example12;

public class Main {
    public static void main(String[] args) {
        GeometricShape triangle = new Triangle(3, 4, 5);
        GeometricShape square = new Square(4);

        System.out.println("Triangle:");
        System.out.println("Area: " + triangle.area());
        System.out.println("Perimeter: " + triangle.perimeter());

        System.out.println("\nSquare:");
        System.out.println("Area: " + square.area());
        System.out.println("Perimeter: " + square.perimeter());
    }
}
