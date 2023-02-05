package exam;

import java.util.HashMap;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		String sequences = "aaaababbbddc";
		countCharacter(sequences);
	}
	
	public static void countCharacter(String str) {
		char[] arr = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (char element : arr) {
			if (map.containsKey(element)) {
				map.put(element, map.get(element) + 1);
			} else {
				map.put(element, 1);
			}
		}
		int mostAppearances = 0;
		Set<Character> set = map.keySet();
		for(char element : set) {
			if(map.get(element) > mostAppearances) {
				mostAppearances = map.get(element);
			}
		}
		
		for(char element : map.keySet()) {
			if(map.get(element).equals(mostAppearances)) {
				System.out.println(element+" ");
			}
		}
	}
}
