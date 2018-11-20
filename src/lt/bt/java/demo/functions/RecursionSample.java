package lt.bt.java.demo.functions;

public class RecursionSample {

	public static void main(String[] args) {
		int[] myArray = {3, 6, 7, 9};
		int printFrom = 0;
		printArray(printFrom, myArray);
	}
	
	private static void printArray(int i, int[] array){
		if(i < array.length){
			System.out.println(array[i]);
			i = i + 1;
			printArray(i, array);
		}
	}

}
