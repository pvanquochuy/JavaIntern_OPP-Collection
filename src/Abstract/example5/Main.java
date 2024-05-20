package Abstract.example5;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 50000, 10000);
        Programmer programmer = new Programmer("Jane Smith", 60000, 160, 50);

        System.out.println("Manager Details:");
        manager.displayInfo();

        System.out.println();

        System.out.println("Programmer Details:");
        programmer.displayInfo();
    }
}
