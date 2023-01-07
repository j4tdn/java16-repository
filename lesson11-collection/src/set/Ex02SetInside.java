package set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import bean.Employee;

public class Ex02SetInside {
	public static void main(String[] args) {
		Comparator<Employee> cmp = Comparator.comparing(Employee::getName, Comparator.reverseOrder())
				.thenComparing(Employee::getSalary);

//		Set<Employee> sortedDesName = new TreeSet<Employee>(new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return o1.getName().compareTo(o2.getName()) * (-1);
//			}
//		});		
//		printf(sortedDesName);
//		
//		Set<Employee> sortedAscSalary = new TreeSet<Employee>(new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return o1.getSalary().compareTo(o2.getSalary());
//			}
//		});
//		printf(sortedAscSalary);

		Set<Employee> company = new TreeSet<Employee>(cmp);
		System.out.println("size of company = " + company.size());
		company.add(new Employee(1, "e1", 100d));
		company.add(new Employee(2, "e2", 300d));
		company.add(new Employee(3, "e3", 200d));
		company.add(new Employee(3, "e3", 200d));
		printf(company);

	}

	private static <E> void printf(Set<E> set) {
		for (E e : set) {
			System.out.println(e);
		}
	}
}
