package mutable;

public class Ex01StringMuatable {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Layout");
		hash("sb1", sb);
		sb.append("Manager");
		hash(null, sb);
		System.out.println( sb);
		
		String i = "box";
		hash("i1", i);
		i = i +" Layout";
		hash("i2", i);
		
	}
	private static void hash(String text, String object) {
		System.out.println( text + ":" + System.identityHashCode(object));
	}
	private static void hash(String text, StringBuilder object) {
		System.out.println( text + ":" + System.identityHashCode(object));
	}

}
