package Abstract.example6;

public class Cube extends Shape3D{
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        return 6 * Math.pow(side, 2);
    }
}
