package view;

public class Ex01_Reverse {
	public static void main(String[] args) {
		printChar("Find Your One Way");
		System.out.println("=========================");
		printWords("Alone Infection");

		System.out.println("=========================");
		System.out.println(reverseChar("Play the hero"));

		System.out.println("=========================");
		System.out.println(reverseWord("Out of the box"));
	}

	private static void printChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	private static void printWords(String str) {
		String[] words = str.split("[\\s]+");

		for (String word : words) {
			System.out.println(word);
		}
	}

	private static String reverseChar(String str) {
		StringBuilder sB = new StringBuilder(str);
		return sB.reverse().toString();
	}

	private static String reverseWord(String sentence) {
		StringBuilder sB = new StringBuilder(sentence);
		sB.reverse();

		int beginIndex = -1;
		int endIndex = -1;

		for (int i = 0; i < sB.length() - 1; i++) {
			if (Character.isLetter(sB.charAt(i))) {
				beginIndex = i;
				for (int j = i + 1; j < sB.length(); j++) {
					if (Character.isLetter(sB.charAt(j))) {
						endIndex = j;
					} else {
						break;
					}
				}
				StringBuilder word = new StringBuilder(sB.substring(beginIndex, endIndex + 1));
				sB.replace(beginIndex, endIndex + 1, word.reverse().toString());
			}
			i = endIndex + 1;
		}
		return sB.toString();
	}
}
