package lt.bt.java.tasks;

public class Uzduotis4c {

	public static void main(String[] args) {
		int[] dataArray = { 3, 5, 7, 34, 1, 3, 6, 8, 8, 5 };
		int[] printedArray = new int[10]; 		
		
		for (int i = 0, k = 0; i < dataArray.length; i++) {
			int kiekis = 0;
			for (int j = 0; j < dataArray.length; j++) {
				if (dataArray[i] == dataArray[j]) {
					kiekis++;
				}
			}
						
			k++;
			boolean duplicate = false;
			for(int y = 0; y < k; y++){
				if(printedArray[y] == dataArray[i]){
					duplicate = true;
				}
			}
			
			if(!duplicate){
				System.out.println(dataArray[i] + " - " + kiekis);
				printedArray[k] = dataArray[i];
			}
		}
	}	
}
