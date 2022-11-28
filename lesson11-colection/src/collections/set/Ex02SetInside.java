package collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

import bean.Employee;

public class Ex02SetInside {
	public static void main(String[] args) {
		Set<Employee> company = new LinkedHashSet<>();
		company.add(new Employee(1, "E1", 100d));
		company.add(new Employee(2, "E2", 200d));
		company.add(new Employee(3, "E3", 300d));
		company.add(new Employee(4, "E3", 300d));
		
		System.out.println(company.size());
	}

}
