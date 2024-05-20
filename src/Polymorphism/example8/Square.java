package Polymorphism.example8;

public class Square extends Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
