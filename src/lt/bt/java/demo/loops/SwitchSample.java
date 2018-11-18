package lt.bt.java.demo.loops;

public class SwitchSample {

	public static void main(String[] args) {
		int sk = 1;
		switch (sk) {
		case 1:
		case 3:
			System.out.println("Nelyginis");
			break;
		case 2:
			break;			
		default:
			System.out.println("Neaprasytas");
		}

	}

}
