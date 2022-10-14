package immutable;

public class Ex02Manipulation {
	public static void main(String[] args) {
		String s = "hello all";
		
		// Tính chiều dài chuỗi s
		System.out.println(s.length());
		// Nối chuỗi s1 vào s
		String s1 = " - I'm Teo";
		System.out.println("Plus : " + (s + s1));
		System.out.println("Concatenate :" + s.concat(s1));
		// Lấy 1 ký tự tại index(3) trong s
		System.out.println(s.charAt(3));
		// Duyệt từng phần tử trong s
		s.chars().forEach(c->System.out.print((char)c + " "));
		System.out.println();
		// tìm vị trí - chỉ số xuất hiện đầu tiên, cuối cùng của l trong chuỗi s
		System.out.println("start index of 'l' " + s.indexOf("l"));	
		System.out.println("last index of 'l' " + s.lastIndexOf("l"));	
	}
}
