package lt.bt.java.tasks.printToFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIO implements IOApi {

	private String dataFile;
	private String resultFile;

	public FileIO(String dataFile, String resultFile) {
		this.dataFile = dataFile;
		this.resultFile = resultFile;
	}

	@Override
	public void write(String text, int result) {
		String content = text + result;
		FileWriter fw;
		try {
			fw = new FileWriter(resultFile, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.newLine();			
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Data read() {
		File file = new File(dataFile);
		Data result = new Data();
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			while (scanner.hasNextInt()) {
				result.setNumber1(scanner.nextInt());
				result.setNumber2(scanner.nextInt());
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return result;
	}

}
