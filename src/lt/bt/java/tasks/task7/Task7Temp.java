package lt.bt.java.tasks.task7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

import lt.bt.java.tasks.task7.data.Temp;

public class Task7Temp {
	
	private String fileName = "C:\\sources\\mokymai\\BalticTalents-Samples\\res\\txt\\out\\RezTemperatura.txt";
	private FileWriter fw = null;
	private BufferedWriter bw = null;
	
	public Task7Temp() throws IOException{
		fw = new FileWriter(fileName);
		bw = new BufferedWriter(fw);
	}

	public static void main(String[] args) throws IOException {
		String filePath = "C:\\sources\\mokymai\\BalticTalents-Samples\\res\\txt\\task\\Temperatura.txt";
		Task7Temp task = new Task7Temp();
		Temp[] temps = task.readData(filePath);
		task.print(temps);
		System.out.println();
		System.out.println("Uzduoties vykdymas:");
		task.calculateAvg(temps);
		task.close();
	}
	
	//////////////////////////////////
	
	public void calculateAvg(Temp[] temps) throws IOException{
		DecimalFormat df2 = new DecimalFormat(".###");
		double[] monthsTempAvg = new double[temps.length];
		for (int i = 0; i < temps.length; i++) {
			Temp temp = temps[i];
			double[] measures = temp.getTemp();
			double avg = 0;
			for (int j = 0; j < measures.length; j++) {
				avg += measures[j];
			}
			avg = avg / measures.length;
			
			//System.out.println(temp.getMonth() + " " + avg);
			System.out.println(temp.getMonth() + " " + df2.format(avg));
			saveToFile(temp.getMonth() + " " + df2.format(avg));
			monthsTempAvg[i] = avg;
		}
		double avg = 0;
		for(int i = 0; i < monthsTempAvg.length;  i++){
			avg += monthsTempAvg[i];
		}
		
		avg = avg / monthsTempAvg.length;
		System.out.println("Bendras matavimų vidurkis: " + df2.format(avg));
		saveToFile("Bendras matavimų vidurkis: " + df2.format(avg));
	}
	
	private void saveToFile(String text) throws IOException{					
		bw.write(text);
		bw.write("\r\n");
	}
	
	public void close() throws IOException{
		bw.close();
		fw.close();
	}
	
	public void print(Temp[] temps){		
		for(int i = 0; i < temps.length; i++){
			System.out.print(temps[i].getMonth() + ": ");
			double[] measures = temps[i].getTemp();
			for(int j = 0; j < measures.length; j++){
				System.out.print(measures[j] + " ");
			}
			System.out.println();
		}
	}
	
	public Temp[] readData(String filePath) throws FileNotFoundException{
		Temp[] array = null;
		File file = new File(filePath);
		Scanner scanner = new Scanner(new FileReader(file));
		int monthsCount = scanner.nextInt();
		int measureCount = scanner.nextInt();
		array = new Temp[monthsCount];
		for(int i = 0; i < monthsCount; i++){
			Temp temp = new Temp();			
			String monthName = scanner.next();
			temp.setMonth(monthName);
			double[] measures = new double[measureCount];
			for(int j = 0; j < measureCount; j++){
				measures[j] = scanner.nextDouble();				
			}
			temp.setTemp(measures);
			array[i] = temp;
		}
		scanner.close();
		return array;
	}
}
