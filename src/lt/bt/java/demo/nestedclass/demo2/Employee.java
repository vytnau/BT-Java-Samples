package lt.bt.java.demo.nestedclass.demo2;

import java.math.BigDecimal;

public class Employee {

    String name;

    Position position;

    class Position {

        public String position;

        public BigDecimal salary;

        public String print() {
            return Employee.this.name + " salary " + this.salary + "€/h"  ;
        }
    }
}
