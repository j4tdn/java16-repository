package mutable;
/*
 * Distinguish String Mutable and Immutable
 */
/*
 * final variable : final at stack
 * final class : final at heap
 */
public class Ex01StringMutable {
	public static void main(String[] args) {
		// mutable: StringBuilder, StringBuffer has a String property
		StringBuilder sb = new StringBuilder("manger ");
		System.out.println(sb);
		hash("sb1", sb);
		
		sb.append("un poulet");
		System.out.println(sb);
		hash("sb1", sb);
		
		// immutable: String
		String i = "Box ";
		hash("i1", i);
		i = i + "Layout";
		hash("i2", i);
	}

	private static void hash(String text, Object object) {
		System.out.println(text + ": " + System.identityHashCode(object));
	}
}
