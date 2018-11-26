package lt.bt.java.demo.object.samples;

public class Utils {

	public static String formatName(String name, String lastName){
		return name + " - " + lastName;
	}
	
	public static String formatName(Human human){
		return human.getName() + " - " + human.getLastName();
	}
}
