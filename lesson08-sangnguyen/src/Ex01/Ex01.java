package Ex01;

public class Ex01 {
	public static void main(String[] args) {
		String s = " Nhật Sang   đẹp trai";
		
		System.out.println("println Character: ");
		printlnCharacter(s, false);
		System.out.println();
		
		System.out.println("println String: ");
		printlnString(s, false);	
		System.out.println();
		
		System.out.println("println Reverse Character: ");
		printlnCharacter(s, true);
		System.out.println();
		
		System.out.println("println Reverse String: ");
		printlnString(s, true);
		System.out.println();
		
	}
	
	public static void printlnString(String s, boolean daonguoc) {
		String[] strings = s.split("\\s+");
		printf(strings, daonguoc);	
	}
	
	public static void printlnCharacter(String s, boolean daonguoc) {
		String[] strings = s.split("");
		printf(strings, daonguoc);	
	}
	
	public static void printf(String[] strings, boolean daonguoc) {
		if (!daonguoc) {
			for (String s : strings) {
				System.out.println("||" + s + "||");
			}
		} else {
			for (int i = (strings.length - 1); i != 0; i-- ) {
				System.out.println("||" + strings[i] + "||");
			}
		}
	}
}
