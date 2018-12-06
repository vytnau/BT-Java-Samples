package lt.bt.java.demo.genericAndEnum.demo5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Suma = " + Utils.<Integer>sum(list)); // <Integer> galima nenurodyti
        System.out.println(Utils.concat(list));
    }
}
