package datastucture;

public class Ex10ObjectTypeDiff {
	public static void main(String[] args) {
		// String, Integer, Double, Float, Long, Character
		// Kieu doi tuong va chi duy nhat 1 thong tin thuoc tinh ben trong
		// (thuoc tinh) ben trong
		// Directly assign
		// Luu tru gia tri o HEAP -> constant pool(s1 va s3 se tro den 1 cho trong
		// constant pool)
		String s1 = "hello";
		String s2 = "welcome";
		String s3 = "hello";
		System.out.println("s1 hash: " + System.identityHashCode(s1));
		System.out.println("s2 hash: " + System.identityHashCode(s2));
		System.out.println("s3 hash: " + System.identityHashCode(s3));
		s3 = "welcome";
		System.out.println("s3 hash: " + System.identityHashCode(s3));
		System.out.println("========================================");
		String o1 = new String("hello");
		String o2 = new String("welcome");
		String o3 = new String("hello");
		System.out.println("o1 hash: " + System.identityHashCode(o1));
		System.out.println("o2 hash: " + System.identityHashCode(o2));
		System.out.println("o3 hash: " + System.identityHashCode(o3));
	}
}
