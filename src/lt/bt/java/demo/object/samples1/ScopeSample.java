package lt.bt.java.demo.object.samples1;

public class ScopeSample {

	private int k1 = 0;
	public int k2 = 0;
	static int k3 = 0;
	
	public ScopeSample(){
		int k = 0;
		{
			int h = 0;
		}
		int h = 9;
	}
	
	public void method(){
		k1 = 10;
	}
	
	public void method2(int k){
		System.out.println(k);
	}
	
	private void method3(int k1){
		this.k1 = 9;
		this.k1 = k1;
	}
	
	
	public static void main(String[] args) {
		ScopeSample scopeSampe = new ScopeSample();
		scopeSampe.k1 = 8;
		scopeSampe.k2 = 7;
		k3 = 8;
		scopeSampe.method3(10);
		// TODO Auto-generated method stub

	}

}
