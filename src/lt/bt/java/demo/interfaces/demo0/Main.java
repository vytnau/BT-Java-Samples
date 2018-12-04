package lt.bt.java.demo.interfaces.demo0;

public class Main {

	public static void main(String[] args) {
		Klase1 klase1 = new Klase1();
		klase1.toString();
		
		Klase2 klase2 = new Klase2();
		klase2.metodas1();

		Interfeisas klase21 = new Klase2();
		klase21.metodas1();
		
		Klase3 klase3 = new Klase3();
		klase3.metodas3();
		
		Interfeisas klase31 = new Klase3();
		klase31.metodas2("");
	}

}
