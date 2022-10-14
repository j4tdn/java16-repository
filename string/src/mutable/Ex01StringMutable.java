package mutable;

public class Ex01StringMutable {

	public static void main(String[] args) {
		//Mutable
		StringBuffer sb = new StringBuffer("Layout");
		hash("sb1", sb);
		sb.append(" Manager");
		hash("sb2", sb);
		System.out.println("==================");
		//Immutable
		String i = "Box";
		hash("i1", i);
		i = i + " Layout";
		hash("i2", i);

	}
	
	private static void hash(String text, Object obj) {
		System.out.println(text + " --> " + System.identityHashCode(obj));
	}

}
