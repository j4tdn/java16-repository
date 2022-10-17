package Ex03;

public class App {
	public static void main(String[] args) {
		String text = "Welcome       to JAVA10  class";
		System.out.print(converse(text));
	}

	private static String converse(String text) {
		String result = " ";
		text = text.replaceAll("[\\s]+", " ");
		String[] string = text.split(" ");
		for (int i = 0; i < string.length; i++) {
			StringBuffer reverseWord = new StringBuffer(string[i]);
			result = result + reverseWord.reverse().toString() + " ";
		}
		return result;
	}
}


