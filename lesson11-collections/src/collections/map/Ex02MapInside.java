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
		
		// map.put(e) --> lay tung key ben trong map kiem tra
		// lieu co key.hash nao == e.hash( dua vao hashcode)
		// va key.equals(e)  --> ko put vao
		// 
		
		// else --> put vao map

		Employee e4 = new Employee(4, "E5", 400d);
		Employee e5 = new Employee(5, "E5", 500d);
		Employee e6 = new Employee(6, "E6", 600d);

		map.put(e5, Arrays.asList(e4, e5));

		System.out.println("size: " + map.size());
		CollectionsUtils.printf(map);
	}

	private static Map<Employee, List<Employee>> getMap() {
		Employee e1 = new Employee(1, "E1", 100d);
		Employee e2 = new Employee(2, "E2", 200d);
		Employee e3 = new Employee(3, "E3", 300d);
		Employee e4 = new Employee(4, "E4", 400d);
		Employee e5 = new Employee(5, "E5", 500d);

		Map<Employee, List<Employee>> result = new HashMap<>();
		result.put(e4, Arrays.asList(e2));
		result.put(e5, Arrays.asList(e1, e3));
		return result;

	}
}
