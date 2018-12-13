package lt.bt.java.sample.task;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import lt.bt.java.sample.task.data.ParkavimasBaigsis;

public class FailoServisas {

	public void spausdinti(ParkavimasBaigsis duomenys, String filePath) throws IOException{
		String content = duomenys.toString();
		FileWriter fw = new FileWriter(filePath);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(content);
		bw.close();
		fw.close();
	}
}
