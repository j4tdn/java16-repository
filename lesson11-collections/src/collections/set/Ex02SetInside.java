package collections.set;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import bean.Employee;

public class Ex02SetInside {
	public static void main(String[] args) {
		
		Comparator<Employee> cmp =  Comparator.comparing(Employee::getName);
			
		
		
		Set<Employee> company = new TreeSet<>();
		company.add(new Employee(1, "E1", 100d));
		company.add(new Employee(2, "E2", 200d));
		company.add(new Employee(3, "E3", 300d));
		company.add(new Employee(4, "E3", 200d));
		
		printf(company);
	}
	
	private static <E> void printf(Set<E> set) {
		for (E e: set) {
			System.out.println(e);
		}
	}
}
