package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import bean.MissIT;

public class Ex01Demo {
	public static void main(String[] args) {
		List<List<Integer>> listItem = new ArrayList<>();
		List<Integer> line1 = Arrays.asList(2);
		List<Integer> line2 = Arrays.asList(3, 6, 8, 5);
		List<Integer> line3 = Arrays.asList(2, 3, 6);

		listItem.add(line1);
		listItem.add(line2);
		listItem.add(line3);

		Map<Integer, List<MissIT>> items = new TreeMap<>();

		for (int i = 0; i < listItem.size(); i++) {
			for (int j = 0; j < listItem.get(i).size(); j++) {
				
			}
		}
	}
}
