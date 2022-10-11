package immutable;

public class Ex03Manipulation {
	public static void main(String[] args) {
		String s = "hello all, hope you enjoy";
		String s1 = "hello";
		System.out.println("is s start with s1" + s.startsWith(s1));
		System.out.println("is s end with s1" + s.endsWith(s1));
		
		String s2 ="hi";
		System.out.println("replace " + s.replace(s1, s2));
		
		s = "    hello all , hope you enjoy";
		s = s.trim()
				.replaceAll("\\s+", " ");
		System.out.println("remove redundant space | | |" + s + "| | |");
		System.out.println("substring :" + s.substring(5));
		System.out.println(s.contains("you"));
	}

}
