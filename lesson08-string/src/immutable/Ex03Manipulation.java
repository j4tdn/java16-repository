package immutable;

public class Ex03Manipulation {
	public static void main(String[] args) {
		String s = "hello all, hope you enjoy";
		//1. kiểm tra chuỗi s1 có phải là chuỗi bắt đầu của chuỗi s hay không
		String s1 = "hello";
		System.out.println("Is s start with s1 ? --> " + s.startsWith(s1));
		System.out.println("Is s end with s1 ? --> " + s.endsWith(s1));
		
		//2. thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
		String s2 = "hi";
		System.out.println("replace: " + s.replace(s1, s2));
		
		//3. loại bỏ các khoảng trắng thừa trong chuỗi s
		// chỗ nào có nhiều space, gán lại còn 1 space
		s = "    hello all, hope you   enjoy   ";
		s = s.trim()
				.replaceAll("\\s+", " ");
		System.out.println("Remove redundant space: " + s);
		
		//4. tạo chuỗi con của của s bắt đầu tự vị trí thứ 2
		// subString(StartInclusive, endExclusive)
		System.out.println("cut for index 2: " + s.substring(4));
		
		//5. xác định chuỗi s2 có chứa trong chuỗi s1 hay không
		System.out.println("contains: " + s.contains("you"));
		System.out.println("contains: " + s.contains("you to"));
	}
}
