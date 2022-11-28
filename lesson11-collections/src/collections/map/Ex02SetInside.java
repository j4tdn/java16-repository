package collections.map;

import static java.util.Comparator.*;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import bean.Employee;

public class Ex02SetInside {
	public static void main(String[] args) {
		/*Comparator<Employee> cmp = new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				if(e1.getName().compareTo(e2.getName())<0) {
					return 1;
				}
				if(e1.getName().compareTo(e2.getName())>0) {
					return -1;
				}
				return e1.getSalary().compareTo(e2.getSalary());
			}
		};*/
		//sort desc name, asc salary
		
		Comparator<Employee> cmp = comparing(Employee::getName,reverseOrder())
				.thenComparing(Employee::getSalary);
		
		Set<Employee> company = new TreeSet<>(cmp);
		company.add(new Employee(1,"E1",100d));
		company.add(new Employee(2,"E2",200d));
		company.add(new Employee(3,"E3",300d));
		
		company.add(new Employee(4,"E3",200d));
		
		//sort desc name, asc salary
		
		printf(company);
		
		
	}
	private static<E> void printf(Set<E> set) {
		for(E e: set) {
			System.out.println(e);
		}
	}
	

}
