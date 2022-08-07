package datastructure;

public class Ex10ObjectTypeDiff {
	public static void main(String[] args) {
		// String, Integer, Double, Float, Characte
		// Kieu doi tuong va chi co duy nhat 1 thong tin(thuoc tinh) ben trong
		// directly assign
		// luu tru gia tri o HEAD -> constant pool
		String s1 = "Hello";
		String s2 = "Welcome";
		String s3 = "Hello";
		System.out.println("s1 hash: " + System.identityHashCode(s1));
		System.out.println("s2 hash: " + System.identityHashCode(s2));
		System.out.println("s3 hash: " + System.identityHashCode(s3));
		s3 = "welcom";//"bye";
		System.out.println("s3 hash: " + System.identityHashCode(s3));
		
		System.out.println("=============");
		//HEAP
		String o1 = new String("Hello");
		String o2 = new String("Welcom");
		String o3 = new String("Hello");
		System.out.println("o1 hash: " + System.identityHashCode(o1));
		System.out.println("o2 hash: " + System.identityHashCode(o2));
		System.out.println("o3 hash: " + System.identityHashCode(o3));
	}
}
