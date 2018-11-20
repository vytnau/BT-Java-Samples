package lt.bt.java.demo.trycatch;

public class TryCatchDemo1 {

	public static void main(String[] args) {
		int a = 5;
		try{
			int ats = a / 0;
		} catch (ArithmeticException e){
			System.err.println("Dalyba is nulio negalima!");
		}
	}

}
