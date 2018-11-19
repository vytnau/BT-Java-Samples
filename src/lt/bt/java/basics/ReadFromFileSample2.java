package lt.bt.java.basics;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFileSample2 {

	public static void main(String[] args) throws IOException {
		String filePath = "res\\txt\\demo\\sample2.txt";
		File file = new File(filePath);
		Scanner scanner = new Scanner(file);
		while (scanner.hasNextInt()) {
			System.out.println(scanner.nextInt());
		}
		scanner.close();
	}
}
