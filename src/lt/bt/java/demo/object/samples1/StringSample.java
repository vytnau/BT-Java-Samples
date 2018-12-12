package lt.bt.java.demo.object.samples1;

public class StringSample {

	public static void main(String[] args) {
		String txt = "http\\google.lt";
		if(txt.startsWith("https")){
			System.out.println("Saugus tinklas");
		} else {
			System.out.println("Nesaugus tinklas");
		}
				
	}

}
