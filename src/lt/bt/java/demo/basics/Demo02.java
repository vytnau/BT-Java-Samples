package lt.bt.java.demo.basics;

import java.util.Scanner;

public class Demo02 {

	public static void main(String[] args) {
		System.out.println("Iveskite savo varda: ");
		Scanner reader= new Scanner(System.in);		
		String name = reader.nextLine();
		
		System.out.println("Labas," + name + "!");
		reader.close();
	}

}
