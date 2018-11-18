package lt.bt.java.demo.arrays;

public class InsertToArray {

	public static void main(String[] args) {
		int[] myArray = {1, 2, 3, 4};
		int[] biggerArray = new int[5];
		
		for(int i = 0; i < biggerArray.length; i++){
			if(i < myArray.length){
				biggerArray[i] = myArray[i];
			}else {
				biggerArray[i] = i + 1;
			}
		}
		
		for(int i = 0; i < biggerArray.length; i++){
			System.out.println(biggerArray[i]);
		}

	}

}
