package Polymorphism.example4;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(50000, 10000);
        Programmer programmer = new Programmer(60000, 5000);

        System.out.println("Manager:");
        System.out.println("Salary: $" + manager.calculateSalary());

        System.out.println("\nProgrammer:");
        System.out.println("Salary: $" + programmer.calculateSalary());
    }
}
