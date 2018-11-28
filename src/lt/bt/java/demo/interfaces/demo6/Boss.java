package lt.bt.java.demo.interfaces.demo6;

public class Boss implements Salary {

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
