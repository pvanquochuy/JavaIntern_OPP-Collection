package Inheritance.example4;

public class HRManager extends Employee {
    public HRManager(double salary) {
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("HR manager is working");
    }
    public void addEmployee(){
        System.out.println("Hr is adding an employee");
    }

}
