package view;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Ex02 {
	public static void main(String[] args) {
		String a1 = "aaaababbbddc";
		Map<String, Integer> input1Map = toMap(a1.split(""));
		print(input1Map, wordRepeat(input1Map));
	}
	private static Map<String, Integer> toMap(String[] a1){
		Map<String, Integer> result = new HashMap<>();
		for (String i : a1) {
			if (result.containsKey(i)) {
				result.put(i, result.get(i) + 1);
			} else {
				result.put(i, 1);
			}
		}
		return result;
		}
	private static int wordRepeat(Map<String,Integer> source)
	{
		int max = 0;
		for (Entry<String, Integer> entry : source.entrySet()) {
			max = Math.max(max, entry.getValue());
		}
		return max;
	}
	private static void print (Map<String, Integer> source, int max){
		String[] result = source.entrySet().stream()
												.filter(t -> t.getValue() == max)
												.map(t -> t.getKey())
												.toArray(String[]::new);
		System.out.println(String.join(" , ", result));
	}

}
