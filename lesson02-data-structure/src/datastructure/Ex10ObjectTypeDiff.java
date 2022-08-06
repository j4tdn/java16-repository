
package datastructure;

public class Ex10ObjectTypeDiff {
	public static void main(String[] args) {
			// String, Integer, Double, Float, Long, Character
			// Kieu doi tuong va chi co duy nhat 1 thong tin
			// (Thuoc tinh) ben trong
			// directly assign
			//luu tru gia tri o HEAD -> constant pool
			String s1 = "hello";
			String s2 = "welcome";
			String s3 = "hello";
			System.out.println("S1 hash: " + System.identityHashCode(s1)); 
			System.out.println("S2 hash: " + System.identityHashCode(s2));
			System.out.println("S3 hash: " + System.identityHashCode(s3));
			s3 = "welcome"; // "bye" --> H2
			System.out.println("S3 hash: " + System.identityHashCode(s3));

			System.out.println("============================");
			// Heap
			String 01 = new String("hello");
			String 02 = new String("welcome");
			String 03 = new String("hello");
			System.out.println("S1 hash: " + System.identityHashCode(01)); 
			System.out.println("S2 hash: " + System.identityHashCode(02));
			System.out.println("S3 hash: " + System.identityHashCode(03));
		}
	}

