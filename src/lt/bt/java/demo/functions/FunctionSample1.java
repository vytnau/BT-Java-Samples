package lt.bt.java.demo.functions;

public class FunctionSample1 {

	public static void main(String[] args) {
		int sk1 = 5;
		int sk2 = 9;
		int ats = sumValue(sk1, sk2);
		
		System.out.println(ats);
	}
	
	private static int sumValue(int a, int b){
		int sum = 0;
		sum = a + b;
		return sum;		
	}

}
