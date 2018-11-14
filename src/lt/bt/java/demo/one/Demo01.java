package lt.bt.java.demo.one;

public class Demo01 {

	public static void main(String[] args) {
		int sk1 = -3;
		int sk2 = 3;
		int ats = sk1 + sk2;
		
		if(ats > 3 && ats < 10){
			System.out.println("Kazkas blogai");			
		} else if (ats == 3 || ats == 0){
			System.out.println("atsakymas: " + ats);
		} else {
			System.out.println("netiketas rezultatas: " + ats);
		} 
	}

}
