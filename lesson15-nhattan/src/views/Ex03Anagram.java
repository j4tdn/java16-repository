package views;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Ex03Anagram {
	public static void main(String[] args) {
		System.out.println("Anagram: ");
		System.out.println(anagram("word", "rowd"));
		
		System.out.println("Kí tự có số lần xuất hiện nhiều nhất trong chuỗi");
		System.out.println(mostOccurrencesLetter("aaaabbbb").toString());
	}
	
	private static boolean anagram(String s1, String s2) {
		s1 = s1.trim().replaceAll("\\s", "").toLowerCase();
		s2 = s2.trim().replaceAll("\\s", "").toLowerCase();
		
		if (s1.length() != s2.length()) {
			return false;
		} 
		
		Map<Character, Integer> bucket1 = createFilter(s1);
		Map<Character, Integer> bucket2 = createFilter(s2);
		
		Set<Character> keySet1 = bucket1.keySet();
		
		for (Character letter : keySet1) {
			Integer amount = bucket2.get(letter);
			if (Objects.isNull(amount) || !amount.equals(bucket1.get(letter))) {
				return false;
			}
		}
		
		return true;
		
	}
	
	private static Map<Character, Integer> createFilter(String s) {
		Map<Character, Integer> bucket = new HashMap<>();
		
		int length = s.length();
		for (int i = 0; i < length; i++) {
			char letter = s.charAt(i);
			if (bucket.containsKey(letter)) {
				bucket.replace(letter, bucket.get(letter) + 1);
			} else {
				bucket.put(letter, 1);
			}
		}
		
		return bucket;
	}
	
	private static Set<Character> mostOccurrencesLetter(String s) {
		Map<Character, Integer> bucket = createFilter(s);
		Set<Character> result = new HashSet<>();
		
		int maxOcc = Integer.MIN_VALUE;
		Set<Character> letters = bucket.keySet();
		for (Character letter : letters) {
			int occurrences = bucket.get(letter);
			if (occurrences > maxOcc) {
				maxOcc = occurrences;
			}
		}
		
		for (Character letter : letters) {
			int occurrences = bucket.get(letter);
			if (occurrences == maxOcc) {
				result.add(letter);
			}
		}
		
		return result;
	}
}
