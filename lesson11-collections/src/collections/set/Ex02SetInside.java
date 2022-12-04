package collections.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import bean.Employee;

public class Ex02SetInside {
	public static void main(String[] args) {
		Set<Employee> company = new TreeSet<>(
				Comparator.comparing(Employee::getName, Comparator.reverseOrder()).thenComparing(Employee::getSalary));
//		Set<Employee> company = new TreeSet<>((e1, e2) -> {
//			if (e2.getName().compareTo(e1.getName()) == 0)
//				return e1.getSalary().compareTo(e2.getSalary());
//			return e2.getName().compareTo(e1.getName());
//		});
		company.add(new Employee(1, "E1", 100d));
		company.add(new Employee(2, "E2", 200d));
		company.add(new Employee(3, "E3", 300d));
		company.add(new Employee(4, "E3", 200d));

		System.out.println("Size --> " + company.size());
		printf(company);
	}

	private static <E> void printf(Set<E> set) {
		for (E e : set)
			System.out.println(e);
	}
}
