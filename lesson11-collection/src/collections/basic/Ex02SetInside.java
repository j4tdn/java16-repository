package collections.basic;

import static java.util.Comparator.comparing;
import java.util.Comparator;
import static java.util.Comparator.reverseOrder;

import java.util.LinkedHashSet;
import java.util.Set;
import bean.Employee;
public class Ex02SetInside {

	public static void main(String[] args) {
		
		Comparator<Employee> cmp = 
				comparing(Employee::getName, reverseOrder())
		   .thenComparing(Employee::getSalary);
		
		Set<Employee> company = new LinkedHashSet<>();
		company.add(new Employee(1, "E1", 100d));
		company.add(new Employee(2, "E1", 100d));
		company.add(new Employee(3, "E1", 100d));
		company.add(new Employee(4, "E1", 100d));
		// sort desc by name, asc by salary
		
		printf(company); 
	}
	private static <E> void printf(Set<E> set) {
		for (E e: set) {
			System.out.println(e);
		}
	}
}
