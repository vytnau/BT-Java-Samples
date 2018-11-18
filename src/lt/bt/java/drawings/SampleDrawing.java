package lt.bt.java.drawings;

import java.io.IOException;

/*
 * Noredami paleisti programa suvykdykite .bat
 * faila, kuri rasite scripts kataloge, pavadinimu
 * start-drawing.bat
 * Priesingu atveju, piesimas veiks ne taip kaip turetu.
 */
public class SampleDrawing {
	private static final int WAIT_TIME = 5000;
	private static final int REDRAW_RATE = 100;
	private static final int COL_COUNT = 30;
	private static final int ROW_COUNT = 10;
	private static final char DRAWING_SYMBBOL = 'o';
	private static final char SPACE_HOLDER = ' ';

	public static void main(String... args) throws Exception {
		clearScreen();
		System.out.println("Drawing starts after 5 seconds");
		Thread.sleep(WAIT_TIME);
		draw();
	}

	private static void draw() throws InterruptedException, IOException {
		while (true) {
//			for (int i = 0; i < colCount; i++) {
//				System.out.print(symbol);
//				fps();
//			}
			drawRectangle();
			clearScreen();
		}
	}

	private static void drawRectangle() throws InterruptedException, IOException {
		// linija i desine		
		drawLineRight(false);
		System.out.println("");
		String blankSpace = getBlankSpaceLine(COL_COUNT);
		// linija zemyn
		drawLineDown(false, blankSpace);		
		System.out.println("");
		//linija i kaire
		drawLineToLeft(false, blankSpace);
	}
	
	private static void drawLineToLeft(boolean isNeedAllLine, String blankSpace)
			throws InterruptedException, IOException {
		for (int i = 0; i < COL_COUNT; i++) {
			drawLineRight(true);
			drawLineDown(true, blankSpace);
			String line = "";
			for (int j = 0; j < COL_COUNT - (i + 1); j++) {
				line += SPACE_HOLDER;
			}
			for (int k = 0; k < i; k++) {
				line += DRAWING_SYMBBOL;
			}

			System.out.println(line);
			if (!isNeedAllLine) {
				fps();
			}
			clearScreen();
		}
	}
	
	private static String getBlankSpaceLine(int col){
		String blankSpace = "";
		for (int i = 0; i < col; i++) {
			blankSpace += SPACE_HOLDER;
		}
		return blankSpace;				
	}
	
	private static void drawLineRight(boolean isNeedAllLine) throws InterruptedException{		
		for (int i = 0; i < COL_COUNT; i++) {
			System.out.print(DRAWING_SYMBBOL);
			if(!isNeedAllLine){
				fps();			
			}
		}
	}
	
	private static void drawLineDown(boolean isNeedAllLine, String spaces) throws InterruptedException{
		for (int i = 0; i < ROW_COUNT; i++) {
			System.out.println(spaces + DRAWING_SYMBBOL);
			if(!isNeedAllLine){
				fps();
			}
		}
	}

	private static void fps() throws InterruptedException {
		Thread.sleep(REDRAW_RATE);
	}

	private static void clearScreen() throws InterruptedException, IOException {
		if (System.getProperty("os.name").contains("Windows")) {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} else {
			Runtime.getRuntime().exec("clear");
		}
	}

}
