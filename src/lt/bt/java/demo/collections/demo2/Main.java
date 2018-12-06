package lt.bt.java.demo.collections.demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Kaunas");
        list.add("Vilnius");
        list.add("Kaunas");
        list.add("Alytus");
        list.add("Klaipėda");
        list.add("Vilnius");
        list.add("Kaunas");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();

            if (s.equals("Vilnius") || s.equals("Kaunas")) {
                iterator.remove();
            }
        }

//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).equals("Vilnius")) {
//                list.remove(i);
//            }
//        }

        System.out.println(list);
    }

}
