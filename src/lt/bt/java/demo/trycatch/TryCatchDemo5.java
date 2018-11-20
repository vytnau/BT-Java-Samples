package lt.bt.java.demo.trycatch;

import java.io.IOException;
import java.io.StringWriter;

public class TryCatchDemo5 {

	public static void main(String[] args) {
		//Objektas turi implementinti AutoCloseable interfeisa
		try(StringWriter sw = new StringWriter()){
			sw.write("Pirmas tekstas");
			sw.write("\n");
			sw.write("Antras tekstas");
			System.out.println(sw.toString());
		} catch (IOException e) {
			System.err.println("Kazkas blogai: " + e);			
		}
		System.out.println("Programa baige darba. 'sw' kintamasis cia neegzistuoja");
	}

}
