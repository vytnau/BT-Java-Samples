package lt.bt.java.demo.interfaces.demo01;

public class Main {

	public static void main(String[] args) {
		Interfeisas[] masyvas = new Interfeisas[2];
		
		Klase1 klase1 = new Klase1();
		klase1.toString();
		
		Klase2 klase2 = new Klase2();
		masyvas[0] = klase2;
		
		Klase3 klase3 = new Klase3();
		klase3.metodas3();
		masyvas[1] = klase3;
		
		for(int i = 0; i < masyvas.length; i++){
			masyvas[i].metodas1();
		}
			
	}

}
