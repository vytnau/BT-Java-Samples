package lt.bt.java.demo.interfaces.demo4;

public interface BonusB extends Salary {

    default double getBonus() {
        return getSalary() * 1.20;
    }
}