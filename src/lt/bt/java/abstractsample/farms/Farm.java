package lt.bt.java.abstractsample.farms;

import lt.bt.java.abstractsample.farms.data.Food;
import lt.bt.java.tasks.task8.data.Animal;

public abstract class Farm {
	protected Animal[] animals;
	protected Food[] foods;
	protected int workersCount;
	protected int animalsCount = 0;

	protected abstract void feedAnimals();

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

	public void addFood(Food food) {
		if (foods == null) {
			foods = new Food[1];
			foods[0] = food;			
		} else {
			int foodsCount = foods.length;
			Food[] tmp = new Food[foodsCount + 1];
			for (int i = 0; i < foodsCount; i++) {
				tmp[i] = foods[i];
			}
			tmp[foodsCount] = food;
			foods = tmp;
		}
	}
}
