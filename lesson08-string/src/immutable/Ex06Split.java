package immutable;

public class Ex06Split {

	public static void main(String[] args) {
		String text = "Hello everyone";
		
		
		//print words from text, each word on each line
		//regex  stands for regular expression
		String[] tokens = text.split("\\s");
		System.out.println("length: " + tokens.length);
		
		for(String w : tokens)
		{
			System.out.println(w);
		}
		
		System.out.println("=============");
		// split by set of letters
		String line = "Susan, 0923232923, 28, English";
		tokens = line.split(",\\s");
		printf(tokens);
		
        System.out.println("=============");
		// split by set of letters[1-N] ===> []
	    line = "Susan,     0923232923,   28, English";
		tokens = line.trim().split("[,\\s]+");
		printf(tokens);
		
		System.out.println("==============");
		
		//Question: Find valid numbers from string ab123bxx09aa222
		// 123 9 222
		String numberAsString = "ab123bx09aa222";
		tokens = numberAsString.split("[a-zA-Z]+");
		printf(tokens);
		
	}
	
	private static void printf(String[] tokens)
	{
		for(String token: tokens)
		{
			System.out.println("||" + token + "||");
		}
	}
	
}
