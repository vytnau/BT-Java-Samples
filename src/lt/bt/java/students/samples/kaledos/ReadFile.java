package lt.bt.kaledos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
	private static final int TOY_NAME = 0;
	private static final int TOY_COUNT = 1;
	
	ReadFile() {
		
	}
	
	public List<Sandelis> getElfuSandelis() throws FileNotFoundException{
		List<Sandelis> zaislaiSandely = new LinkedList<>();
		String filePath = ("C:\\Users\\Greta\\eclipse-workspace\\mainProject\\res\\txt\\kaledos\\zaislai.txt");
		File file = new File(filePath);
		Scanner scan = new Scanner(file);
		
		while(scan.hasNext()) {
			Sandelis zaislai = new Sandelis();
			String str = scan.nextLine();
			String [] data = str.split(",");
			
			
			zaislai.setToyName(data[TOY_NAME]);
			zaislai.setQuant(Integer.parseInt(data[TOY_COUNT].trim()));
			zaislaiSandely.add(zaislai);
		}
		scan.close();
		return zaislaiSandely;
	}
	
	private static final int NAME = 0;
	private static final int LAST_NAME = 1;
	private static final int AGE = 2;
	private static final int STREET = 3;
	private static final int GIFT = 4;
	
	public List<Vaikai> getVaikuInfo() throws FileNotFoundException{
		List<Vaikai> vaikai = new ArrayList<>();
		String filePath = ("C:\\Users\\Greta\\eclipse-workspace\\mainProject\\res\\txt\\kaledos\\vaikai.txt");
		File f = new File(filePath);
		Scanner sc = new Scanner(f);
		 
		while(sc.hasNext()) {
			Vaikai vaik = new Vaikai();
			String string = sc.nextLine();
			String [] vaikaiData = string.split(",");
			
			vaik.setName(vaikaiData[NAME]);
			vaik.setLName(vaikaiData[LAST_NAME]);
			vaik.setAge(Integer.parseInt(vaikaiData[AGE].trim()));
			vaik.setStreet(vaikaiData[STREET]);
			vaik.setToy(vaikaiData[GIFT].trim());
			
			
			vaikai.add(vaik);
		}
		sc.close();
		return vaikai;
	}
	
	public List<Charakteristika> getCharakeris() throws FileNotFoundException{
		List<Charakteristika> bruozai = new LinkedList<>();
		String filePath = ("C:\\Users\\Greta\\eclipse-workspace\\mainProject\\res\\txt\\kaledos\\charakteristika.txt");
		File file = new File(filePath);
		Scanner scanner= new Scanner(file);
		
		while(scanner.hasNext()) {
			Charakteristika child = new Charakteristika();
			String str = scanner.nextLine();
			String [] data = str.split(",");
			
			child.setName(data[0]);
			child.setLastName(data[1]);
			child.setPersonality(data[2]);
			bruozai.add(child);
		}
		scanner.close();
		return bruozai;
	}
}
