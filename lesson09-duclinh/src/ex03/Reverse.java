package ex03;

public class Reverse {
	public static void main(String[] args) {
		
		String line = "Welcome    to JAVA10 class";
		line = line.trim()
				 .replaceAll("\\s+", " ");
		System.out.println(line);
		printEachWordReverse(line);
		
		System.out.println(reverseWord(line));
		System.out.println("====================");
	}
	private static void printEachWordReverse(String input) {
		char[] ch = input.toCharArray();
		String text = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			text = text + ch[i];
		}
		System.out.println("Reversed string: " + text);
	}
	public static String reverseWord(String str){  
	    String words[]=str.split("\\s");  
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    return reverseWord.trim();  
	}
}
