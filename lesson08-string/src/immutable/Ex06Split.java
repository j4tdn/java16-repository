package immutable;

public class Ex06Split {
	public static void main(String[] args) {
		String text = "welcome to class";
		
		// print words from text, each word on each line
		// regex stands for regular expression
		 String[] tokens = text.split("\\s");
		 printf(tokens);
		 
		 System.out.println("====================");
		 
		 String line = "Susan, 0981237612, 23, English";
		 tokens = line.split(",\\s");
		 printf(tokens);
		 
		 System.out.println("===================="); 
		 
		 // split by set of letters
		 line = "Nasus,, 0981237612  , 21, Math";
		 tokens = line.trim().split("[,\\s]+");
		 printf(tokens);
		 
		 System.out.println("====================");
		 
		 // Question: Find valid number from string ab123bx09aa222
		 String numberAsString = "89ab123bx09aa222";
		 tokens = numberAsString.trim().split("[a-zA-Z]+");
		 printf(tokens);
	}
	
	private static void printf(String[] tokens) {
		for(String token:tokens) {
			System.out.println("||" + token + "||");
		}
	}
}
