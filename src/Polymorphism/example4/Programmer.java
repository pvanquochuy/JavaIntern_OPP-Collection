package Polymorphism.example4;

public class Programmer extends Employee{
    private double baseSalary;
    private double overtimePay;

    public Programmer(double baseSalary, double overtimePay) {
        this.baseSalary = baseSalary;
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + overtimePay;
    }
}
