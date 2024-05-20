package Abstract.example10;

public class Rectangle extends Shape2D{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with length " + length + " and width " + width);
    }

    @Override
    public void resize(double factor) {
        length *= factor;
        width *= factor;
        System.out.println("Resizing the rectangle to length " + length + " and width " + width);
    }
}
