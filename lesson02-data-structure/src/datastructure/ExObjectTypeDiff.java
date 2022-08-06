package datastructure;

public class ExObjectTypeDiff {
	public static void main(String[] args) {
		//String, Integer, Double, Float, Long, Character
		// Kiểu đối tượng và chỉ có duy nhất 1 thông tin(thuộc tính) bên trong 
		// directly assign
		// lưu trữ giá trị ở HEAD --> constant pool
		String s1 = "hello";
		String s2 = "welcome";
		String s3 = "hello";
		
		System.out.println("s1 hash: " + System.identityHashCode(s1));
		System.out.println("s2 hash: " + System.identityHashCode(s2));
		System.out.println("s3 hash: " + System.identityHashCode(s3));
		s3 = "welcome";
		System.out.println("s3 hash: " + System.identityHashCode(s3));
		
		System.out.println("=======================");
		String o1 = new String("hello");
		String o2 = new String("welcome");
		String o3 = new String("hello");
		System.out.println("s1 hash: " + System.identityHashCode(s1));
		System.out.println("s2 hash: " + System.identityHashCode(s2));
		System.out.println("s3 hash: " + System.identityHashCode(s3));
	}
	
}
