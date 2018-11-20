package lt.bt.java.demo.functions;

public class FunctionSample2 {

	public static void main(String[] args) {
		int[] myArray = { 5, 7, 8,111, 2, 6};
		int sum = arrayElementSum(myArray);
		System.out.println(sum);
		
		sum = sumElemnt(1, 4, 7, 8, 9, 8);
		System.out.println(sum);
		
		sum = sumElemnt(1, 4);
		System.out.println(sum);
		
		sumElemnt("Rezultatas:", 5, 6, 8, 9);
	}
	
	private static int arrayElementSum(int[] array){
		int sum = 0;
		for(int i = 0; i < array.length; i++){
			sum += array[i];
		}		
		return sum;
	}
	
	private static int sumElemnt(int ... sk){
		int sum = 0;
		for(int i=0; i< sk.length; i++){
			sum += sk[i];
		}
		return sum;
	}
	
	
	private static void sumElemnt(String text, int ... sk){
		int sum = 0;
		for(int i=0; i< sk.length; i++){
			sum += sk[i];
		}
		System.out.println(text + " " + sum);
	}

}
