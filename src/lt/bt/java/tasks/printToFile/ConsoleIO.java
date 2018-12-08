package lt.bt.java.tasks.printToFile;

import java.util.Scanner;

public class ConsoleIO implements IOApi {
	private Scanner scanner = null;
	
	public ConsoleIO() {
		scanner = new Scanner(System.in);
	}

	@Override
	public void write(String text, int result) {		
		System.out.println(text + result);
	}

	@Override
	public Data read() {
		System.out.println("Iveskite skaiciu: ");
		int numb1 = scanner.nextInt();
		System.out.println("Iveskite dar viena skaiciu: ");
		int numb2 = scanner.nextInt();
		Data data = new Data(numb1, numb2);
		return data;
	}
}
