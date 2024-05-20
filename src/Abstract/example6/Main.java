package Abstract.example6;

public class Main {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(5);
        Cube cube = new Cube(4);

        System.out.println("Sphere:");
        System.out.println("Volume: " + sphere.calculateVolume());
        System.out.println("Surface Area: " + sphere.calculateSurfaceArea());

        System.out.println("\nCube:");
        System.out.println("Volume: " + cube.calculateVolume());
        System.out.println("Surface Area: " + cube.calculateSurfaceArea());
    }
}
