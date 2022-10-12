package mutable;
/**
 * Phân biệt String Mutable và Mutable
 */
public class Ex01StringMuatble {
	public static void main(String[] args) {
		// Mutable: StringBuilder, StringBuffer has String as property
		StringBuffer sb = new StringBuffer("Layout ");
		hash("sb1", sb);
		
		sb.append("Manager"); // builder pattern
		hash("sb2", sb);
		System.out.println("value: " + sb);
		
		System.out.println("\n===============\n");
		
		// Immutable: String
		String i = "Box ";
		hash("i1", i);
		
		i = i + "Layout";
		hash("i2", i);
	}
	
	private static void hash(String text, Object object) {
		System.out.println(text + ": " + System.identityHashCode(object));
	}
}
