package lt.bt.java.demo.arrays;

public class ArrayRemoveMidle {

	public static void main(String[] args) {
		int[] myArray = { 1, 2, 3, 4 };
		int arraySize = 3;
		int[] smallerArray = new int[arraySize];		
		int removeElement = 3;

		int j = 0;
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] != removeElement) {
				smallerArray[j] = myArray[i];
				j++;
			}
		}

		for (int i = 0; i < smallerArray.length; i++) {
			System.out.println(smallerArray[i]);
		}
	}
}
