package immutable;

public class Ex05Comparsion {
	public static void main(String[] args) {
		String s1 = " hello ";
		String s2 = "welcome";

		System.out.println("Esquals" + s1.equals(s2));

		// negative : s1 < s2
		// zero :s1 = s2
		// posstive: s1 > s2
		System.out.println("CompareTo: " + s1.compareTo(s2));

		// final variable --> final at stack
		// final class (type) --> final at heap

	}
}
