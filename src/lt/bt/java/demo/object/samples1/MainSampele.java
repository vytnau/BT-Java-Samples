package lt.bt.java.demo.object.samples1;

import java.util.LinkedList;
import java.util.List;

public class MainSampele {

	private List<String> list = null;
	private final int sk;
	public final static int SK1 = 0;
	
	public MainSampele(){
		sk = 10;
		list = new LinkedList<>();
		System.out.println("Konstruktorius be parametru");
	}
	
	public MainSampele(int a){		
		//this();
		sk = a;
		System.out.println("Konstruktorius gavo a reiksme " + a);
	}
	
	
	public static void main(String[] args){
		//new Sample();
		new MainSampele(8);
	}
	
}
