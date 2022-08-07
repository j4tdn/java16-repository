package datastructure;

public class Ex10OjectTypeDiff {

	public static void main(String[] args) {
		// TString, Integer, Double, Float, Long, Character
		// Kiểu đối tượng và chỉ có duy nhất một thông tin(thuộc tính) bên trong
		
		// directly assign khai báo trực tiếp
		// lưu trữ giá trị ở HEAP => constant pool (không thể caapk nhật được giá trị của nó)
		String s1 = "hello";
		String s2 = "welcome";
		String s3 = "hello";
		System.out.println("s1 hash: " + System.identityHashCode(s1));
		System.out.println("s3 hash: " + System.identityHashCode(s2));
		System.out.println("s3 hash: " + System.identityHashCode(s3));
		s3 = "hihi";
		System.out.println("s3 hash: " + System.identityHashCode(s3));
		
		
		
		System.out.println("---------------------");
		
		// HEAP
		String o1 = new String("hello");
		String o2 = new String("welcome");
		String o3 = new String("hello");
		System.out.println("o1 hash: " + System.identityHashCode(o1));
		System.out.println("o3 hash: " + System.identityHashCode(o2));
		System.out.println("o3 hash: " + System.identityHashCode(o3));
		o3 = "welcome";
		System.out.println("o3 hash: " + System.identityHashCode(o3));
	}

}
