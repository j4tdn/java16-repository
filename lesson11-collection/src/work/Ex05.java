package work;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Ex05 {
	public static void main(String[] args) {
		HashMap<Integer, Double> map = new HashMap<>();
		map.put(1, (double) 200);
		map.put(2, 500.5);
		map.put(3, 300.5);
		map.put(4, 550.5);
		map.put(5, 700.5);
		map.put(6, 360.5);
		
		map.entrySet().stream().filter(o -> o.getValue() > 500.0).forEach(o -> System.out.println(o));
		
		
		
	}

}
