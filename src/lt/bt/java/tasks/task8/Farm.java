package lt.bt.java.tasks.task8;

import lt.bt.java.tasks.task8.data.Animal;
import lt.bt.java.tasks.task8.data.Chicken;
import lt.bt.java.tasks.task8.data.Cow;
import lt.bt.java.tasks.task8.data.Dog;
import lt.bt.java.tasks.task8.data.Sheep;

public class Farm {

	
	public static void main(String[] args) {
		Farm farm = new Farm();
		farm.executeFarm();
	}
	
	public void executeFarm(){
		Animal[] animals = new Animal[4];
		animals[0] = new Sheep();
		animals[1] = new Cow();
		animals[2] = new Chicken();
		animals[3] = new Dog();
		printAnimalSounds(animals);
	}
	
	public void printAnimalSounds(Animal[] animals){
		System.out.println("Animals:");
		for(int i = 0; i < animals.length; i++){
			Animal animal = animals[i];
			System.out.println(animal.toString());
		}
	}
	
	

}
