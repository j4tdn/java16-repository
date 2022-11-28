package Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class findMissIT {
	public static void main(String[] args) {
		int numberOfJudges = 4;
		String jud1_string = "3 5 2 1";
		String jud2_string = "3 12 5 2";
		String jud3_string = "2 1 2";
		String jud4_string = "3 2 1 5";
		List<Integer> jud1 = toIntegerList(jud1_string.split(" "));
		List<Integer> jud2 = toIntegerList(jud2_string.split(" "));
		List<Integer> jud3 = toIntegerList(jud3_string.split(" "));
		List<Integer> jud4 = toIntegerList(jud4_string.split(" "));
		List<List<Integer>> jud = Arrays.asList(jud1, jud2, jud3, jud4);

		Map<Integer, Contestant> map = new HashMap<>();
		for (int i = 0; i < numberOfJudges; i++) {
			List<Integer> judgeScore = jud.get(i);
			for (int j = 1; j <= judgeScore.get(0); j++) {
				int id = judgeScore.get(j);
				if (!map.containsKey(map.containsKey(id))) {
					if (j == 1)
						map.putIfAbsent(id, new Contestant(id, 1, 0, 0, 3));
					if (j == 2)
						map.putIfAbsent(id, new Contestant(id, 0, 1, 0, 2));
					if (j == 3)
						map.putIfAbsent(id, new Contestant(id, 0, 0, 1, 1));
				} else {
					Contestant contestant = map.get(id);
					if (j == 1)
						map.put(id, new Contestant(id, 1 + contestant.getFirstTimes(), contestant.getSecondTimes(),
								contestant.getThirdTimes(), 3 + contestant.getScore()));
					if (j == 2)
						map.put(id, new Contestant(id, contestant.getFirstTimes(), 1 + contestant.getSecondTimes(),
								contestant.getThirdTimes(), 2 + contestant.getScore()));
					if (j == 3)
						map.put(id, new Contestant(id, contestant.getFirstTimes(), contestant.getSecondTimes(),
								1 + contestant.getThirdTimes(), 1 + contestant.getScore()));
				}
			}
		}
		sortMap(map);
		printf(map);
	}

	private static List<Integer> toIntegerList(String[] input) {
		List<Integer> list = new ArrayList<Integer>();
		for (String s : input) {
			int number = Integer.parseInt(s);
			list.add(number);
		}
		return list;
	}

	private static Map<Integer, Contestant> sortMap(Map<Integer, Contestant> map) {
		Set<Entry<Integer, Contestant>> set = map.entrySet();
		List<Entry<Integer, Contestant>> list = new LinkedList<>(set);
		list.sort(Entry.comparingByValue());
		Map<Integer, Contestant> sortedMap = new LinkedHashMap<>();
		for (Entry<Integer, Contestant> entry : list)
			sortedMap.put(entry.getKey(), entry.getValue());
		return sortedMap;
	}

	public static <K, V> void printf(Map<K, V> map) {
		Set<Entry<K, V>> entries = map.entrySet();
		for (Entry<K, V> entry : entries) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
	}

//	private static Map<Integer, String> sort(Map<Integer, String> map) {
//		Set<Entry<Integer, String>> set = map.entrySet();
//		List<Entry<Integer, String>> list = new LinkedList<>(set);
//		list.sort((e1, e2) -> e1.getValue().compareTo(e2.getValue()));
//		Map<Integer, String> sortedMap = new LinkedHashMap<>();
//		for (Entry<Integer, String> entry : list)
//			sortedMap.put(entry.getKey(), entry.getValue());
//		return sortedMap;
//	}
}
