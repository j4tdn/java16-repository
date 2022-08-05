package datastructure;

public class Ex10ObjectTypeDiff {
	public static void main(String[] args) {
		// String , integer , Double , Float , Long , Character
		// Kieu doi tuong va chi co duy n hat 1 thong tin
		// (thuoc tinh ben trong)
		// directly assign
		// luu tru gia tri o HEAD -> constant pool
		String s1 = "hello"; // H1
		String s2 = "Welcome"; // H2
		String s3 = "hello"; // H1
		System.out.println("s1 hash: " + System.identityHashCode(s1));
		System.out.println("s2 hash: " + System.identityHashCode(s2));
		System.out.println("s3 hash: " + System.identityHashCode(s3));
		s3 = "welcome"; // "bye" --> H2
		System.out.println("s3 hash: " + System.identityHashCode(s3));

		System.out.println("====================");
		// HEAP
		String o1 = "hello";
		String o2 = "Welcome";
		String o3 = "hello";
		System.out.println("o1 hash: " + System.identityHashCode(o1));
		System.out.println("o2 hash: " + System.identityHashCode(o2));
		System.out.println("s3 hash: " + System.identityHashCode(o3));
	}
}
