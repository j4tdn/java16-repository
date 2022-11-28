package collections.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import bean.Employee;

public class Ex02SetInside {
	public static void main(String[] args) {
		/*
		Set<Employee> company = new TreeSet<>(new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				int sortByName = o1.getName().compareTo(o2.getName());
				if (sortByName < 0) {
					return 1;
				}
				if (sortByName > 0) {
					return 0;
				}
				return o2.getSalary().compareTo(o1.getSalary());
			}
		});
		*/
		Comparator<Employee> cmp = Comparator.comparing(Employee::getName, Comparator.reverseOrder())
				.thenComparing(Employee::getSalary);
		
		Set<Employee> company = new TreeSet<>(cmp);
		
		company.add(new Employee(1, "E1", 100d));
		company.add(new Employee(2, "E2", 200d));
		company.add(new Employee(3, "E3", 300d));
		
		company.add(new Employee(3, "E3", 300d));
		
		// sort desc by name, asc by salary
		System.out.println("size: " + company.size());
	}
}
