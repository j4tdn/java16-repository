package collection.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import bean.Employee;

public class Ex02SetInSide {
	public static void main(String[] args) {
		Comparator<Employee> cmp1 = Comparator.comparing(Employee::getName, Comparator.reverseOrder()).thenComparing(Employee::getSalary);
		Comparator<Employee> cmp = new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.getName().compareTo(o2.getName()) < 0) {
					return 1;
				}
				if(o1.getName().compareTo(o2.getName()) > 0) {
					return -1;
				}
				
				
				return o1.getSalary().compareTo(o2.getSalary());
			}
		};
		Set<Employee> company = new TreeSet<>(cmp);
		company.add(new Employee(1, "e1", 100.d));
		company.add(new Employee(2, "e4", 500.d));
		company.add(new Employee(3, "e3", 60.d));
		company.add(new Employee(4, "e3", 300.d));
		System.out.println(company);
		company.stream().sorted((o1,o2) -> o1.getName().compareTo(o2.getName())).forEach(o -> System.out.println(o));;
		
		
		System.out.println("size : " + company.size());
	}

}
