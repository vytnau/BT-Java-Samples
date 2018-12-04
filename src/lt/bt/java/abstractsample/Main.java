package lt.bt.java.abstractsample;

import lt.bt.java.abstractsample.farms.Farm;
import lt.bt.java.abstractsample.farms.PigFarm;

public class Main {

	public static void main(String[] args){
		Farm[] farms = new Farm[3];
		farms[0] = new PigFarm();
	}
}
