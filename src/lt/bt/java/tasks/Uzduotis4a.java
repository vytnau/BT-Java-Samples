package lt.bt.java.tasks;

public class Uzduotis4a {

	public static void main(String[] args) {
		int[] dataArray= {3, 5, 7, 34, 1, 3, 6, 8, 8, 5};
		int[] dataCountArray = new int[dataArray.length];
		
		for(int i = 0; i < dataArray.length; i++) {
			int kiekis=0;
			for(int j=0; j < dataArray.length; j++) {
				if(dataArray[i] == dataArray[j]) {
					kiekis++;
					dataCountArray[i] = kiekis;					
				}						
			}
			System.out.println(dataArray[i] + " - " + dataCountArray[i]);
		}
	}
}



