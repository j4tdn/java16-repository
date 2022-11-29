package view;



import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


import bean.Examiner;
import bean.Miss;

public class Ex01 {
	public static void main(String[] args) {
		int max = 8;
		
		Map<Examiner, Miss> map = new HashMap<>();
		map.put(new Examiner(3, 3), new Miss("1", 6, 2, 1, 3));
		map.put(new Examiner(3, 3), new Miss("2", 8, 3, 2, 1));
		map.put(new Examiner(3, 3), new Miss("3", 4, 0, 3, 1));
		map.put(new Examiner(3, 3), new Miss("4", 6, 1, 1, 3));
		
		map.entrySet().stream().sorted((o1,o2) -> o2.getValue().getPoint() - o1.getValue().getPoint()).forEach(o -> System.out.println(o));
		
		System.out.println("========");
		
		map.entrySet().stream().filter(o1 -> o1.getValue().getPoint() == max).forEach(o -> System.out.println(o));;
		
		
		
	}
	


}
