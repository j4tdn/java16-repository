package immutable;

public class Ex05Comparsion {
	public static void main(String[] args) {
		String s1="hello";
		String s2="welcome";
		
		//true if equals
		//false if not equals
		System.out.println("Equals: "+s1.equals(s2));
		
		//negative s1 < s2
		//zero: s1 = s2
		// position: s1 > s2
		System.out.println("CompareTo: "+s1.compareTo(s2));
		
		//final varable --> final at stack
		
		// final class(type) --> fnal at heap --> immutable type
	}
}
