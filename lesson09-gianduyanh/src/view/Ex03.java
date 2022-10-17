package view;

public class Ex03 {
	public static void main(String[] args) {
		String s = "Welcome    to JAVA10     class";
		s = s.trim().replaceAll("\\s+", " ");
		StringBuilder s1 = new StringBuilder(s);
		s1.reverse().chars().forEach(a -> System.out.print((char) a));
	}

}
