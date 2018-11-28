package lt.bt.java.abstractsample.farms.data;

public class Animal {
	protected String type = null;
	protected Food edrumas = null;
	
	
	public Animal(String type){
		this.type = type;
	}
	
	public Food getEdrumas(){
		return edrumas;
	}
	
}
