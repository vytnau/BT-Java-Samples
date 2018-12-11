package lt.bt.java.demo.genericAndEnum.demo2;

import lt.bt.java.demo.genericAndEnum.demo2.Planet;

public class Main {

	public static void main(String[] args) {

		double earthWeight = 100;

		double mass = earthWeight / Planet.EARTH.surfaceGravity();

		for (Planet p : Planet.values()) {
			if (p == Planet.EARTH) {
				System.out.println("Your weight on " + p + " is " + p.surfaceWeight(mass) + "kg");
			}
		}
		
		Planet p = Planet.EARTH;
		switch (p) {
		case EARTH:
			
			break;

		default:
			
			break;
		}
	}
}
