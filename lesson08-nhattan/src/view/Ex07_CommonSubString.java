package view;

public class Ex07_CommonSubString {
	public static void main(String[] args) {
		System.out.println("Độ dài lớn nhất của dãy con đúng: " + lenghtTrueSub("aaaaaabbaaaaaaa"));
		System.out.println("Độ dài lớn nhỏ của dãy con đúng: " + lenghtMinTrueSub("bbaaaaaabbbaaaaa"));
	}

	private static int lenghtTrueSub(String s) {
		int n = s.length();
		if (n == 0) {
			return 0;
		}

		int max = 1;
		int count = 1;
		for (int i = 0; i < n - 1; i++) {

			if (s.charAt(i) == s.charAt(i + 1)) {

				count++;
				if (max < count) {
					max = count;
				}
			} else {
				count = 1;
			}

		}
		return max;
	}

	private static int lenghtMinTrueSub(String s) {
		int n = s.length();
		if (n == 0) {
			return 0;
		}

		int min = n;
		int count = 1;
		for (int i = 0; i < n - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
			} else {
				if (min > count) {
					min = count;
				}
				count = 1;
			}
		}
		return min;
	}
}
