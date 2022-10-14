package immutable;

public class Ex06Split {
	public static void main(String[] args) {
		String text = "welcome to class";
		
		//print words from text, each word on each line
		// regex stands for regular expression
		String[] tokens = text.split("\\s");
		System.out.println("length: " + tokens.length);
		printf(tokens);
		
		
		System.out.println("==========================");
		String line = "Susan, 09050423, 28, English";
		tokens = line.split(",\\s");
		printf(tokens);
		
		System.out.println("==========================");
		//split by set of letters[1-n] ==> []
		line = "Smith, 09123423,    19,Math";
		tokens = line.split("[,\\s]+");
		printf(tokens);
		
		System.out.println("==========================");
		//Question: Find valid numbers from string ab123bx09aa222
		// 123 9 222
		String numberAsString = "ab123bx09aa2022";
		tokens=numberAsString.split("[a-zA-Z]+");
		printf(tokens);
	}
	
	private static void printf(String [] tokens) {
		for(String token:tokens) {
			System.out.println("||" + token + "||");
		}
	}
}
