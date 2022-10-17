package immutable;

public class Ex05Comparsion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = "world";
	
		//true is equals
		//false is not equals
		System.out.println("Equals: " + s1.equals(s2));
		
		//negative: s1 < s2
		//zero: s1 = s2
		//positive: s1 > s2
		System.out.println("CompareTo:" + s1.compareTo(s2));
	}

}
