package lt.bt.java.tasks;

import java.util.Scanner;

public class Uzduotis5 {

	public static void main(String[] args) {
		int[] dataArray = {3, 4, 5, 7, 4, 22, 11, 3, 5, 6, 6};	
		printToScreen("Iveskite skaicius");
		//1. skaitymas is konsoles
		int number = readFromScreen();
		//2. paieska masyva		
		int repeat = findNumber(dataArray, number);
		//3. spausdinti rezultata
		printToScreen(number, repeat);
		printToScreen("Skaicius " + number +" masyve rastas " + repeat + " kart.");

	}
	
	private static int findNumber(int[] array, int sk){
		int kart = 0;
		//2.1. begimas per masyva naudojant cikla
		for(int i = 0; i < array.length; i++){
			int elm = array[i];
		//2.2. salygos sakinys, lyginti masyvo elementa su sk
			if(elm == sk){
				//2.3. suskaiciuoti kartus
				kart = kart + 1;
			}
		}
		return kart;
	}
	
	private static void printToScreen(int sk, int kart){
		System.out.println("Skaicius " + sk +" masyve rastas " + kart + " kart.");
	}
	
	private static void printToScreen(String text){
		System.out.println(text);
	}
	
	private static int readFromScreen(){
		Scanner reader = new Scanner(System.in);
		int number = reader.nextInt();
		reader.close();
		return number;
	}

}
