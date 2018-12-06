package lt.bt.java.demo.nestedclass.demo5;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args){		
		List<Integer> musuDuomenys = getData();
		skaicuoti1(musuDuomenys);
		skaicuoti2(musuDuomenys);
		
	}
	
	private static List<Integer> getData(){
		List<Integer> data = new LinkedList<>();
		data.add(5);
		data.add(6);
		data.add(6);
		data.add(6);
		data.add(2);
		
		return data;
	}
	
	private static void skaicuoti1(List<Integer> data){
		//Sukuriam anonimine klase
		Interfeisas skaiciavimai = new Interfeisas() {
			//anonimines klases vidus
			
			//anonimines klases kintamasis
			private int kiekis = 0;
			
			@Override
			public int kiekVienoduElementu(List<Integer> data, int ieskomas) {
				for(int sk : data){					
					if(sk == ieskomas){
						kiekis++;
					}					
				}
				return kiekis;
			}
		};
		
		int kiekis = skaiciavimai.kiekVienoduElementu(data, 6);
		System.out.println(kiekis);
	}
	
	private static void skaicuoti2(List<Integer> data){
		//Sukuriam anonimine klase
		Interfeisas skaiciavimai2 = new Interfeisas() {
			//anonimines klases vidus
			
			//anonimines klases kintamasis
			private int kiekis = 0;
			
			@Override
			public int kiekVienoduElementu(List<Integer> data, int ieskomas) {
				for(int sk : data){					
					if(sk < ieskomas){
						kiekis++;
					}					
				}
				return kiekis;
			}
		};
		
		int kiekis = skaiciavimai2.kiekVienoduElementu(data, 3);
		System.out.println(kiekis);
	}
}
