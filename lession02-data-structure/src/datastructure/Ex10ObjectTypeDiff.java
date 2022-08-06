package datastructure;

public class Ex10ObjectTypeDiff {
	public static void main(String[] arges) {
		//String, Integer, Double, Float, Long, Character
		//kiểu dối tượng và chỉ có duy nhất 1 thông tin
		//(thuộc tính) bên trong
		//directly assign
		//lưu trữ giá trị ở HEAP --> constant pool
		String s1 = "hello";
		String s2 = "wellcome";
		String s3 = "hello";
		System.out.println("S1 hash " + System.identityHashCode(s1));
		System.out.println("S2 hash " + System.identityHashCode(s2));
		System.out.println("S3 hash " + System.identityHashCode(s3));
		s3 = "wellcome";//"bye";
		System.out.println("S3 hash " + System.identityHashCode(s3));
		
		System.out.println("========================================");
		String o1 = new String("hello");
		String o2 = new String("wellcome");
		String o3 = new String("hello");
		System.out.println("S1 hash " + System.identityHashCode(o1));
		System.out.println("S2 hash " + System.identityHashCode(o2));
		System.out.println("S3 hash " + System.identityHashCode(o3));
		
	}

}
