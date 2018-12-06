package lt.bt.java.demo.nestedclass.demo2;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.name = "Jonas";
        employee.position = employee.new Position();
        employee.position.salary = BigDecimal.valueOf(5000, 2);

        System.out.println(employee.position.print());

    }

}
