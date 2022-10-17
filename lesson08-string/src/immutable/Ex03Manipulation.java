package immutable;

public class Ex03Manipulation {
	public static void main(String[] args) {
		String s = "hello all, hope u enjoy";
		
		// 1. Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu, kết thúc trong chuỗi s hay không
		
		String s1 = "hello";
		System.out.println("is a starts with s1 ? " + s.startsWith(s1));
		System.out.println("is a end with s1 ? " + s.endsWith(s1));

		// 2. Thay thế chuỗi s1 bằng s2 trong chuỗi s
		String s2 = "hi";
		System.out.println("replace: " + s.replace(s1, s2));
		
		// 3. Loại bỏ các khoảng trắng thừa của chuỗi s3
		s = "    hello     all,          hope    you     enjoy        ";
		s = s.trim()
				.replaceAll("\\s+", " ");
		System.out.println("remove redundant space: " + s);
		
		// 4. Tạo chuỗi con của chuỗi s bắt đầu từ vị trí số 5
		// subString(startInclusive, endInclusive)
		System.out.println("substring: " + s.substring(5));
		
		// 5. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
		System.out.println("contant: " + s1.contains(s2));
		
	}
}
