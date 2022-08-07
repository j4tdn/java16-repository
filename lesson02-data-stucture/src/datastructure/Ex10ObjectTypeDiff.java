package datastructure;

public class Ex10ObjectTypeDiff {
	public static void main(String[] args) {
		// String, Intefer,Double,Float, Long,Characte
		// Kiểu đối tượng chỉ có duy nhất một thông tin
		//(thuộc tính) bên trong
		//lưu trữ giá trị ở HEAP -> constant pool
		
		
		String s1 ="hello";
		String s2 ="welcome";
		String s3 = "hello";

		System.out.println("s1 hash:"+ System.identityHashCode(s1));
		System.out.println("s2 hash:"+ System.identityHashCode(s2));
		System.out.println("s3 hash:"+ System.identityHashCode(s3));
		 s3 ="welcome";
		 System.out.println("s3 hash:"+ System.identityHashCode(s3));
		 System.out.println("===================");
		 String o1 =new String ("hello");
		 String o2 =new String ("Welcome");
		 String o3 =new String ("hello");
		 System.out.println("o1 hash:"+ System.identityHashCode(o1));
	}
	
}
