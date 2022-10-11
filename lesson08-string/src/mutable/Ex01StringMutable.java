package mutable;

public class Ex01StringMutable {
	public static void main(String[] args) {
		// Mutable: StringBuilder, StringBuffer
		// StringBuilder va StringBuffer giống nhau nhưng chỉ khác StringBuilder chỉ hỗ
		// trợ đơn luồng, StringBuffer hỗ trợ đa luồng, còn lại các hàm khác giống hệt
		// nhau
		StringBuffer sb = new StringBuffer("Layout ");
		hash("sb1", sb);
		sb.append("Manager");// builder pattern
		hash("sb2", sb);
		System.out.println("value: " + sb);
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
