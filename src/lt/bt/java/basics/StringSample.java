package lt.bt.java.basics;

public class StringSample {

	public static void main(String[] args) {
		String data = "Vardas    Pavarde   1991 06 28";
		
		String vardas = data.substring(0, 10);
		String pavarde = data.substring(10, 20);
		String metai = data.substring(20, 24);
		String menuo = data.substring(25, 27);
		String diena = data.substring(28);
		
		System.out.println(vardas);
		System.out.println(pavarde);
		System.out.println(metai);
		System.out.println(menuo);
		System.out.println(diena);

	}

}
