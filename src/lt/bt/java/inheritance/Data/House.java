package lt.bt.java.inheritance.Data;

import lt.bt.java.inheritance.Data2.Buildings;

public class House extends Buildings {

	public House(){		
		super();
		System.out.println("House constructor");
		hight = 100;
	}
	
	public House(String address){
		this();
		System.out.println("House constructor 2");
		setAddress(address);
	}
	
	
	@Override
	public String toString(){
		return "new Text";
	}
	
	@Override
	public void print(){
		System.out.println("House");
	}
	
	public void onlyHouseHas(){
		
	}
}
