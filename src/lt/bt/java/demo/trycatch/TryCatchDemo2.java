package lt.bt.java.demo.trycatch;

import java.util.Scanner;

public class TryCatchDemo2 {

	/*
	 * Programa konvertuoja ivesta skaiciu i tekstine israiska
	 */
	public static void main(String[] args) {
		printText("Iveskite skaiciu:");
		int number = getNumberFromConsole();
		String numberText = getNumberText(number);
		// pasalinam gale esancius tarpus is teksto
		try {
			numberText = numberText.trim();
			printText("Skaicius " + number + " yra " + numberText);
		} catch (NullPointerException e) {
			printText("Ivestas skaicius " + number + " neatpazintas. Bandykite dar karta");
			main(args);
		}

	}

	private static String getNumberText(int number) {
		String numberText = null;
		switch (number) {
		case 0:
			numberText = "Nulis  ";
			break;
		case 1:
			numberText = "Vienas ";
			break;
		case 2:
			numberText = "Du ";
			break;
		case 3:
			numberText = "Trys   ";
			break;
		case 4:
			numberText = "Keturi   ";
			break;
		case 5:
			numberText = "Penki";
			break;
		}
		return numberText;
	}

	private static void printText(String text) {
		System.out.println(text);
	}

	private static int getNumberFromConsole() {		
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		int number = reader.nextInt();
		//reader.close();
		return number;
	}

}
