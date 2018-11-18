package lt.bt.java.demo.loops;

public class WhileLoop {

	public static void main(String[] args) {
		int i = 0;
		int repeatCount = 15;
		while(i < repeatCount) {
			System.out.println(i + " labas");			
			if(i == 0){
				break;
			}
			i++;
		}

	}

}
