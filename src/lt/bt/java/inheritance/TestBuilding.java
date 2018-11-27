package lt.bt.java.inheritance;

import lt.bt.java.inheritance.Data.Hospital;
import lt.bt.java.inheritance.Data.House;
import lt.bt.java.inheritance.Data2.Buildings;

//Vykdoma klase
public class TestBuilding {

	public static void main(String[] args){
		Buildings house = new House("Pilies g.");
		//masyvas visu vaikiniu elementu
		Buildings[] array = {new House(), new Hospital()};
		System.out.println(house.getAddress());
		System.out.println(house.toString());
		
		//iteravimas per masyva
		for(int i = 0; i < array.length; i++){			
			Buildings b = array[i];
			//tikrinimas ar musu objektas yra House tipo
			if ( b instanceof House){
				//kastinam objekta (caste) i house tipa
				//kad pasiektume funkcionaluma is hose klases
				House h = (House)b;
				h.onlyHouseHas();
				h.print();
			}
			//tikrinimas ar musu objektas yra Hospital tipo
			else if ( b instanceof Hospital){
				//kastinam objekta (caste) i hospital tipa
				//kad pasiektume funkcionaluma is hosptial klases
				Hospital hh = (Hospital) b;
				hh.onlyHospitalHas();
				hh.print();
			}			
		}
		
//		house.print();
//		((Buildings)house).print();
	}
}
