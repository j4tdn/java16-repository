package immutable;

public class Ex05Comparation {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "cwe";
		
		// true if equals
		// false if not equals
		System.out.println("Equals: " + s1.equals(s2));
		
		// negative: s1 < s2
		// zero: s1 = s2
		// positive: s1 > s2
		System.out.println("CompareTo: " + s1.compareTo(s2));
		
		// final variable --> final at STACK
		// final class(type) --> final at HEAP --> immutable type
	}
}
