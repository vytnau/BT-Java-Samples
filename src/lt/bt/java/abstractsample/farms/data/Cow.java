package lt.bt.java.abstractsample.farms.data;

public class Cow extends Animal {

	public Cow(){
		super("Cow");
		Food zole = new Food("Zole", 5);
		Food sienas = new Food("Sienas", 10);
		edrumas = zole; 
	}
	@Override
	public String toString(){
		return type + ": mooooo";
	}
}
