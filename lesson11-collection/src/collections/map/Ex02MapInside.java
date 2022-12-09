package collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Employee;

public class Ex02MapInside {
	public static void main(String[] args) {
		
	}
	private static Map<Employee,List<Employee>> getMap(){
		
		Employee e1 = new Employee(1,"E1",100d);
		Employee e2 = new Employee(2,"E2",200d);
		Employee e3 = new Employee(3,"E3",300d);
		Employee e4 = new Employee(4,"E4",400d);
		Employee e5 = new Employee(5,"E5",500d);
		Map<Employee, List<Employee>> result = new HashMap<Employee, List<Employee>>();
		
		return result;
		
	}

}
