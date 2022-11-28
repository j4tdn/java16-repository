package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import bean.Contestants;

public class Ex01MissIT {
	public static void main(String[] args) {
		
		List<Integer> line1 = Arrays.asList(2);
		List<Integer> line2 = Arrays.asList(3,3,5,2);
		List<Integer> line3 = Arrays.asList(2,2,5);
		
		List<List<Integer>> lines = new ArrayList<>();
		lines.add(line1);
		lines.add(line2);
		lines.add(line3);
		
		Map<Integer, Contestants> map = new TreeMap<>();
	}
	
	
}
