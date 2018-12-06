package lt.bt.java.demo.genericAndEnum.demo8;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        aboutExtends();
        aboutSuper();

    }

    static void aboutExtends() {
        System.out.println("Producer-extends: ? extends Fruit");

        //List of apples
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple());
        apples.add(new AsianApple());

        //We can assign a list of apples to a basket of fruits;
        //because apple is subtype of fruit
        List<? extends Fruit> basket = apples;

//        basket.add(new Apple()); //Compile time error
//        basket.add(new Fruit()); //Compile time error

        //Here we know that in basket there is nothing but fruit only
        for (Fruit fruit : basket) {
            System.out.println(fruit);
        }
    }

    static void aboutSuper() {
        System.out.println("Consumer-super: ? super Apple");

        //List of apples
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple());
        apples.add(new AsianApple());

        //We can assign a list of apples to a basket of apples
        List<? super Apple> basket = apples;

        basket.add(new Apple());      //Successful
        basket.add(new AsianApple()); //Successful
//        basket.add(new Fruit());      //Compile time error

        // we cannot know which supertype it is, so it's Object
        for (Object object : basket) {
            System.out.println(object);
        }
    }

}
