package lt.bt.java.demo.nestedclass.demo1;

public class Sample1 {

	int kintamasis1Sample1;
	int kintamasis2Sample1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 sample1 = new Sample1();
		
	}
	
	
	class Sample2{
		int kintamasis1Sample2;
		int kintamasis2Sample2;
		
		public void sample(){
			Sample1.this.kintamasis2Sample1 = 0;
		}
	}

}
