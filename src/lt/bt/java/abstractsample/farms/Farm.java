package lt.bt.java.abstractsample.farms;

import lt.bt.java.abstractsample.farms.data.Food;
import lt.bt.java.abstractsample.farms.data.Animal;

public abstract class Farm {
	protected Animal[] animals;
	protected Food food;
	protected int workersCount;
	protected int animalsCount = 0;

	public abstract void feedAnimals();
	
	public double calculateFood(){
		double result = 0;
		int poreikis = 0;
		for(int i = 0; i < animals.length; i++){
			Animal animal = animals[i];
			Food animalFood = animal.getEdrumas();
			poreikis += animalFood.getFoodCount(); 
		}
		
		result = food.getFoodCount() / poreikis;
		return result;
	}

	public void addAnimal(Animal animal) {
		if (animals == null) {
			animals = new Animal[1];
			animals[0] = animal;
			animalsCount++;
		} else {
			Animal[] tmp = new Animal[animalsCount + 1];
			for (int i = 0; i < animalsCount; i++) {
				tmp[i] = animals[i];
			}
			tmp[animalsCount] = animal;
			animalsCount++;
			animals = tmp;
		}
	}
	
	public void setFood(Food food){
		this.food = food;
	}

//	public void addFood(Food food) {
//		if (foods == null) {
//			foods = new Food[1];
//			foods[0] = food;			
//		} else {
//			int foodsCount = foods.length;
//			Food[] tmp = new Food[foodsCount + 1];
//			for (int i = 0; i < foodsCount; i++) {
//				tmp[i] = foods[i];
//			}
//			tmp[foodsCount] = food;
//			foods = tmp;
//		}
//	}
}
