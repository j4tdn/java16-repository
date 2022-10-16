package immutable;

public class Ex03Manipulation {
	public static void main(String[] args) {
		String s = "Hello all, hope you enjoy";
//		1. Kiểm tra kí tự, chuỗi bắt đầu, kết thúc trong chuỗi s có phải là s1 không.
		String s1 = "Hello";
		System.out.println("Does s start with s1? " + s.startsWith(s1));
		System.out.println("Does s end with s1? " + s.endsWith(s1));
//		2. Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
		String s2 = "Jasmine";
		System.out.println(s.replaceFirst("all", "Jasmine"));
//		3. Loại bỏ các khoảng trắng thừa của chuỗi s3
			// => chỗ nào có nhiều space thì thay thế bằng 1 space
		String s3 = "       Hello all, hope              you                 enjoy";
		s3 = s3.trim(); // loại bỏ khoảng trắng ở 2 đầu (beginning and end)
		s3 = s3.replaceAll("\\s+", " ");
		System.out.println("Remove redundant space: " + s3);
//		4. Tạo chuỗi con s4 từ chuỗi s bắt đầu từ vị trí số 2
		// substring(startInclusive, endExclusive)
		String sSub = s.substring(2);
		System.out.println(sSub);
//		5. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
		System.out.println(s.contains(s2));
	}
}
