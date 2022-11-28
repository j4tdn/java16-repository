package collections.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import bean.Employee;

public class Ex02SetInSide {

	public static void main(String[] args) {

//		Comparator<Employee> cmp = new Comparator<Employee>() {	
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				// TODO Auto-generated method stub
//				int sortByName = o1.getName().compareTo(o2.getName());
//				if( sortByName < 0)
//				{
//					return 1;
//				}
//				if(sortByName > 0)
//				{
//					return -1;
//				}
//				return o1.getSalary().compareTo(o2.getSalary());
//			}
//		};
       //Comparator<Employee> cmp = comparing(Employee::getName, reverseOrder());
		
		Set<Employee> company = new TreeSet<>();
		company.add(new Employee(1, "E1" , 100d));
		company.add(new Employee(2, "E2" , 200d));
		company.add(new Employee(3, "E3" , 300d));
		company.add(new Employee(4, "E4" , 400d));
		
	
		printf(company);
	
	}
	private static <E> void printf(Set<E> set) {
		for (E e : set) {
			System.out.println(e);
		}
	}
}
