package lt.bt.java.tasks.birthday;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		BirthdayService birthDayService = new BirthdayService();
		List<Person> persons = birthDayService.getPersons();
		birthDayService.calculateDate(persons);
	}
}
