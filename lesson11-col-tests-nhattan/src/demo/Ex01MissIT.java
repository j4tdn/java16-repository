package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Contestant;

public class Ex01MissIT {
	public static void main(String[] args) {		
		List<Integer> line1 = Arrays.asList(2);
		List<Integer> line2 = Arrays.asList(3, 6, 8, 5);
		List<Integer> line3 = Arrays.asList(2, 3, 6);
		List<List<Integer>> lines = new ArrayList<>();
		lines.add(line1);
		lines.add(line2);
		lines.add(line3);
		
		Map<Integer, Contestant> map = new HashMap<>();
		
		for (int i = 1; i < lines.size(); i++) {
			List<Integer> line = lines.get(i);
			for (int j = 1; j < line.size(); j++) {
				int id = line.get(j);
				
			}
		}
	}
}
