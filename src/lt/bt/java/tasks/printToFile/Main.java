package lt.bt.java.tasks.printToFile;

public class Main {

	private static final String DATA_FILE = "res\\txt\\task\\InterfaceData.txt";
	private static final String RESULT_FILE = "res\\txt\\out\\InterfaceResult.txt";
	
	public static void main(String[] args) {
		CalculateService calculateService = new CalculateService(DATA_FILE, RESULT_FILE);
		//1 task
		Data data = calculateService.readDataFromConsole();
		int result = calculateService.calculate(data);
		calculateService.printResultsToAllSource(data, "Suskaiciuotas rezultatas: ", result);
		
		//2 task
		data = calculateService.readDataFromFile();
		result = calculateService.calculate(data);
		calculateService.printToFile(data, "Suskaiciuotas rezultatas: ", result);
		
		//3 task
		data = calculateService.readDataFromConsole();
		result = calculateService.calculate(data);
		calculateService.printToConsole(data, "Suskaiciuotas rezultatas: ", result);		
	}

}
