package Polymorphism.example6;
class Cylinder extends Circle {
    double height;

    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing a cylinder");
    }

    @Override
    double calculateArea() {
        double circleArea = super.calculateArea();
        double lateralArea = 2 * Math.PI * radius * height;
        return 2 * circleArea + lateralArea;
    }
}