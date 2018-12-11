package lt.bt.java.demo.collections.map.demo1;

import java.util.*;

public class Main {

	public static void main(String[] args) {		
		Map<String, Car> myCars = new HashMap<>();		
		Car car = new Car("HGU475", "VW", "Golf");
		myCars.put(car.getNumber(), car);
		car = new Car("AAU465", "VW", "Jeta");
		myCars.put(car.getNumber(), car);
		
		for(String key : myCars.keySet()){
			System.out.print(key);
			System.out.print(" " + myCars.get(key).getModel());
			System.out.println();
		}
		
		System.out.println(myCars.containsKey("AAU465"));
		System.out.println(myCars.containsKey("AAU464"));
		
	}
	
	private static void demo1(){
		Map<Integer, String> sample = new TreeMap<>(); 
		sample.put(1, "vienas");
		sample.put(2, "du");
		sample.put(3, "trys");
		//.....
		
		for(int key : sample.keySet()){
			//System.out.println(key);
			System.out.println(sample.get(key));
		}
		System.out.println("----------------");
		System.out.println(sample.get(5));
		System.out.println("----------------");
		System.out.println(sample.get(1));
		System.out.println("----------------");
		
		sample.put(1, "One");
		System.out.println(sample.get(1));
	}

}
