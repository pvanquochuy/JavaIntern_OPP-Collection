package Abstract.example10;

public class Main {
    public static void main(String[] args) {
        Shape2D rectangle = new Rectangle(5, 3);
        Shape2D circle = new Circle(4);

        System.out.println("Rectangle:");
        rectangle.draw();
        rectangle.resize(1.5);

        System.out.println();

        System.out.println("Circle:");
        circle.draw();
        circle.resize(2);
    }
}
