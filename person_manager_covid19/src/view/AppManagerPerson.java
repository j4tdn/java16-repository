package view;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import bean.Person;

public class AppManagerPerson {
	
	public static void main(String[] args) {
		List<Person> persons = getPerson();
		System.out.println(getPerson());
		System.out.println("==============");
		
		
		persons
		.stream()
		.filter(o -> o.getSongaycachly() >= 14)
		.sorted((o1,o2) -> o1.getId() - o2.getId())
		.forEach(o -> System.out.println(o));
		
		
		
		persons.removeIf(o -> o.getSongaycachly() >= 14);
		System.out.println(persons);
		
	}
	
		
	
	private static List<Person> getPerson() {
		List<Person> list = new ArrayList<>();
		list.add(new Person(2, "kien", "2022-12-3", "2022-1-3", "123", true, 14));
		list.add(new Person(3, "kien1", "2022-12-3", "2022-1-4", "123", false, 14));
		list.add(new Person(1, "kien2", "2022-12-3", "2022-1-5", "123", true, 14));
		list.add(new Person(2, "kien3", "2022-12-3", "2022-1-6", "123", false, 7));
		list.add(new Person(5, "kien4" ,"2022-12-3", "2022-1-7", "123", false, 6));
		list.add(new Person(0, "kien5" ,"2022-12-3", "2022-1-7", "123", false, 15));
		list.add(new Person(7, "kien7" ,"2022-12-3", "2022-1-7", "a123", false, 6));
		return list;
	}

}
