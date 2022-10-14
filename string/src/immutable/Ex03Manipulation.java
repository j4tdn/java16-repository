package immutable;

public class Ex03Manipulation {

	public static void main(String[] args) {
		String s = "hello all, hope you enjoy";
		
		//• Kiểm tra kí tự, chuỗi bắt đầu, kết thúc trong chuỗi s có phải là s1 không.
		String s1 = "hello";
		System.out.println("is s start with s1 ? " + s.startsWith(s1));
		System.out.println("is s end with s1 ? " + s.endsWith(s1));
		
		//• Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
		String s2 = "hi";
		System.out.println("replace s1 to s2 from s " + s.replace(s1, s2));
		//• Loại bỏ các khoảng trắng thừa của chuỗi s3
		s = "     hello    all, hope you     enjoy    ";
		s = s.replaceAll("\\s{2,}", " ").trim();
		System.out.println(s);
		//• Tạo chuỗi con s4 từ chuỗi s bắt đầu từ vị trí số 2
		String s4 = s.substring(2);
		System.out.println("SubString from index 2 " + s4);
		//• Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
		System.out.println("'" + s + "'" + " is contains " + "'" + s1 + "'" + "  : " + (s.contains(s1)?"yes":"no"));
	}

}
