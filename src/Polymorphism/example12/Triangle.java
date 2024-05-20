package Polymorphism.example12;

public class Triangle extends GeometricShape{
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public double perimeter() {
        double side1 = base;
        double side2 = height;
        double hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);
        return base + height + hypotenuse;
    }
}
