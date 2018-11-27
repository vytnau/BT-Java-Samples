package lt.bt.java.abstractsample.farms;

import lt.bt.java.abstractsample.farms.data.Food;
import lt.bt.java.tasks.task8.data.Animal;

public abstract class Farm {
	protected Animal[] animals;
	protected Food[] foods;
	protected int workersCount;
	protected int animalsCount;
	
	protected abstract void feedAnimals();
	
	
}
