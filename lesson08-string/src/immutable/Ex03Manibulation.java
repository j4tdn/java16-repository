package immutable;

public class Ex03Manibulation {
	public static void main(String[] args) {
		String s ="hello all, hope you enjoy";
		//1. kiểm tra 1 chuỗi s1 có phải chuỗi bắt đầu , kết thúc của chuỗi s không
		String s1 ="hello";
		System.out.println("is s starts with s1 ? " +s.startsWith(s1));//s1 có phải là bắt đầu của s không/true
		System.out.println("is s end with s1 ? " +s.endsWith(s1));
		
		//2. thay thế chuỗi s 1 = chuỗi s2 trong chuỗi s
		String s2 ="hi";
		System.out.println("replace: " +s.replace(s1, s2));
		
		//3. loại bỏ các khoảng trắng thừa của chuỗi s3
		//chỗ nào có nhiều khoảng trắng thì thay thế = 1 khoảng trắng
		s ="   hello all, hope  you   enjoy   ";
		s = s.trim()//bỏ khoảng trắng thừa ở 2 đầu chuỗi
				.replaceAll("\\s+", " ");//1 hoặc nhiều khoảng trắng = 1 khoảng trắng
		System.out.println("remove redundant space:  " + s);
		//\\s{5} replace 5 kí tự/{1,5} thay từ 1 tới 5 kí tự/{1, } từ 1 tới n ký tự
		
		
		//4. tạo chuỗi con của chuỗi s bắt đầu từ vị trí số 4
		//subString(stratInclusive, endExclusive)[5,8)
		System.out.println("substring: " +s.substring(4));
		
		//5. xác định chuỗi s2 có tồn tại trong chuỗi S1 hay không
		System.out.println("contains: " +s.contains("you2"));//true--false
		
		
	}

}
