package lt.bt.java.demo.interfaces.demo1;

public class Main {

    public static void main(String[] args) {

        Circle f = new Circle();

        f.setSizeFromArea(100);
        System.out.println("Circle radius = " + f.getRadius());

        Area a1 = f;
        printArea(f);

    }

    static void printArea(Area a) {
        System.out.println("Area = " + a.getArea());
    }
}
