package Polymorphism.example6;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.draw();
        System.out.println("Area of Circle: " + circle.calculateArea());

        Cylinder cylinder = new Cylinder(3, 7);
        cylinder.draw();
        System.out.println("Total Surface Area of Cylinder: " + cylinder.calculateArea());
    }
}
