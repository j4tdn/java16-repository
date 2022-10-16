package immutable;

public class Ex05Comparison {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "welcome";

		// true if equals
		// false if not equals
		// result (boolean)
		System.out.println("Equals: " + s1.equals(s2));

		// negative: s1 < s2
		// zero: s1 = s2
		// positive: s1 > s2
		// result = s1 - s2 (int)
		System.out.println("CompareTo: " + s1.compareTo(s2));
	}
}