package lt.bt.java.basics;

import java.util.Scanner;

public class ReadFromConsole {

	public static void main(String[] args) {
		System.out.println("Enter your name: ");
		Scanner reader= new Scanner(System.in);		
		String name = reader.nextLine();
		reader.close(); 
		System.out.println("Hello, " + name + "!");
	}

}