package multable;

public class Ex01StringMultable {
	/**
	 * Phân biệt String Mutable và Mutable
	 */
	public static void main(String[] args) {
		// Mutable: StringBuilder, StringBuffer hash String as property
		StringBuffer sb = new StringBuffer("Layout ");
		hash("sb1", sb);
		
		sb.append("Manager"); // builder pattern
		hash("sb2", sb);
		System.out.println("value: " + sb);
		
		System.out.println("====================================");

		// Immutable: String
		String i = "Box";
		hash("i1", i);

		i = i + "Layout";
		hash("i2", i);
	}

	private static void hash(String text, Object object) {
		System.out.println(text + ":" + System.identityHashCode(object));
	}

}
