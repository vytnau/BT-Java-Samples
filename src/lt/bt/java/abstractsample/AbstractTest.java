package lt.bt.java.abstractsample;

import lt.bt.java.abstractsample.farms.CowFarm;
import lt.bt.java.abstractsample.farms.Farm;
import lt.bt.java.abstractsample.farms.PigFarm;
import lt.bt.java.abstractsample.farms.data.Food;
import lt.bt.java.tasks.task8.data.Cow;

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
		
		cowFarm.addAnimal(new Cow());
		cowFarm.addFood(new Food());
		pigFarm.addAnimal(new Cow());
		pigFarm.addFood(new Food());

	}

}
