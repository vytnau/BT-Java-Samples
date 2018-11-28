package lt.bt.java.abstractsample.farms.data;

public class Chicken extends Animal {

	public Chicken() {
		super("Chicken");
	}
	
	@Override
	public String toString(){
		return type + ": cyp cyp cyp";
	}
}
