package immutable;

public class Ex01BasicDeclaretion {
	
	/**
	 * Bất biến : ko thể thay đổi giá trị ở head
	 * immutable : String, Integer, Double, Float
	 * không thể thay đổi giá trị tại vùng nhớ HEAP
	 */
	
	public static void main(String[] args) {
		//Ex01: Khai báo String với Object và Literal
		// String Literal stores in HEAP(constant pool)
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
		hash("o2 hash", o2);
		hash("o3 hash", o3);
	}
	
	private static void hash(String text, String obj) {
		System.out.println(text + " --> " + System.identityHashCode(obj));
	}
	
}
