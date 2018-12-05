package lt.bt.java.basics;

import java.util.LinkedList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<Integer> myList = new LinkedList<>();

		// idejimas i list'a
		for (int i = 0; i < 10; i++) {
			myList.add(i + 10);
		}

		// for each spausdinti is listo
		for (Integer sk : myList) {
			System.out.println(sk);
		}

		System.out.println("--------------------");
		// spausdinam naudojan stadntartini for cikla
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}

		System.out.println("--------------------");
		// salinimas elemento
		System.out.println(myList.remove(new Integer(15)));
		// for each spausdinti is listo
		for (Integer sk : myList) {
			System.out.println(sk);
		}
		
		System.out.println("--------------------");
		// salinimas elemento
		System.out.println(myList.remove(5));
		System.out.println("--------------------");
		// for each spausdinti is listo
		for (Integer sk : myList) {
			System.out.println(sk);
		}
		
		myList.add(5, 25);
		System.out.println("--------------------");
		// for each spausdinti is listo
		for (Integer sk : myList) {
			System.out.println(sk);
		}
	}

}
