package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Contestant;

public class Ex01MissIT {
	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> line1 = Arrays.asList(4);
		List<Integer> line2 = Arrays.asList(3, 5, 2, 1);
		List<Integer> line3 = Arrays.asList(3, 12, 5, 2);
		List<Integer> line4 = Arrays.asList(2, 1, 2);
		List<Integer> line5 = Arrays.asList(3, 2, 1, 5);
		list.add(line1);
		list.add(line2);
		list.add(line3);
		list.add(line4);
		list.add(line5);
		System.out.println(list.toString());
		System.out.println();

		Map<Integer, Contestant> map = new HashMap<>();

		for (int i = 1; i < list.size(); i++) {
			for (int j = 1; j < list.get(i).size(); j++) {
				if (!map.containsKey(list.get(i).get(j))) {
					Contestant tmp = new Contestant(list.get(i).get(j));
					tmp.pushScore(4 - j);
					map.put(list.get(i).get(j), tmp);
				} else {
					Contestant tmp = map.get(list.get(i).get(j));
					tmp.pushScore(4 - j);
					map.replace(list.get(i).get(j), tmp);
				}
			}
		}
	}

	public static Map<Integer, Contestant> removeLowScore(Map<Integer, Contestant> map) {
		int score = 0;
		for (Contestant a : map.values()) {
			if (a.getScore() > score)
				score = a.getScore();
		}
		Map<Integer, Contestant> tmp = new HashMap<>();

		for (Contestant a : map.values()) {
			if (a.getScore() == score)
				tmp.put(a.getId(), a);
		}
		return tmp;
	}

}
