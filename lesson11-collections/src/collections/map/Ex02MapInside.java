package collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Employee;
import utils.collectionUtils;

public class Ex02MapInside {
	public static void main(String[] args) {
		Map<Employee, List<Employee>> map = getMap();

		// map.put(e) lấy từng key bên trong map kiểm tra liệu có key.hash nào
		// == e.hash và key.equals(e)-->không put vào
		//override hashcode, equals trong class của e để Id của e5 ở trên = ở dưới-->hash code - nhau
		//để dễ phân biệt e5 trên và e5 dưới

		// else --> put vào map

		// e6 quản lý {e5,e4}
		Employee e4 = new Employee(4, "E4", 400d);
		Employee e5 = new Employee(5, "E5", 500d);
		Employee e6 = new Employee(6, "E6", 600d);

		map.put(e6, Arrays.asList(e4, e5));
        //khi put 1 key e5 vô map sẽ kiểm tra xem có key nào trong map
		//mà có hash = hash củả e5 không? và có key nào equals với e5
		//thì không put vô
		System.out.println("size--> " + map.size());
		collectionUtils.printf(map);

	}
//Map<Employee, Set>>: dùng set vì nó quản lý 1 danh sách nhây viên,
	// các nhân viên không được trùng nhau
	private static Map<Employee, List<Employee>> getMap() {
		Employee e1 = new Employee(1, "E1", 100d);
		Employee e2 = new Employee(2, "E2", 200d);
		Employee e3 = new Employee(3, "E3", 300d);
		Employee e4 = new Employee(4, "E4", 400d);
		Employee e5 = new Employee(5, "E5", 500d);

		// e4 quản lý {e2}
		// e5 quản lý {e1,e3}
		Map<Employee, List<Employee>> result = new HashMap<>();
		result.put(e4, Arrays.asList(e2));//Arrays.asList : trả về 1 list bị cố định size
		result.put(e5, Arrays.asList(e1, e3));
		return result;
	}

}
