package view;

import java.util.*;
import java.io.*;

public class Solution {

	static boolean isAnagram(String a, String b) {

		if (a.length() != b.length()) {
			return false;
		}

		String c = a.replace("\\s", "").toLowerCase();
		String d = a.replace("\\s", "").toLowerCase();

		Map<Character, Integer> map1 = new HashMap<>();
		for (Character str : c.toCharArray()) {
			if (map1.containsKey(str)) {
				map1.put(str, map1.get(str) + 1);
			} else {
				map1.put(str, 1);
			}
		}

		for (Character str : d.toCharArray()) {
			if (map1.containsKey(str)) {
				map1.put(str, map1.get(str) - 1);
				if (map1.get(str) == 0) {
					map1.remove(str);
				}
			}
		}

		if (!map1.isEmpty()) {
			return false;
		} else {
			return true;
		}

	}

	public static void main(String[] args) {
		System.out.println("==============");
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		if(ret==true) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
	}
}