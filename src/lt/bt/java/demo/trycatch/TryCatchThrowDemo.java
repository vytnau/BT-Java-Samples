package lt.bt.java.demo.trycatch;

public class TryCatchThrowDemo {

	public static void main(String[] args) throws Exception {
		try{
			calculate();
		} catch (ArithmeticException e){
			System.err.println("Dalyba is nulio negalima!");
		}
	}
	
	private static void calculate() throws Exception{
		int a = 6;
		try{
			int ats = a / 0;
		} catch (ArithmeticException e){
			throw new Exception();
		}
	}

}
