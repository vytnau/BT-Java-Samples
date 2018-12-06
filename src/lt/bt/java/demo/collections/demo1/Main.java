package lt.bt.java.demo.collections.demo1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Collection<String> set = new TreeSet<>();

        set.add("Kaunas");
        set.add("Vilnius");
        set.add("Kaunas");
        set.add("Alytus");
        set.add("Klaipėda");
        set.add("Vilnius");
        set.add("Kaunas");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();

            System.out.println(s);
        }
        
        List<String> list = new LinkedList();

        list.add("Kaunas");
        list.add("Vilnius");
        list.add("Kaunas");
        list.add("Alytus");
        list.add("Klaipėda");
        list.add("Vilnius");
        list.add("Kaunas");

        System.out.println("-----------------");
        Iterator<String> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            String s = iterator2.next();

            System.out.println(s);
        }

    }
}
