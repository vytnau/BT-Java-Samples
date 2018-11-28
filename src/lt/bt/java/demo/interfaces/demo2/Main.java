package lt.bt.java.demo.interfaces.demo2;

public class Main {

    public static void main(String[] args) {

        Circle c = new Circle();
        c.setBorder(true);
        c.setColor("green");
        c.setSizeFromArea(100);

        System.out.println("Figure color = " + c.getColor() + " and has border ? " + c.hasBorder());

    }
}
