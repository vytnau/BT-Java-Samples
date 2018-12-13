package lt.bt.java.sample.task;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lt.bt.java.sample.task.data.Automobilis;
import lt.bt.java.sample.task.data.Kontrole;
import lt.bt.java.sample.task.data.ParkavimasBaigsis;
import lt.bt.java.sample.task.data.Zonos;

public class KontrolesServisas {
	
	private static final String MINUTE = "MINUTES";
	private static final String VALANDA = "VALANDA";
	private static final String FILE_PATH = "C:\\temp\\result.txt";
	
	private FailoServisas failoServisas;
	
	public KontrolesServisas(){
		failoServisas = new FailoServisas();
	}
	
	public boolean arApmoketasAutomobilioParkavimas(List<Automobilis> automobiliai, Kontrole tikrinamasAuto){
		for(Automobilis automobilis : automobiliai){
			String autoNr = automobilis.getValstNumeris();
			String tikrNr = tikrinamasAuto.getValstNumeris();
			if(autoNr.equals(tikrNr)){
				Zonos autoZona = automobilis.getZona();
				Zonos tikrZona = tikrinamasAuto.getZona();
				if(autoZona.equals(tikrZona)){
					int autoVal = automobilis.getValanda();
					int tikrVal = tikrinamasAuto.getValanda();
					int autoMin = automobilis.getMinutes();
					int tikrMin = tikrinamasAuto.getMinutes();					
					if(autoVal <= tikrVal){
						if(autoMin <= tikrMin){
							return false;
						} else {
							return true;
						}
					} else {
						return true;
					}
				} else {
					return false;
				}				
			}
		}
		return false;
	}
	
	public ParkavimasBaigsis automobilioParkavimoGaliojimas(List<Automobilis> automobiliai, Kontrole tikrinamasAuto){
		ParkavimasBaigsis parkavimoLaikas = null;
		for(Automobilis automobilis : automobiliai){
			String autoNr = automobilis.getValstNumeris();
			String tikrNr = tikrinamasAuto.getValstNumeris();
			if(autoNr.equals(tikrNr)){								
				Zonos autoZona = automobilis.getZona();
				Zonos tikrZona = tikrinamasAuto.getZona();
				if(autoZona.equals(tikrZona)){
					int autoVal = automobilis.getValanda();
					int tikrVal = tikrinamasAuto.getValanda();
					int autoMin = automobilis.getMinutes();
					int tikrMin = tikrinamasAuto.getMinutes();
					Map<String, Integer> laikoSkirt = suskaiciuotiLaikoSkirtuma(tikrVal, autoVal, tikrMin, autoMin);
					int likoVal = laikoSkirt.get(VALANDA);
					int likoMin = laikoSkirt.get(MINUTE);
					parkavimoLaikas = new ParkavimasBaigsis(tikrNr, likoVal, likoMin);
				}				
			}
		}
		return parkavimoLaikas;
	}
	
	private Map<String, Integer> suskaiciuotiLaikoSkirtuma(int val1, int val2, int min1, int min2){
		Map<String, Integer> rezultatas = new HashMap<>();
		int minRez = min2 - min1;
		if(minRez < 0){
			minRez *= -1;
			val1++;
		}
		
		int valRez = val2 - val1;
		if(valRez < 0){
			valRez = 0;
		}
		
		rezultatas.put(VALANDA, valRez);
		rezultatas.put(MINUTE, minRez);
		
		return rezultatas;
	}
	
	
	
	public static Zonos konvertuotiZona(String zonaTxt){
		Zonos zona = null;
		String zonaTxtLower = zonaTxt.toLowerCase();
		if(zonaTxtLower.equals("geltona")){
			zona = Zonos.GELTONA;
		} else if(zonaTxtLower.equals("melyna")){
			zona = Zonos.MELYNA;
		}
		
		return zona;
	}
	
	public void spausdintiAutoParkavimoTermina(ParkavimasBaigsis parkavimasBaigsis){
		try {
			failoServisas.spausdinti(parkavimasBaigsis, FILE_PATH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
