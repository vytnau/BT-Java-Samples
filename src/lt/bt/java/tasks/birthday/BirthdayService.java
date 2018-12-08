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

		List<Person> info = new LinkedList<>();
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
		Calendar cal1 = new GregorianCalendar();
		Calendar cal2 = new GregorianCalendar();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Calendar nowDate = Calendar.getInstance();
		Date date = sdf.parse(nowDate.get(Calendar.YEAR) + "" + formatDate(nowDate));
		cal1.setTime(date);

		for (Person person : persons) {
			int year = nowDate.get(Calendar.YEAR);
			if(nowDate.get(Calendar.MONTH) > person.getBirthMonth()){				
				year++;
			}
			
			date = sdf.parse(year + "" + getBirthdayMonthAndDay(person));
			cal2.setTime(date);
			int days = daysBetween(cal1.getTime(), cal2.getTime());

			System.out.print(person.getName() + " " + person.getLastName() + " iki "
					+ (year  - person.getBirthYear()) + " gimtadienio" + " liko dienų " + days);
			System.out.println();
		}
	}

	private int daysBetween(Date d1, Date d2) {				
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
