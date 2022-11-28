package collection.set;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.*;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import bean.Employee;

public class Ex02SetInside {
	public static void main(String[] args) {
		
		Comparator<Employee> cpm = comparing(Employee::getName, reverseOrder()).thenComparing(Employee::getSalary);
				
				/* new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if (o2.getName().compareTo(o1.getName()) > 0) {
					return 1;
				}
				else {
					return -1;
				}
			}
		}; */
			
			
		Set<Employee> company = new TreeSet<>(cpm);
		company.add(new Employee(1, "E1", 100d));
		company.add(new Employee(2, "E2", 200d));
		company.add(new Employee(3, "E3", 300d));
		
		company.add(new Employee(3, "E3", 200d));

		System.out.println("size --> " + company.size());
		printf(company);
	}
	
	private static <E> void printf(Set<E> text) {
		for (E s: text) {
			System.out.println(s);
		}
	}
}
