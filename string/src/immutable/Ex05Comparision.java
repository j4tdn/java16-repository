package immutable;

public class Ex05Comparision {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "welcome";
		
		//true if equals
		//false if not equals
		System.out.println(s1.equals(s2));
		// negative: s1 < s2
		// zero    : s1 = s2
		// positive: s1 > s2
		System.out.println(s1.compareTo(s2));
	}
}
