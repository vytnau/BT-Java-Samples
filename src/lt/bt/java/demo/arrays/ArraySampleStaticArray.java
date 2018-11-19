package lt.bt.java.demo.arrays;

public class ArraySampleStaticArray {

	public static void main(String[] args) {
		int[] array = new int[10];
		int arraySize = 0;
		
		for(int i = 0; i < 5; i++){
			array[i] = i+1;
			arraySize++;
		}
		
		for(int i = 0; i < arraySize; i++){
			System.out.println(array[i]);
		}
		

	}

}
