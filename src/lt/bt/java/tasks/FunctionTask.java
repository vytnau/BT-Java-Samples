package lt.bt.java.tasks;

public class FunctionTask {

	public static void main(String[] args) {
		int[] myArray = { 8, 5, 6, 4, 9, 1, 7 };
		int sum = arrayElementsSum(myArray);
		System.out.println("Sum average elements:  " + sum);
		double average = arrayAverage(myArray);
		System.out.println("Average value of array elements is: " + average);
		int[] removeArray = newArray(myArray);
		System.out.println("Vidurkis mazesnis uz masyvo elementus:");
		double removeElements = average;
		int j = 0;
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] != removeElements) {
				removeArray[j] = myArray[i];
				j++;
			}
		}
		printBiggerAvg(removeArray, average);
		int er = printBiggerAvg2(removeArray, average);
		if(er == 0){
			System.out.println("sucess");			
		} else {
			System.out.println("fail");
		}
	}

	private static void printBiggerAvg(int[] array, double avg) {
		for (int i = 0; i < array.length; i++) {
			if (avg < array[i]) {
				System.out.println(array[i]);
			}
		}
	}
	
	private static int printBiggerAvg2(int[] array, double avg) {
		for (int i = 0; i < array.length; i++) {
			if (avg < array[i]) {
				printText(array[i]);
			}
		}
		return 0;
	}
	
	private static int printText(int sk){
		System.out.println(sk);
		return 0;
	}

	private static int arrayElementsSum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	private static double arrayAverage(int[] array) {
		double arrayLength = array.length;
		double average = arrayElementsSum(array) / arrayLength;
		return average;
	}

	private static int[] newArray(int[] array) {
		int arraySize = array.length;
		int[] removeArray = new int[arraySize];
		return removeArray;
	}
}
