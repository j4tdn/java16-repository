package collections.set;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;

import bean.Employee;

public class Ex02SetInside {
	public static void main(String[] args) {
		Comparator<Employee> cmp = Comparator.comparing(Employee::getName, Comparator.reverseOrder())
				.thenComparing(Employee::getSalary);
		Set<Employee> company = new TreeSet<>(cmp);
		company.add(new Employee(1, "E1", 100d));
		company.add(new Employee(2, "E2", 200d));
		company.add(new Employee(3, "E3", 300d));
		company.add(new Employee(4, "E4", 300d));

		System.out.println("size: " + company.size());
		printf(company);

	}

	private static <E> void printf(Set<E> set) {
		for (E e : set) {
			System.out.println(e);
		}
	}

}
