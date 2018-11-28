package lt.bt.java.demo.interfaces.demo6;

public class Main {

    public static void main(String[] args) {

        Salary salary = new Employee();
        salary.setSalary(20);
        System.out.println("Salary = " + salary.getSalary());

        Salary boss = new Boss();
        boss.setSalary(1);
        System.out.println("Boss Salary = " + boss.getSalary());
    }
}
