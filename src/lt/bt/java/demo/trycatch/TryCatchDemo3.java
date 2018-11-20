package lt.bt.java.demo.trycatch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchDemo3 {

	/*
	 * Skaitymas is failo
	 */
	public static void main(String[] args) {
		BufferedReader br = null;
		try{
			String filePath = "neegzistuojantisFailas.txt";
			File file = new File(filePath);
			br = new BufferedReader(new FileReader(file));
			String st;
			while ((st = br.readLine()) != null) {
				System.out.println(st);
			}			
		} catch (IOException e){
			System.err.println("Failas nerastas");
		} finally{
			try {
				br.close();
			} catch (NullPointerException | IOException e) {
				System.err.println("Nepavyko uzdaryti failo");				
			}
		}

	}

}
