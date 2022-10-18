package homework;

public class Ex01 {
	public static void main(String[] args) {
		String text = "Xin chào Việt Nam, hello";
		System.out.println("==========In ra từng ký tự trong chuỗi==========");
		printCharacter(text);
		System.out.println("==========In ra từng ký tự trong chuỗi==========");
		printWord(text);
		System.out.println("==========In đảo ngược từng ký tự trong chuỗi==========");
		reserveString(text);
		System.out.println("==========In đảo ngược từng từ trong chuỗi==========");
		reserveWord(text);
	}

	private static void printCharacter(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				System.out.println(str.trim().charAt(i));
			}
		}
	}

	private static void printWord(String s) {
		String[] words = s.split("[,\\s]+");
		for (String word : words) {
			System.out.println(word);
		}
	}

	private static void reserveString(String s) {
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println(sb.toString());
	}
	private static void reserveWord(String s) {
		String[] words = s.split("[,\\s]+");
		for(int i=words.length-1; i >= 0; i--) {
			System.out.println(words[i]);
		}
	}
}
