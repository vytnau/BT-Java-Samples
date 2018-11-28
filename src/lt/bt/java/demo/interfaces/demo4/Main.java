package lt.bt.java.demo.interfaces.demo4;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setSalary(20);
        System.out.println(" Salary " + employee.getSalary() + "eur/hour");
        System.out.println(" Bonus " + employee.getBonus() + "eur/hour");

    }
}
