package view;

public class Ex05 {
	public static void main(String[] args) {
		
		String text1="ADFFCCASDFG";
		String text2="QWERYNASDFOP";

		System.out.println(commonString(text1, text2));
	}

	private static String commonString(String a, String b) {
		String string = "";
		for (int i = 0; i < a.length(); i++) {
			for (int j = i; j < a.length(); j++) {
				if (b.contains(a.substring(i, j + 1))) {
					if (string.length() < a.substring(i, j + 1).length())
						string = a.substring(i, j + 1);
				}
			}
		}
		return string;
	}
}