package datastructure;

public class Ex10ObjectTypeDiff {
	public static void main(String[] args) {
		//String Integer,Double,Float,Long,Character
		//kiểu đối tượng và chỉ có duy nhất một thông tin(thuộc tính bên trong)
		// directly assign
		//lưu trữ giá trị ở heap,cụ thể hơn lưu trữ ở constant pool
		//constant pool: không cập nhật được giá trị mới
		String s1="hello";
		String s2="wellcome";
		String s3="hello";
		System.out.println(System.identityHashCode(s1));;
		System.out.println(System.identityHashCode(s2));;
		System.out.println(System.identityHashCode(s3));;
		s3="wellcome";
		System.out.println(System.identityHashCode(s3));;
		
		System.out.println("==========");
		String o1 = new String("hello");
		String o2 = new String("wellcome");
		String o3 = new String("hello");
		System.out.println(System.identityHashCode(o1));;
		System.out.println(System.identityHashCode(o2));;
		System.out.println(System.identityHashCode(o3));;
		
	}
}
