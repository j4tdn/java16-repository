package colection.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Employee;
import utils.ColectionUtills;

public class Ex02MapInside {

	public static void main(String[] args) {
		Map<Employee, List<Employee>> map = getMap();
		Employee e4 = new Employee(4, "E4", 71.1);
		Employee e5 = new Employee(5, "E5", 41.1);
		Employee e6 = new Employee(6, "E6", 79.1);
		map.put(e6, Arrays.asList(e5, e6));
		
		// map.put(e) --> lấy từng key bên trong map kiểm tra liệu 
		// key.hash nào == e.hash nào và key.equals(e) --> không push vào
		// else --> push vào
		// 
		System.out.println(map.size());
		ColectionUtills.printf(map);
	}
	
	private static Map<Employee, List<Employee>> getMap(){
		Employee e1 = new Employee(1, "E1", 101.1);
		Employee e2 = new Employee(2, "E2", 201.1);
		Employee e3 = new Employee(4, "E5", 121.1);
		Employee e4 = new Employee(3, "E7", 71.1);
		Employee e5 = new Employee(5, "E7", 71.1);
		
		Map<Employee, List<Employee>> result = new HashMap<>();
		result.put(e5, Arrays.asList(e2,e1));
		result.put(e4, Arrays.asList(e3));
		return result;
	}
}
