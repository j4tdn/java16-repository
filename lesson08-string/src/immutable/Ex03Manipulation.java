package immutable;

public class Ex03Manipulation {
public static void main(String[] args) {
	String s = "hello all, hope you enjoy";
	
	
	// 1. Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu, kết thúc trong chuỗi s không.
	String s1 = "hello";
	System.out.println("is s starts with s1: " + s.startsWith(s1));
	System.out.println("is s end with s1: " + s.endsWith(s1));
	
	// 2. Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
	String s2 = "hi";
	System.out.println("replace: " + s.replace(s1, s2));
	
	// 3. Loại bỏ các khoảng trắng thừa của chuỗi s3
	// Chổ nào có nhiều khoảng trắng --> thay thế bằng 1 khoảng trắng
	s = "      hello           all, hopy             you enjoy        ";
	// trim --> xoá khoảng trắng hai đầu
	s = s.trim().replaceAll("\\s+", " ");
	System.out.println("remove redundant space: " + s);
	
	// 4. Tạo chuỗi con của chuỗi s từ chuỗi s bắt đầu từ vị trí số 2
	System.out.println("substring: " + s.substring(4));
	
	// 5. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
	System.out.println("s contain 'you'? " + s.contains("you") );
	
}
}
