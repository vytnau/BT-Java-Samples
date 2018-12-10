package lt.bt.java.tasks.birthday;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BirthdayService {
	public List<Person> getPersons() throws FileNotFoundException {
		List<Person> persons = new LinkedList<>();
		String filePath = "res\\txt\\task\\Birthday.txt";
		File file = new File(filePath);
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNext()){
			Person personInfo = new Person();
			personInfo.setName(scanner.next());
			personInfo.setLastName(scanner.next());
			personInfo.setBirthYear(scanner.nextInt());
			personInfo.setBirthMonth(scanner.nextInt());
			personInfo.setBirthDay(scanner.nextInt());

			persons.add(personInfo);
		}
		scanner.close();

		return persons;
	}

	public void calculateDate(List<Person> persons) throws ParseException {
		Calendar siandieninisKalendorius = new GregorianCalendar();
		Calendar gimtadininkoKalendorius = new GregorianCalendar();		
		SimpleDateFormat datosFormateris = new SimpleDateFormat("yyyyMMdd");
		Calendar dabartineData = Calendar.getInstance();
		//sukuriam Date objekta, naudodami date formateri. Jam paduodami string tipo data suformatuota pagal formata yyyyMMdd
		Date laikinasDateObj = datosFormateris.parse(dabartineData.get(Calendar.YEAR) + "" + formatDate(dabartineData));
		siandieninisKalendorius.setTime(laikinasDateObj);

		//suskaiciuojam zmoniu dienas. 
		for (Person person : persons) {
			//pasiimam dabartinius metus
			int year = dabartineData.get(Calendar.YEAR);
			//tikrinam ar dabartines menesis daugiau uz zmogaus gimtadienio menesi
			if(dabartineData.get(Calendar.MONTH) > person.getBirthMonth()){
				//jeigu daugiau, gimtadienis kitais metais
				year++;
			}
			
			//sukuriam person gimtadienio date objekta
			laikinasDateObj = datosFormateris.parse(year + "" + getBirthdayMonthAndDay(person));
			gimtadininkoKalendorius.setTime(laikinasDateObj);
			//suskaiciuojam kiek dienu liko iki gimtadienio
			int days = daysBetween(siandieninisKalendorius.getTime(), gimtadininkoKalendorius.getTime());

			//spausdinam rezultatus
			System.out.print(person.getName() + " " + person.getLastName() + " iki "
					+ (year  - person.getBirthYear()) + " gimtadienio" + " liko dienų " + days);
			System.out.println();
		}
	}

	private int daysBetween(Date d1, Date d2) {
		//datas konvertuojam i milisekundes, jas atimam ir konvertuojam i dienas
		return (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
	}

	private String formatDate(Calendar cal) {
		String date = "";
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		if (month < 10) {
			date += "0" + String.valueOf(month);
		} else {
			date += String.valueOf(month);
		}

		if (day < 10) {
			date += "0" + String.valueOf(day);
		} else {
			date += String.valueOf(day);
		}

		return date;
	}
	
	private String getBirthdayMonthAndDay(Person person){
		String date = "";
		int birthMonth = person.getBirthMonth();
		int birthDay = person.getBirthDay();
		if(birthMonth < 10){
			date += "0" + String.valueOf(birthMonth);
		} else {
			date += String.valueOf(birthMonth);
		}
		
		if(birthDay < 10){
			date += "0" + String.valueOf(birthDay);
		} else {
			date += String.valueOf(birthDay);
		}
		
		return date;
	}

}
