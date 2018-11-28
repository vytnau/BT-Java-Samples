package lt.bt.java.abstractsample.farms.data;

public class Dog extends Animal  {

	public Dog(){
		super("Dog");
	}
	@Override
	public String toString(){
		return type + ": au au";
	}
}
