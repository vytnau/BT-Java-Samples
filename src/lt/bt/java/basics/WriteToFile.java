package lt.bt.java.basics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) throws IOException {
		String fileName = "res\\txt\\out\\writeToFile.txt";
		String content = "This is the content to write into file\n";
		FileWriter fw = new FileWriter(fileName);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(content);
		System.out.println("Done");
		bw.close();
		fw.close();
	}
}
