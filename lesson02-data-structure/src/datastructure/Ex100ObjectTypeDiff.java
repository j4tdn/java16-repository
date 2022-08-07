package datastructure;

public class Ex100ObjectTypeDiff {
	public static void main(String[] args) {
		//String. Integer , double, float, long, characte
		//kieu doi tuong va chi co duy nhat 1 thong tin
		//(thuoc tinh) ben trong
		String s1 = "HELLO";
		String s2 = "WELCOME";
		String s3 = "hello";
		System.out.println("s1 hash :" + System.identityHashCode(s1));
		System.out.println("s2 hash :" + System.identityHashCode(s2));
		System.out.println("s3 hash :" + System.identityHashCode(s3));
		s3 = "WELCOME";
		System.out.println("s3 hash :" + System.identityHashCode(s3));
		
	}

}
