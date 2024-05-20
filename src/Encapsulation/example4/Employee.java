package Encapsulation.example4;

public class Employee {
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    public int getEmployeeId() {
        return employee_id;
    }

    public void setEmployeeId(int employeeId) {
        this.employee_id = employeeId;
    }

    public String getEmployeeName() {
        return employee_name;
    }

    public void setEmployeeName(String employeeName) {
        this.employee_name = employeeName;
    }

    // Getter for emloyee_salary with formatting
    public String getEmployeeSalary() {
        return String.format("$%.2f", employee_salary);
    }

    public void setEmployeeSalary(double salary) {
        this.employee_salary = salary;
    }
}
