package lt.bt.java.demo.arrays;

public class RemoveFromArray {

	public static void main(String[] args) {
		int[] myArray = {1, 2, 3, 4};
		int[] smallerArray = new int[3];
		
		for(int i = 0; i < smallerArray.length; i++){
			if(i < myArray.length){
				smallerArray[i] = myArray[i];
			}
		}
		
		for(int i = 0; i < smallerArray.length; i++){
			System.out.println(smallerArray[i]);
		}
	}

}
