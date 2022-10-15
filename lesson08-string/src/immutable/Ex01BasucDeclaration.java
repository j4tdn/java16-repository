package immutable;

//String có 2 loại: immutable
//                : Mutable
public class Ex01BasucDeclaration {
	//immutable: bất biến--> không thể thay đổi giá trị tại vùng nhớ HEAP
	//         :String, Integer, double, float bất biến
public static void main(String[] args) {
	// String Literal stores in HEAP(constant pool)
	//dùng equal để so sánh giá trị ở STACK/địa chỉ ở kiểu dữ liệu đối tượng
	String s1 = "Welcome";
	String s2 = "Welcome";
	String s3 = "Student";
			
	hash("s1 hash", s1);
	hash("s2 hash", s2);
	hash("s3 hash", s3);
			
	// String Object stores in HEAP(normal)
	String o1 = new String("Welcome");
	String o2 = new String("Welcome");
	String o3 = new String("Student");
		
	hash("o1 hash", o1);
	hash("o2 hash", o2);hash("o3 hash", o3);

}
private static void hash(String text, String object) {
	System.out.println(text + "--> " +System.identityHashCode(object));
}                                    //in ra địa chỉ ô nhớ object

}
