package lt.bt.java.tasks.printToFile;

import java.util.LinkedList;
import java.util.List;

public class CalculateService {

	private List<IOApi> apiList; 
	
	public CalculateService(String dataFile, String resultFile){
		apiList = new LinkedList<IOApi>();
		apiList.add(new ConsoleIO());
		apiList.add(new FileIO(dataFile, resultFile));
	}
	
	public int calculate(Data data){
		int result = data.getNumber1() + data.getNumber2();
		return result;
	}
	
	public void printResultsToAllSource(Data data, String text, int result){
		text += data.getNumber1() + " + " + data.getNumber2() + " = ";
		for(IOApi ioApi : apiList){
			ioApi.write(text, result);
		}
	}
	
	public void printToConsole(Data data, String text, int result){
		text += data.getNumber1() + " + " + data.getNumber2() + " = ";
		for(IOApi ioApi : apiList){
			if(ioApi instanceof ConsoleIO){
				ioApi.write(text, result);
			}
		}
	}
	
	public void printToFile(Data data, String text, int result){
		text += data.getNumber1() + " + " + data.getNumber2() + " = ";
		for(IOApi ioApi : apiList){
			if(ioApi instanceof FileIO){
				ioApi.write(text, result);
			}
		}
	}
	
	public Data readDataFromFile(){
		Data data = null;
		for(IOApi ioApi : apiList){
			if(ioApi instanceof FileIO){
				data = ioApi.read();
			}
		}
		
		return data;
	}
	
	public Data readDataFromConsole(){
		Data data = null;
		for(IOApi ioApi : apiList){
			if(ioApi instanceof ConsoleIO){
				data = ioApi.read();
			}
		}
		
		return data;
	}
}
