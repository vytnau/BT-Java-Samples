package lt.bt.java.tasks;

import java.util.Scanner;

public class LoopsTask {

	public static void main(String[] args) {
		// 7 begalinis ciklas vykdyti tas pacias operacijas
		boolean testi = true;
		Scanner reader = new Scanner(System.in);
		while (testi) {
			// 1 issivedma viska i konsole
			System.out.println("Skaiciuotuvo veiksmai:");
			System.out.println("1 sudetis");
			System.out.println("2 daugyba");
			// .....
			// 2. Susikuriam reikalingi objektai skaitymui is konsoles			
			System.out.println("Iveskiti norima operacija");
			int menu = reader.nextInt();
			// 3. nuskaityti skaicius
			double sk1 = 0;
			double sk2 = 0;
			
			//vienas is variantu iseiti is ciklo
			if(menu == 5){
				System.out.println("vykdisim break");
				break;
			}
			
			if(menu != 5){
				System.out.println("Iveskite pirma demeni");
				sk1 = reader.nextDouble();
				System.out.println("Iveskite antra demeni");
				sk2 = reader.nextDouble();
			}

			// 4. issiaiskinti kuri operacija pasirinkta
			// switch
			double ats = 0;

			switch (menu) {
			case 1:
				ats = sk1 + sk2;
				break;
			case 2:
				ats = sk1 * sk2;
				break;
			case 5:
				// iseiti is ciklo
				testi = false;
				System.out.println("iseiti is ciklo");
				break;
			default:
				System.out.println("neatpazinta operacija");
			}

			// String value ="Tekstas";
			// switch(value){
			// case "Tekstas":
			// System.out.println("tekstas");
			// break;
			// default:
			//
			// }
			// if
			if (menu == 1) {

			} else if (menu == 2) {

			} else if (menu == 5) {

			}

			// 5. atlikti skaiciavimus

			// 6. spausdinti rezultatus
			if(testi){
				System.out.println("Atsakymas" + ats);
			}
		}
		
		reader.close();

	}

}
