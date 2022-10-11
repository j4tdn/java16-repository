package problem07;

public class Ex07TrueSubstring {
	public static void main(String[] args) {
		String str = "aaabaaabbaaaaa";
		System.out.println("String: " + str);
		getLongestTrueSubstring(str);
		getShortestTrueSubstring(str);
	}

	private static void getShortestTrueSubstring(String str) {
		int min = str.length();
		int count = 1;
		int pos = 0;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1))
				count++;
			else {
				if (count < min) {
					min = count;
					pos = i - count;
				}
				count = 1;
			}
		}
		if (count < min) {
			min = count;
			pos = str.length() - min;
		}
		System.out.println(
				"Shortest True Substring: " + min + " \"" + str.substring(pos, pos + min) + "\" [" + pos + "]");
	}

	private static void getLongestTrueSubstring(String str) {
		int max = 0;
		int count = 1;
		int pos = 0;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1))
				count++;
			else {
				if (count > max) {
					max = count;
					pos = i - count;
				}
				count = 1;
			}
		}
		if (count > max) {
			max = count;
			pos = str.length() - max;
		}
		System.out
				.println("Longest True Substring: " + max + " \"" + str.substring(pos, pos + max) + "\" [" + pos + "]");
	}
}
