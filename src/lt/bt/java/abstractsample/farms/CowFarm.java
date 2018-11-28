package lt.bt.java.abstractsample.farms;

import lt.bt.java.abstractsample.farms.data.Animal;
import lt.bt.java.abstractsample.farms.data.Food;

public class CowFarm extends Farm{

	@Override
	public void feedAnimals() {
		int poreikis = 0;
		for(int i = 0; i < animals.length; i++){
			Animal animal = animals[i];
			Food animalFood = animal.getEdrumas();
			poreikis += animalFood.getFoodCount(); 
		}
		int ourFood = food.getFoodCount();
		ourFood -= poreikis;
		food.setFoodCount(ourFood);		
	}


}
