package immutable;

public class Ex06Split {
	private static void print(String[] tokens) {
		for (String token : tokens) {
			System.out.println(token);
		}
	}
	public static void main(String[] args) {
		String text = "Welcome to class";
		// print words from text, each word on each line
		// regex = regular expression
		String[] tokens = text.split("\\s");
		// "\\s" = blankspace
		System.out.println("tokens length: " + tokens.length);
		print(tokens);
		
		System.out.println("------------------------------------------");
		String line = "Jasmine, 0934853507, 20, vietnamien";
		tokens = line.split(",\\s");
		print(tokens);
		
		System.out.println("------------------------------------------");
		line = "Smith, 1234567890, 19, americain";
		// split by a set of letter[1-N] => []
		tokens = line.trim().split("[,\\s]+");
		// [,\\s] => 1 "," or 1 space " " will be a flag to split
		// [,\\s]+ => several "," or several "," will be a flag to split
		print(tokens);
		
		System.out.println("------------------------------------------");
		// Find valid number from string ab123bx09aa222
		String numberAsString = "ab123bx09aa222";
		tokens = numberAsString.split("[A-Za-z]+");
		print(tokens);
	} 
}
