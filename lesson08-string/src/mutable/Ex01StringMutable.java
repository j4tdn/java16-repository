package mutable;


/*
 * Phân biệt String Immutable và Mutable
 */
public class Ex01StringMutable {
	public static void main(String[] args) {
		// Mutable: String Builder, String Buffer has String as property
		StringBuffer sb = new StringBuffer("Layout");
		hash("sb1", sb);
		sb.append("Manager"); //BuilderPattern
		hash("sb2", sb);
		System.out.println("value: " + sb);
		
		System.out.println("\n==========\n");
		
		// Immutable: String
		String i = "box";
		hash("i1", i);
		i = i + "layout";
		hash("i2",i);
		
	}
private static void hash(String text, Object object) {
	System.out.println(text + ": " + System.identityHashCode(object));
}
}
