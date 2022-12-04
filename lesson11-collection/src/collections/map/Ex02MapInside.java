package collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import bean.Employee;
import utils.CollectionUtils;

public class Ex02MapInside {
	public static void main(String[] args) {
		Map<Employee, List<Employee>> map = getMap();
		//e6 --> e5,e4
		Employee e4 = new Employee(4 , "E4" , 400d);
		Employee e5 = new Employee(5 , "E5" , 500d);
		Employee e6 = new Employee(6 , "E6" , 600d);
		map.put(e6, Arrays.asList(e4,e5));
		
		System.out.println("size: " + map.size());
		CollectionUtils.printf(map);
	}
	
	private static Map<Employee, List<Employee>> getMap(){
		Employee e1 = new Employee(1 , "E1" , 100d);
		Employee e2 = new Employee(2 , "E2" , 200d);
		Employee e3 = new Employee(3 , "E3" , 300d);
		Employee e4 = new Employee(4 , "E4" , 400d);
		Employee e5 = new Employee(5 , "E5" , 500d);
		
		// e4 --> {e2}
		// e5 --> {e1 , e3}
		Map<Employee , List<Employee>> result = new HashMap<>();
		result.put(e4, Arrays.asList(e2));
		result.put(e5, Arrays.asList(e1,e3));
		return result;
		
	}
}
