package lt.bt.java.demo.trycatch;

import java.util.Scanner;

public class TryCatchDemo4 {

	public static void main(String[] args) {
		try {
			System.out.println("Iveskite skaiciu");
			int number = readNumber();
			System.out.println("Skaiciai nuo 0 iki " + number);
			printNumbers(number);
		} finally {
			System.out.println("Programa baige darba!");
		}

	}
	
	private static int readNumber(){
		Scanner reader = new Scanner(System.in);
		int number = reader.nextInt();
		reader.close();
		return number;
	}
	
	private static void printNumbers(int number){
		for(int i = 0; i < number; i++){
			System.out.println(i);
		}
	}

}
