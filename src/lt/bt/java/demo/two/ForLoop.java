package lt.bt.java.demo.two;

public class ForLoop {

	public static void main(String[] args) {
		
		int repeatCount = 15;
		for(int i =0; i < repeatCount; i++ ){
			if(i % 2 == 0){
				continue;
			}
			System.out.println(i+1 + " labas");
		}
		
//		boolean forever = true;
//		for(; forever; ){
//			System.out.println("labas");
//		}
		// TODO Auto-generated method stub

	}

}
