package Inheritance.example4;

public class Employee {

    private double salary;
    public Employee(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println("Employee is working");
    }
    public double getSalary(){
        return salary;
    }


}
