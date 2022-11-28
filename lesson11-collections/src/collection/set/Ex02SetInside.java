package collection.set;

import static java.util.Comparator.*;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import bean.Employee;

public class Ex02SetInside {
	public static void main(String[] args) {
		
		Comparator<Employee> cmp = comparing(Employee:: getName,reverseOrder()).thenComparing(Employee::getSalary); 
		
		Set<Employee> company = new TreeSet<>(cmp);
		company.add(new Employee(1,"e1",100d));
		company.add(new Employee(2,"e2",200d));
		company.add(new Employee(3,"e3",300d));
		company.add(new Employee(4,"e4",200d));
		
		//sort desc by name ,asc by salary
		
		
		
		System.out.println("Size -->" +company.size());
		printf(company);
	}
	private static<E> void printf(Set<E> set) {
		for(E e: set) {
			System.out.println(e);
		}
	}
}
