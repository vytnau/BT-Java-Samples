package lt.bt.java.demo.nestedclass.demo1;

import java.math.BigDecimal;

public class Employee {

    static String CompanyName;

    String name;

    Position position;

    protected static class Position {

        public String position;

        public BigDecimal salary;

        public String print() {

            return Employee.CompanyName + " " + this.salary;
        }
    }

}
