package view;

public class Ex02FindNumber {
	public static void main(String[] args) {
		String numberAsString = "abc123bx09aa222";
		String[] tokens = numberAsString.split("\\s");
		tokens = numberAsString.split("[a-zA-Z]+");

		prinf(tokens);
	}

	private static void prinf(String[] tokens) {
		for (String token : tokens) {
			System.out.println(token);
		}
	}
}
