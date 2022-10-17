package view;

public class Ex01 {
	public static void main(String[] args) {
		String text = "Huỳnh Tấn Phát";
		printChar(text);
		System.out.println("=========");
		printWord(text);
		System.out.println("=========");
		reverseChar(text);
		System.out.println("=========");
		reverseWord(text);
	}

	private static void printChar(String text) {
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) != ' ') {
				System.out.println(text.charAt(i));
			}
		}
	}

	private static void printWord(String text) {
		String[] arrs = text.split("[\\s]+");
		for (String arr : arrs) {
			System.out.println(arr);
		}
	}

	private static void reverseChar(String text) {
		StringBuffer rev = new StringBuffer(text);
		rev.reverse();
		System.out.println(rev.toString());
	}

	private static void reverseWord(String text) {
		String[] arrs = text.split("[\\s]+");
		for (int i = arrs.length - 1; i >= 0; i--) {
			System.out.println(arrs[i] + "");
		}
	}
}
