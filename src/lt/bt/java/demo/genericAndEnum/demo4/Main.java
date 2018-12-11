package lt.bt.java.demo.genericAndEnum.demo4;

public class Main {

    public static void main(String[] args) {

        //ListIntSum<String> list2 = new ListIntSum<>()

        ListIntSum<Double> list = new ListIntSum<>();
        list.add(1.0);
        list.add(1.9);
        list.add(1.1);

        System.out.println("Suma = " + list.sum());
    }
}
