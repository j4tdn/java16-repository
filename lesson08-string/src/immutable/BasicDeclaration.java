package immutable;

public class BasicDeclaration {
	public static void main(String[] args) {
		//immutable: bất biến
		// k thể thay đổi ở vùng nhớ HEAP
		String s1 = "Welcome";
		String s2 = "Welcome";
		String s3 = "Student";
				
		hash("s1 hash", s1);
		hash("s2 hash", s2);
		hash("s3 hash", s3);
				
		// String Object stores in HEAP(normal)
		String o1 = new String("Welcome");
		String o2 = new String("Welcome");
		String o3 = new String("Student");
			
		hash("o1 hash", o1);
		hash("o2 hash", o2);hash("o3 hash", o3);
	}
	private static void hash(String text, String object) {
		System.out.println(text + System.identityHashCode(object));
	}

}
