package collection.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Employee;
import utils.CollectionUtils;

public class Ex02MapInside {
	public static void main(String[] args) {
		Map<Employee, List<Employee>> map = getMap();
		//map.put(e) -> lấy từng key trong map kiểm tra
		//liệu có key.hash nào = e.hash
		// và key.equals(e) --> k put vào
		//else --> put vào map
		Employee e4 = new Employee(4, "E4", 400d);
		Employee e5 = new Employee(5, "E5", 500d);
		Employee e6 = new Employee(6, "E6", 600d);
		map.put(e6, Arrays.asList(e5, e4));
		CollectionUtils.printf(map);
		
	}
	private static Map<Employee, List<Employee>> getMap(){
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
