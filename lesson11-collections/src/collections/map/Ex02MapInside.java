package collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Employee;
import utils.CollectionsUtils;

public class Ex02MapInside {
	public static void main(String[] args) {
		Map<Employee, List<Employee>> map = getMap();
		
		//map.put(e) --> lấy từng key bên trong map kiểm tra
		// liệu có key.hash nào == e.hash 
		//      và key.equals(e) --> không put vào
		// override hashcode, equals trong class của e
		
		// else --> put vào map

        //e6 --> {e5,e4}
		Employee e4 = new Employee(4, "E4", 400d);
		Employee e5 = new Employee(5, "E5", 500d);
		Employee e6 = new Employee(6, "E6", 600d);
		// map.put(e5, Arrays.asList(e4, e5)); --> duplicate
		map.put(e6, Arrays.asList(e4, e5));
		System.out.println("Map size: " + map.size());
		CollectionsUtils.printf(map);
	}

	private static Map<Employee, List<Employee>> getMap() {
		Employee e1 = new Employee(1, "E1", 100d);
		Employee e2 = new Employee(2, "E2", 200d);
		Employee e3 = new Employee(3, "E3", 300d);
		Employee e4 = new Employee(4, "E4", 400d);
		Employee e5 = new Employee(5, "E5", 500d);

		// e4 --> {e2}
		// e5 --> {e1,e3}
		Map<Employee, List<Employee>> result = new HashMap<>();
		result.put(e4, Arrays.asList(e2));
		result.put(e5, Arrays.asList(e1, e3));
		return result;
	}
}
