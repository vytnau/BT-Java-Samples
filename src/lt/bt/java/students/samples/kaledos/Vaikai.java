package lt.bt.kaledos;

public class Vaikai extends Child{

	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + age;
	}
}
