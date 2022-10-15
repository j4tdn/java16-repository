package immutable;

import java.util.concurrent.Flow.Subscriber;

public class Ex03Manipulation {
public static void main(String[] args) {
	String s = "hello all, hope you enjoy";
	
	
	//1.Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu.
	//kết thúc trong chuỗi s không
	String s1 ="hello";
	System.out.println("is s starts with s1?"+ s.startsWith(s1) );
	System.out.println("is s end with s1?"+ s.endsWith(s1));
	//2. Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
	String s2 = "hi";
	System.out.println("replace:"+s.replace(s1, s2));
	
	//3. Loại bỏ các khoảng trắng thừa của chuỗi s3
	// Chỗ nào có nhiều space, thay  thế bằng 1 space
	s = "  hello  all, hope you  enjoy";
	s= s.trim()
			.replaceAll("\\s+","");
					
	System.out.println("remove redundant spacce |||" + s + "|||");
	
	//4. Tạo 1 chuỗi con của chuỗi s bắt đầu từ vị trí số 2
	//subString(startInclusive, endEXclusive)
	
	 System.out.println("substring:" +  s.substring(4));
	 //5.Xác định chuỗi s2 có tồn tại trogn chuỗi s1 hay không
	System.out.println("contains:"+s.contains(s2));
}
}
