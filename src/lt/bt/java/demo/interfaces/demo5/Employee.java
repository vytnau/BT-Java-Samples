package lt.bt.java.demo.interfaces.demo5;

public class Employee implements Salary {

    private double salary;

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
