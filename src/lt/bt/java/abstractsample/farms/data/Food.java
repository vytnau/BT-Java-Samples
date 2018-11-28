package lt.bt.java.abstractsample.farms.data;

public class Food {
	private String foodName;
	private int foodCount;
	
	public Food(){
		
	}
	
	public Food(String maistoPavadinimas, int kiekis) {
		this.foodName = maistoPavadinimas;
		this.foodCount = kiekis;
	}
	
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getFoodCount() {
		return foodCount;
	}
	public void setFoodCount(int foodCount) {
		this.foodCount = foodCount;
	}
}
