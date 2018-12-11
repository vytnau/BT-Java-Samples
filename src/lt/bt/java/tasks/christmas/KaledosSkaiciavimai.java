package lt.bt.java.tasks.christmas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Kaledos.ElfuSandelis;

public class KaledosSkaiciavimai {
	private static final int TOY_NAME = 0;
	private static final int TOY_COUNT = 1;
	
	public List<ElfuSandelis> getElfuSandelis() throws FileNotFoundException {
		List<ElfuSandelis> zaislaiSandely = new LinkedList<>();
		String filePath = "src\\Kaledos\\ElfuSandelis.txt";
		File file = new File(filePath);
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNext()){
			ElfuSandelis zaislai = new ElfuSandelis();
			String fileLine = scanner.nextLine();
			String[] data = fileLine.split(",");
			
			zaislai.setZaislas(data[TOY_NAME]);
			zaislai.setKiekis(Integer.parseInt(data[TOY_COUNT].trim()));			

			zaislaiSandely.add(zaislai);
		}
		scanner.close();

		return zaislaiSandely;
	}
}
