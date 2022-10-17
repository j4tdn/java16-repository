package view;

public class Ex03SpaceLetter {
		  public static void main(String[] args) {
		    String s = "Welcome  to  JAVA10  class";
		    StringBuilder sb = new StringBuilder(s);
		    sb.reverse();
		    String text = sb.toString();
		    text = text.trim().replaceAll("\\s+", " ");
		    System.out.println("Original string: " + s);
		    System.out.println("Reversed string: " + text);
		  }
	
}
