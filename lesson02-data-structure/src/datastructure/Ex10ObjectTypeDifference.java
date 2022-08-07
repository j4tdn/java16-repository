package datastructure;

public class Ex10ObjectTypeDifference {
	public static void main(String[] args) {
//		KDT: String, Integer, Double, Float, Long, Character
//		chỉ có duy nhất 1 thuộc tính bên trong
		
//		C1: directly assign (lưu trữ giá trị ở HEAP -> constant pool)
		String s1 = "hello";
		String s2 = " and welcome ";
		String s3 = "hello";
		System.out.println("s1 hash: " + System.identityHashCode(s1));
		System.out.println("s2 hash: " + System.identityHashCode(s2));
		System.out.println("s3 hash: " + System.identityHashCode(s3));
		s1 = "Jasmine";
		System.out.println("s1 hash: " + System.identityHashCode(s1));
		System.out.println("s2 hash: " + System.identityHashCode(s2));
		System.out.println("s3 hash: " + System.identityHashCode(s3));
		System.out.println(s3+s2+s1);
		
//		C2: lưu trữ ở HEAP
//		String o1 = new String("hello");
//		String o2 = new String("welcome");
//		String o3 = new String("hello");
		
	}
}
