package mod3_week2_hw3;
import java.util.Calendar;

public class Person implements PersonInterface {
	
	String personName;
	int personAge;
	
	Calendar calendar = Calendar.getInstance();
	
	
	public Person(String name, int age) {
		personName = name;
		personAge = age;
		System.out.println("Birthyear: " + calculate(age));
		System.out.println(printMsg(personName));
	}

	@Override
	public double calculate(int num) {
		return calendar.get(Calendar.YEAR) - num;
	}

	@Override
	public String printMsg(String personName) {
		return "Hello, " + personName + "! ";
	}

}