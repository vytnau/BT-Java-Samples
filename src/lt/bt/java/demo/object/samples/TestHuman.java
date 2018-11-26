package lt.bt.java.demo.object.samples;

public class TestHuman {

	public static void main(String[] args) {
		Human human = new Human();
		System.out.println(human.getName());
		human.setName("Vytautas");
		System.out.println(human.getName());
		System.out.println("-------------");
		
		Human human2 = new Human("Petras");
		System.out.println(human2.getName());
		System.out.println(human2.getLastName());
		System.out.println("-------------");
		
		Human human3 = new Human("Jonas", "Jonaitis");
		System.out.println(human3.getName());
		System.out.println(human3.getLastName());
		System.out.println("-------------");
		
		human3.age = 5;
		String humanStr = Utils.formatName(human3.getName(), human3.getLastName());
		System.out.println(humanStr);
		System.out.println("-------------");
		
		String humanStr2 = Utils.formatName(human3);
		System.out.println(humanStr2);
		System.out.println("-------------");
		
		String humanStr3 = Utils.formatName("Pirmas txt", "antras txt");
		System.out.println(humanStr3);
		System.out.println("-------------");
		
		Human.print(human3);
		System.out.println("-------------");
	}

}
