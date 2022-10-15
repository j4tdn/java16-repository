package mutable;

public class Ex01StringMutable {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("layout ");
		hash("sb1", sb);
		
		sb=sb.append("Manage");
		hash("sb2", sb);
		System.out.println("value: " +sb);
		
		String i="box";
		hash("i1", i);
		
		i=i+"layout";
		hash("i2", i);
	}
	private static void hash(String text, Object sb) {
		System.out.println(text + ":" + System.identityHashCode(sb));
	}

}
