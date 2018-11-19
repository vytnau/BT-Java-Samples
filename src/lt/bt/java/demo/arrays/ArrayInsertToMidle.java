package lt.bt.java.demo.arrays;

public class ArrayInsertToMidle {
	public static void main(String[] args) {
		int[] myArray = {7, 24, 32, 14};
		int[] biggerArray = new int[myArray.length+1];
		int sk = 0;
		int lygu = 24;
		
		int j = 0;
		for(int i = 0; i < myArray.length; i++){
			if(myArray[i] == lygu){
				biggerArray[j] = myArray[i];
				j++;
				biggerArray[j] = sk;
			} else {
				biggerArray[j] = myArray[i];
			}
			j++;
		}
		
		for(int i = 0; i < biggerArray.length; i++){
			System.out.println(biggerArray[i]);
		}

	}
}
