package collection.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Employee;
import utils.CollectionUtils;

public class Ex02MapInside {

	public static void main(String[] args) {
		Map<Employee, List<Employee>> map = getMap();
		
		// map.put(e) --> Lấy từng key trong map kiểm tra 
		// if   có key.hash nào == e.hash
		// 	 	và ket.equals(e)  ---> không đưa vào

		// else --> put vào map
		
		Employee e4 = new Employee(4, "E4", 400d);
		Employee e5 = new Employee(5, "E5", 500d);
		Employee e6 = new Employee(6, "E6", 600d);
		// e6 --> e5, e4
		map.put(e5, new ArrayList<Employee>(Arrays.asList(e4, e5)));
		System.out.println("size: " + map.size());
		
		CollectionUtils.printf("", map);

	}
	
	private static Map<Employee, List<Employee>> getMap(){
		Employee e1 = new Employee(1, "E1", 100d);
		Employee e2 = new Employee(2, "E2", 200d);
		Employee e3 = new Employee(3, "E3", 300d);
		Employee e4 = new Employee(4, "E4", 400d);
		Employee e5 = new Employee(5, "E5", 500d);
		// e4 --> {e3}
		// e5 --> {e1, e2}
		Map<Employee, List<Employee>> results = new HashMap<>();
		results.put(e4,new ArrayList<Employee>(Arrays.asList(e2)));
		results.put(e5, new ArrayList<Employee>(Arrays.asList(e1, e3)));
		
		return results;
	}

}
