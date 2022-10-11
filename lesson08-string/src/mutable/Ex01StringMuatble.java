package mutable;

/*
 * Phân biệt String Mutable và Mutable
 * 
 */
public class Ex01StringMuatble {

	public static void main(String[] args) {
		// Mutable: StringBuider, StringBuffer has string as property
		StringBuilder sb = new StringBuilder("Layout ");
		hash("sb1", sb);
		
		sb.append("Manger");//builder pattern
		hash("sb2", sb);
		System.out.println("value: " + sb);
		
		System.out.println("==========");
		// Imutable: String
		String i = "Box ";
		hash("i1", i);
		
		i = i + "Layout";
		hash("i2", i);
	}
	private static void hash(String text, Object object)
	{
		System.out.println(text+ ": " + System.identityHashCode(object));	
	}
	
	
	
}
