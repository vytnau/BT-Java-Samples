package lt.bt.kaledos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Dirbtuves {
	
	public Map<String, Integer> getZaisluUzsakymas(List<Vaikai> vaik, List<Charakteristika> person){
		Map<String, Integer> result = new HashMap<>();
		for(int i = 0; i < vaik.size(); i++){
			Vaikai vaikas = vaik.get(i);
			for(int j = 0; j < person.size(); j++){
				Charakteristika vaikoChar = person.get(j);
				if(vaikas.getName().equals(vaikoChar.getName()) && vaikas.getLName().equals(vaikoChar.getLastName())){
					if(vaikoChar.getPersonality() == GerasBlogas.GERAS){					
						Integer toyCount = result.get(vaikas.getToy());
						if(toyCount == null){
							result.put(vaikas.getToy(), 1);
						}
						result.put(vaikas.getToy(), toyCount + 1);
					}
					break;
				}				
			}
		}
				
		return result;		
	}
	
	public List<Child> getZaisluUzsakymas2(List<Vaikai> vaik, List<Charakteristika> person){
		List<Child> result = new LinkedList();
		for(int i = 0; i < vaik.size(); i++){
			Vaikai vaikas = vaik.get(i);
			for(int j = 0; j < person.size(); j++){
				Charakteristika vaikoChar = person.get(j);
				if(vaikas.getName().equals(vaikoChar.getName()) && vaikas.getlName().equals(vaikoChar.getLastName())){
					Child child = new Child();
					child.setlName(vaikas.getName());
					child.setName(vaikas.getName());
					if(vaikoChar.getPersonality() == GerasBlogas.GERAS){
						child.setToy(vaikas.getToy());								
					} else {
						child.setToy("anglys");
					}
					
					result.add(child);			
					break;
				}				
			}
		}
				
		return result;		
	}
	
	
	public List<Sandelis> sarasasGaminamuZailsu(List<Sandelis> sandelis, List<Child> person){
		List<Sandelis> result = new LinkedList();
		for(int i = 0; i < sandelis.size(); i++){
			Sandelis sand = sandelis.get(i);
			for(int j = 0; j < person.size(); j++){
				Child vaikoZaisl = person.get(j);
				if(sand.getToyName().equals(vaikoZaisl.getToy())){
					int quant = sand.getQuant();					
					sand.setQuant(quant--);		
					if(quant < 0 ){
						addToResultList(result, vaikoZaisl.getToy());
					}
				} else {
					addToResultList(result, vaikoZaisl.getToy());
				}
			}
		}
				
		return result;		
	}
	
	
	private void addToResultList(List<Sandelis> result, String toy){
		int index = getListIndex(result, toy);
		if(index > -1){
			int kiekis = result.get(index).getQuant();
			kiekis++;
			result.get(index).setQuant(kiekis);
		} else {
			Sandelis newToy = new Sandelis();
			newToy.setQuant(1);
			newToy.setToyName(toy);
			result.add(newToy);
		}
	}
	
	private int getListIndex(List<Sandelis> sandelis, String toy){
		int i = 0;		
		for(Sandelis sand : sandelis){
			i++;
			if(sand.getToyName().equals(toy)){
				return i;
			}
		}
		return -1;
	}

	public Map<String, Integer> getIsardomiZaislai(List<Vaikai> vaik, List<Charakteristika> person,
			List<Sandelis> elfuZaislai) {
		Map<String, Integer> isardomiZaislai = new HashMap<>();
		Map<String, Integer> vZaislai = new HashMap<>();
		Map<String, Integer> sutrauktaList = new HashMap<>();

		String sandelioZaislas;
		int sandelioKiekis = 0;
		String zaislas = null;
		String vaikoZaislas = null;
		int zaisluKiekis = 1;

		for (Vaikai v : vaik) {
			if (v.getAge() < 15) {
				for (Charakteristika p : person) {
					if (p.getPersonality().trim().equals("Geras")) {
						for (int i = 0; i < vaik.size(); i++) {
							if (v.getName().trim().equals(p.getName().trim())) {
								vaikoZaislas = v.getToy();

								if (sutrauktaList.containsKey(vaikoZaislas.trim())) {
									zaisluKiekis++;
									sutrauktaList.put(vaikoZaislas, zaisluKiekis);
								} else {
									zaisluKiekis = 1;
									sutrauktaList.put(vaikoZaislas, zaisluKiekis);
								}

							}
						}
						for (Map.Entry<String, Integer> entry : sutrauktaList.entrySet()) {
							for (Sandelis s : elfuZaislai) {
								if (entry.getKey().contains(s.getToyName())) {
									vaikoZaislas = entry.getKey().trim();
									vZaislai.put(vaikoZaislas, zaisluKiekis);
								}
							}
						}
						for (Sandelis s : elfuZaislai) {
							sandelioKiekis = s.getQuant();
							if (vaikoZaislas.equals(s.getToyName())) {
								sandelioKiekis -= zaisluKiekis;
								isardomiZaislai.put(vaikoZaislas, sandelioKiekis);
							}
						}
					}
				}
				for (Sandelis s : elfuZaislai) {
					if ((v.getAge() >= 15 && !s.getToyName().trim().equals("Anglies maisai"))
							|| (!vaikoZaislas.trim().equals(s.getToyName())
									&& !s.getToyName().trim().equals("Anglies maisai"))) {

						int naujasKiekis = s.getQuant();
						isardomiZaislai.put(s.getToyName(), naujasKiekis);
					}
				}
			}
		}
		return isardomiZaislai;
	}

	public Map<String, Integer> getAngliesMaisai(List<Vaikai> vaik, List<Charakteristika> person,
			List<Sandelis> elfuZaislai) {
		Map<String, Integer> anglis = new HashMap<>();
		int angliuKiekis = 0;
		String angliesMaisas = null;
		int likusiAnglis = 0;
		int kiekis = 0;
		boolean rightAge = false;
		for (Vaikai v : vaik) {
			if (v.getAge() >= 15) {
				rightAge = false;
			} else if (v.getAge() < 15) {
				rightAge = true;
			}
		}
		if (rightAge) {
			for (Charakteristika p : person) {
				if (p.getPersonality().trim().equals("Blogas")) {
					angliuKiekis++;
					angliesMaisas = "Anglies maisai";
					for (Sandelis s : elfuZaislai) {
						if (angliesMaisas.equals(s.getToyName())) {
							kiekis = s.getQuant();
							likusiAnglis = kiekis - angliuKiekis;
						}
					}
				}
			}
			if (likusiAnglis < 0) {
				anglis.put("Reikia papildyti anglies atsargas, reikalingas maisu kiekis", likusiAnglis * (-1));
				anglis.put("Ruošiami anglies maišai vaikams", angliuKiekis);
			} else if (likusiAnglis >= 0) {
				anglis.put("Likusi anglis", likusiAnglis);
				anglis.put("Ruošiami anglies maišai vaikams", angliuKiekis);
			}
		}
		return anglis;
	}

	public Map<String, Integer> getVaikuZaislai(List<Vaikai> vaik, List<Charakteristika> person,
			List<Sandelis> elfuZaislai) {
		String personality = null;
		String reikalingasZaislas = null;
		Map<String, Integer> vaikuZaislai = new HashMap<>();
		Map<String, Integer> duplicates = new HashMap<>();
		int kiekis = 1;

		for (Vaikai v : vaik) {
			if (v.getAge() >= 15) {
				for (Charakteristika p : person) {
					personality = p.getPersonality();
					if (personality.trim().equals("Geras")) {

						if (v.getName().trim().equals(p.getName())) {
							reikalingasZaislas = v.getToy();

							if (duplicates.containsKey(reikalingasZaislas.trim())) {
								duplicates.put(reikalingasZaislas, kiekis + 1);
							} else {
								duplicates.put(reikalingasZaislas, kiekis);
							}
						}
					}
				}
				for (Map.Entry<String, Integer> entry : duplicates.entrySet()) {
					for (Sandelis s : elfuZaislai) {
						if (entry.getKey().contains(s.getToyName())) {
							vaikuZaislai.put(entry.getKey(), entry.getValue());
						}
					}
				}
			}
		}
		return vaikuZaislai;
	}

	/*
	 * public Map<String, Integer> getElfuZaislai(List<Vaikai> vaikuZaislai,
	 * List<Sandelis> elfuZaislai){
	 * 
	 * int likeZaislai=0; int kiekis=0; int kiekis2=0; String pavadinimas =
	 * null; for(Vaikai vaikuZ:vaikuZaislai){ for(Sandelis zaislai: elfuZaislai)
	 * { if(vaikuZ.getToy().equals(zaislai.getToyName())) { kiekis =
	 * zaislai.getQuant(); kiekis2++; likeZaislai = kiekis - kiekis2;
	 * pavadinimas = zaislai.getToyName(); elfuList.put(pavadinimas,
	 * likeZaislai); } else if(!vaikuZ.getToy().equals(zaislai.getToyName())) {
	 * elfuList.put(zaislai.getToyName(), zaislai.getQuant()); } } }
	 * 
	 * return elfuList; }
	 */
	/*
	 * public static GerasBlogas konvertuotiEnum(String bruozai) { GerasBlogas
	 * bruoz = null; String bruozaiTxtLower = bruozai.toLowerCase();
	 * if(bruozaiTxtLower == "Geras") { bruoz = GerasBlogas.GERAS; }
	 * if(bruozaiTxtLower == "Blogas") { bruoz = GerasBlogas.BLOGAS; } return
	 * bruoz; }
	 * 
	 * private static void enumMaping() { // ENUMAS ateina is isores, kaip
	 * sumapinti GerasBlogas bruozas = konvertuotiEnum("Geras"); GerasBlogas
	 * bruozas2 = konvertuotiEnum("Blogas"); if (bruozas != null &&
	 * bruozas.equals(GerasBlogas.GERAS)) { System.out.println("Geras"); } else
	 * if(bruozas2 != null && bruozas.equals(GerasBlogas.BLOGAS)){
	 * System.out.println("Blogas"); } }
	 */
}
