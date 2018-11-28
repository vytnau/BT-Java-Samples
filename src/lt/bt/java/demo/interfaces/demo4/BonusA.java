package lt.bt.java.demo.interfaces.demo4;

public interface BonusA extends Salary {

    default double getBonus() {
        return getSalary() * 1.10;
    }
}
