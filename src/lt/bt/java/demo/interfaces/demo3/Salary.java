package lt.bt.java.demo.interfaces.demo3;

public interface Salary {

    void setSalary(double salary);

    double getSalary();

    default double getTotal(double percent) {
        return getSalary() * (1.0 + percent / 100.0);
    }

}
