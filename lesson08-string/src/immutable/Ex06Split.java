package immutable;

public class Ex06Split {
	public static void main(String[] args) {
		String text = "Welcome to class";
		
		//print words from text, each word on each  line
		//regex stands for regular expression
		String[] tokens = text.split("\\s");
		
		System.out.println("length: "+tokens.length);
		for(String token:tokens) {
			System.out.println(token);
		}
		
		System.out.println("===================");
		
		String line = "susan, 0936252199, 28, English";
		tokens = line.split(",\\s");
		printf(tokens);
		
		//split by set of letters[1-N]==>[]
		System.out.println("===================");
		line = "   Smith, 123456789,,19,  Math   ";
		tokens = line.trim().split("[,\\s]+");
		printf(tokens);
		
		//Questoin: Fnd valid numbers from string ab123bx09aa2022
		String numberAsString = "ab123bx09aa2022";
		tokens=numberAsString.split("[a-zA-Z]+");
		printf(tokens);
	}
	
	private static void printf(String[] tokens) {
		System.out.println("length: "+tokens.length);
		for(String token:tokens) {
			System.out.println("||"+token+"||");
		}
	}
}
