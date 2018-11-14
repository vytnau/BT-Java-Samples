package lt.bt.java.drawings;

/*
 * Noredami paleisti programa suvykdykite .bat
 * faila, kuri rasite scripts kataloge, pavadinimu
 * start-drawing.bat
 * Priesingu atveju, piesimas veiks ne taip kaip turetu.
 */
public class SampleDrawing {

	public static void main(String... args) throws Exception {
		if (System.getProperty("os.name").contains("Windows")) {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} else {
			Runtime.getRuntime().exec("clear");
		}
		int waitTime = 5000;
		int redrawRate = 100;
		int colCount = 30;
		char symbol = 'o';
		System.out.println("Drawing starts after 5 seconds");
		Thread.sleep(waitTime);
		while (true) {
			for(int i = 0; i < colCount; i++){
				System.out.print(symbol);
				Thread.sleep(redrawRate);				
			}
			if (System.getProperty("os.name").contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				Runtime.getRuntime().exec("clear");
			}			
		}
	}

}
