package lt.bt.java.task.padangos.uzd;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		//Padanga ratas = new Padanga();
		//Padanga[] padangos = read(ratas);
//		System.out.println(ratas);
		System.out.println("naudojant tarpine klase:");
		RatasWrap ratasWrap = readUsingWrap();
		System.out.println(ratasWrap.getIeskomasRatas());
		//paieska(padangos, ratas);
		paieska(ratasWrap.getTurimiRatai(), ratasWrap.getIeskomasRatas());

		// paieska tarp padangu
	}

	private static void paieska(List<Padanga> turimiRatai, Padanga ieskomaPadanga) {
		int kiekis = 0;
		double bendraKaina = 0;		
		for (Padanga sandelioPadanga : turimiRatai) {			
			if (arAtitinka(ieskomaPadanga, sandelioPadanga)) {
				bendraKaina = sandelioPadanga.getKaina() + bendraKaina;
				kiekis++;
			}
		}
		System.out.println("TinkamÅ³ padangÅ³ skaiÄ�ius: "+kiekis);
		System.out.println("Jos kainuotÅ³: "+bendraKaina);
		
	}

	private static String read() throws IOException {
		String filePath = "src\\lt\\bt\\Uzdaviniai\\txt\\padanga.txt";
		return filePath;
	}

	private static int plot() throws IOException {
		File file = new File(read());
		Scanner scanner = new Scanner(file);
		int plotis = scanner.nextInt();
		// System.out.println("plotis - " + plotis);
		return plotis;
	}

	private static int auks() throws IOException {
		File file = new File(read());
		Scanner scanner = new Scanner(file);
		scanner.nextInt();
		int aukstis = scanner.nextInt();
		// System.out.println("aukstis - " + aukstis);
		return aukstis;
	}

	private static String index() throws IOException {
		File file = new File(read());
		Scanner scanner = new Scanner(file);
		scanner.nextInt();
		scanner.nextInt();
		String greit = scanner.nextLine();
		greit = greit.trim();
		// System.out.println("greitis - " + greit);
		return greit;
	}

	private static int arrayNumber() throws IOException {
		File file = new File(read());
		Scanner scanner = new Scanner(file);
		scanner.nextInt();
		scanner.nextInt();
		scanner.nextLine();
		int arrayNum = scanner.nextInt(); // masyvo ilgis
		// System.out.println("ilgis - " + arrayNum);
		return arrayNum;
	}

	private static Padanga[] read(Padanga ratas) throws IOException {

		double bendraKaina = 0;
		int kiekis = 0;
		File file = new File(read());
		Scanner scanner = new Scanner(file);

		int plotis = scanner.nextInt();
		int aukstis = scanner.nextInt();
		String indeksas = scanner.nextLine();

		ratas.setAukstis(aukstis);
		ratas.setPlotis(plotis);
		ratas.setGreit(indeksas);

		int arrayNum = scanner.nextInt();
		Padanga[] padang = new Padanga[arrayNum];

		for (int i = 0; i < arrayNum; i++) {
			Padanga padangaSandeliy = new Padanga();
			padangaSandeliy.setPlotis(scanner.nextInt());
			padangaSandeliy.setAukstis(scanner.nextInt());
			padangaSandeliy.setGreit(scanner.next());
			padangaSandeliy.setKaina(scanner.nextDouble());
			padang[i] = padangaSandeliy;
			// if (padangaSandeliy.getPlotis() ==plot() &&
			// padangaSandeliy.getAukstis() ==
			// auks()&&padangaSandeliy.getGreit().equals(index())) {
			// //System.out.println(padangaSandeliy);
			// bendraKaina=padangaSandeliy.getKaina()+bendraKaina;
			// kiekis++;
			// }
		}
		return padang;
		// System.out.println("TinkamÅ³ padangÅ³ skaiÄ�ius: "+kiekis);
		// System.out.println("Jos kainuotÅ³: "+bendraKaina);
	}

	private static RatasWrap readUsingWrap() throws IOException {
		File file = new File(read());
		Scanner scanner = new Scanner(file);

		int plotis = scanner.nextInt();
		int aukstis = scanner.nextInt();
		String indeksas = scanner.nextLine();
		Padanga padanga = new Padanga();
		padanga.setAukstis(aukstis);
		padanga.setPlotis(plotis);
		padanga.setGreit(indeksas);

		int arrayNum = scanner.nextInt();
		//Padanga[] padang = new Padanga[arrayNum];
		List<Padanga> listPadadangos = new ArrayList(); 

		for (int i = 0; i < arrayNum; i++) {
			Padanga padangaSandeliy = new Padanga();
			padangaSandeliy.setPlotis(scanner.nextInt());
			padangaSandeliy.setAukstis(scanner.nextInt());
			padangaSandeliy.setGreit(scanner.next());
			padangaSandeliy.setKaina(scanner.nextDouble());
			listPadadangos.add(padangaSandeliy);
			//padang[i] = padangaSandeliy;
		}

		RatasWrap ratasWrap = new RatasWrap();
		ratasWrap.setIeskomasRatas(padanga);
		ratasWrap.setTurimiRatai(listPadadangos);

		return ratasWrap;
	}

	private static void paieska(Padanga[] padangos, Padanga ieskomaPadanga) {
		int kiekis = 0;
		double bendraKaina = 0;		
		for (int i = 0; i < padangos.length; i++) {
			Padanga sandelioPadanga = padangos[i];
			if (arAtitinka(ieskomaPadanga, sandelioPadanga)) {
				bendraKaina = sandelioPadanga.getKaina() + bendraKaina;
				kiekis++;
			}
		}
		System.out.println("TinkamÅ³ padangÅ³ skaiÄ�ius: "+kiekis);
		System.out.println("Jos kainuotÅ³: "+bendraKaina);
	}

	private static boolean arAtitinka(Padanga ieskoma, Padanga turima) {
		boolean atitinka = false;		
		if (ieskoma.getAukstis() == turima.getAukstis() && 
				ieskoma.getPlotis() == turima.getPlotis()
				&& ieskoma.getGreit().trim().equals(turima.getGreit().trim())) {
			atitinka = true;
		}

		return atitinka;
	}
}