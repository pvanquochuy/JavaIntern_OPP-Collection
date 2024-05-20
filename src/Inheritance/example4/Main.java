package Inheritance.example4;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(50000);
        emp.work();
        System.out.println("Employee Salary: $" + emp.getSalary());

        HRManager hrManager = new HRManager(70000);
        hrManager.work();
        System.out.println("HR Manager Salary: $" + hrManager.getSalary());
        hrManager.addEmployee();
    }
}
