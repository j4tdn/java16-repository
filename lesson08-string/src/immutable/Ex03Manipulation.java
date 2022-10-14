package immutable;

public class Ex03Manipulation {
	public static void main(String[] args) {
		String s = "hello all,hope you ẹnoy";
		// 1 kiểm tra chuỗ s1 có phải là chuỗi bắt đầu ,
			//kết thúc của chuối s hay không.
		String s1 ="hello";
		System.out.println("is s start with s1: "+s.startsWith(s1));
		System.out.println("is s end with s1: "+s.endsWith(s1));
		System.out.println("===============================");
		
		// 2  thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
		String s2 = "hi";
		System.out.println("replace: " + s.replace(s1, s2));
		System.out.println("===============================");
		
		// 3 loại bỏ các khoảng trắng thừa của chuỗi s3
		//chỗ nhiều space thay thế bằng 1
		s = "   hello     all, hope you    enjoy";
		s = s.trim().replaceAll("\\s+", " "); // \\s+ nhiều khoảng trắng
		System.out.println("remove redundant space:" + s);
		System.out.println("===============================");
		// 4 tạo chuỗi con s4 từ chuỗi s bắt đầu từ vj trí số 5
		System.out.println("substring: " + s.substring(4));
		System.out.println("===============================");
		// 5 xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
		System.out.println("contains: " + s.contains("you2"));
	}
}