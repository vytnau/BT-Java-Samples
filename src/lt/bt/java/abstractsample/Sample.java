package lt.bt.java.abstractsample;

public class Sample {
	
	private int k = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main metodas");
		
		int g = Sample.keistiK(3, 8);
		
		Sample s = new Sample();
		s.skaiciuoti(10);
		
	}
	
	public static int keistiK(int a, int b){
		return a + b;
	}
	
	public int skaiciuoti(int h){
		k += h;
		return k;
	}
	
	
	

}
