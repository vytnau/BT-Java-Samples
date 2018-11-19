package lt.bt.java.demo.arrays;

public class ArraySortSample {

	public static void main(String[] args) {
		int[] array = {5, 7, 8, 9, -1};
		System.out.println("Pries rikiavima");
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
		
		for(int i = 0; i < array.length; i++){
			for(int j = i + 1; j < array.length; j++){
				int sk1 = array[i];
				int sk2 = array[j];
				if(sk1 < sk2){
					array[j] = sk1;
					array[i] = sk2;
				}				
			}
		}
		
		System.out.println("Po rikiavimo");
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}

	}

}
