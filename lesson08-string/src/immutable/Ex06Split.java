package immutable;

public class Ex06Split {
	public static void main(String[] args) {
		
		String text  = "Welcome to class";
		
		//print word from text, each word on each line
		
		String[] tokens = text.split("\\s");
		printf(tokens);
		for(String token: tokens) {
			System.out.println(token);
		}
		
		System.out.println("===================");
		
		  


		String line = "Susan, 0936252119, 28, English";
		tokens = line.split(",\\s");
		printf(tokens);
		System.out.println("===================");
		
		
		line = "  Smith,123455   ,19,Math      ";
		tokens = line.trim().split("[,\\s]+");
		printf(tokens);
		System.out.println("===================");
				
		
	}
	
	 private static void printf(String[] tokens) {
		 for(String token: tokens) {
				System.out.println("||" + token +"||");
			}
		 
	 }

}







