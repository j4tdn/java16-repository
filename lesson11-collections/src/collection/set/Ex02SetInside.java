package collection.set;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import static utils.CollectionUtils.*;
import bean.Employee;

public class Ex02SetInside {

	public static void main(String[] args) {
		Set<Employee> company = new LinkedHashSet<>();
		company.add(new Employee(1, "E1", 100d));
		company.add(new Employee(2, "E2", 200d));
		company.add(new Employee(3, "E3", 300d));
		
		company.add(new Employee(3, "E3", 300d));

		printf("set", company);
		
		Set<Employee> textSort = new TreeSet<Employee>(Comparator.comparing(Employee::getId, Comparator.reverseOrder()));
		//textSort.addAll(company);
		textSort.add(new Employee(1, "E1", 100d));
		textSort.add(new Employee(2, "E2", 200d));
		textSort.add(new Employee(3, "E3", 300d));
		printf("set sorting", textSort);
		
	}

}
