package mutable;
/*
 * Phân biệt String Mutable và Mutable
 */

public class Ex01StringMutable {
	public static void main(String[] args) {
		// Mutable: StringNuilder, StringBuffer has String as property
		StringBuffer sb = new StringBuffer("Layout ");
		hash("sb1", sb);

		sb = sb.append("Manager");
		hash("sb2", sb);
		System.out.println("value: " + sb);

		System.out.println("\n============================================");

		// Inmutable: String
		String i = "Box";
		hash("t1", i);

		i = i + "Layout";
		hash("i2", i);
	}

	private static void hash(String text, Object object) {
		System.out.println(text + ": " + System.identityHashCode(object));
	}
}
