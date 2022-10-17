package view;

public class Ex03RevertString {
	public static void main(String[] args) {
		String input = "Welcome to JAVA10 class";
		revertString(input);
	}

	private static String revertString(String input) {
		String output = input.trim().replaceAll("\\s+", " ");
		System.out.println(output);
		
		String[] words = output.split(" ");
		output = "";
		for(int i=0; i < words.length; i++) {
			String word = words[i];
			
			String revertWord = "";
			for(int j=word.length() - 1; j >= 0; j--) {
				revertWord += word.charAt(j);
			}
			output+=revertWord + " ";
		}
		System.out.println("Chuỗi sau khi đảo là: ");
		System.out.println(output);
		return output;
	}

}
