package lt.bt.java.demo.interfaces.demo5;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setSalary(20);

        System.out.println("Salary = " + employee.getSalary());

        employee.incSalary(10);
        System.out.println("New salary = " + employee.getSalary());

        System.out.println("Salary total = " + Salary.getTotal(100, 25));
    }
}
