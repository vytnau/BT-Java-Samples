package lt.bt.java.abstractsample;

import lt.bt.java.abstractsample.farms.CowFarm;
import lt.bt.java.abstractsample.farms.Farm;
import lt.bt.java.abstractsample.farms.PigFarm;
import lt.bt.java.abstractsample.farms.data.Cow;
import lt.bt.java.abstractsample.farms.data.Food;


public class AbstractTest {

	//Abstrakti klase ferma
	//Kiekvina ferma augina tam tikrus gyvunus
	//Fermos klases turi feedAnimal metoda
	//kiekvienas gyvunas suvalgo skirtinga kieki pasaro
	//kiekviena fermos klase kaupia pasaro atsargas ziemai
	//uzduotis: Parasyti programa, kuri suskaiciuotu kiek dienu uzteks pasaro
	public static void main(String[] args) {
		Farm cowFarm = new CowFarm();
		Farm pigFarm = new PigFarm();
		
		Cow cow = new Cow(); // == cowFarm.addAnimal(new Cow());
		cowFarm.addAnimal(cow);
		cowFarm.addAnimal(new Cow());
		
		cowFarm.setFood(new Food("Zole", 100));
		//cowFarm.addFood(new Food("Sienas", 200));
		
		System.out.println("Maisto uzteks: " + cowFarm.calculateFood() + " dienoms");
		cowFarm.feedAnimals();
		System.out.println("Maisto uzteks: " + cowFarm.calculateFood() + " dienoms");
		
		pigFarm.addAnimal(new Cow());
		//pigFarm.addFood(new Food());
	}

}
