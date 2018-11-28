package lt.bt.java.demo.interfaces.demo3;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Jonas");
        employee.setSalary(20);
        System.out.println(employee.getName() + " rate " + employee.getSalary() + "eur/hour");
        System.out.println(employee.getName() + " rate " + employee.getTotal(25) + "eur/hour");

    }
}
