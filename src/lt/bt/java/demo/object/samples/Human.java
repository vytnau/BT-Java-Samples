package lt.bt.java.demo.object.samples;

public class Human {
	private String name = "";
	private String lastName = "";
	int age = 16;
	public String address = "Adresas";
	private int array[] = null;
	
	public Human(){
		name = "Nera vardo";
		lastName = "nera pavardes";
		array = new int[0];
	}
	
	public Human(String name){
		this();
		this.name = name;
	}
	
	public Human(String name, String lastName, int[] newArray){
		this.array = newArray;
		this.name = name;
		this.lastName = lastName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public static void print(Human human){		
		System.out.println(human.getName());
	}
}
