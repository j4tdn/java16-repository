package problem05;

import java.util.Vector;

public class Ex05LongestCommonSubstring {
	public static void main(String[] args) {
		String s1 = "ABCEDEABC";
		String s2 = "ABCEDCBBCKDEABC";
		System.out.println("Longest Common Substring of: ");
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		Vector<String> result = getLongestCommonSubstring(s1, s2);
		System.out.println("Result:");
		for (String s : result)
			System.out.println(s);
	}

	// DYNAMIC APPROACH
	private static Vector<String> getLongestCommonSubstring(String s1, String s2) {
		Vector<String> result = new Vector<>();
		int[][] table = new int[s1.length() + 1][s2.length() + 1];
		int max = 0;
		for (int i = 0; i <= s1.length(); i++)
			for (int j = 0; j <= s2.length(); j++) {
				if (i == 0 || j == 0)
					table[i][j] = 0;
				else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					table[i][j] = table[i - 1][j - 1] + 1;
					if (max < table[i][j])
						max = table[i][j];
				}
			}
		// DISTINCT ELEMENT
		for (int i = 1; i <= s1.length(); i++)
			for (int j = 1; j <= s2.length(); j++)
				if (table[i][j] == max) {
					String temp = s1.substring(i - max, i);
					boolean checkExist = true;
					for (String s : result)
						if (s.equals(temp)) {
							checkExist = false;
							break;
						}
					if (checkExist)
						result.add(temp);
				}
		return result;
	}
}
