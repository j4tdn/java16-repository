package immutable;

public class Ex05Comparison {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "welcome";
		
		// true if equal
		// false if not equal
		System.out.println("Equals: " +s1.equals(s2));
		
		// negative: s1 < s2
		// zero: s1 = s2
		// positive: s1 > s2
		System.out.println("Compare to: "+ s1.compareTo(s2));
		// final variable --> final stack
		// final class - final at heap -> immutable type
	}

}
