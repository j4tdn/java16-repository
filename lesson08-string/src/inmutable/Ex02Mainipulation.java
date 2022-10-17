package inmutable;

public class Ex02Mainipulation {
	public static void main(String[] args) {
		String s = "hello all";
		// Tính chiều dài của chuỗi s
		System.out.println("length: " + s.length());

		// Nối chuỗi s1 vào chuỗi S
		String s1 = " - I'm Teo";
		System.out.println("Plus: " + (s + s1));
		System.out.println("Concatenate: " + s.concat(s1));

		// Lấy 1 ký tự tại vị trí index(3) trong chuỗi s
		System.out.println("index: " + s.charAt(3));

		// Duyệt ký tự trong chuỗi
		for (int i = 0; i < s.length(); i++) {
			System.out.println("s" + i + ":" + s.charAt(i));
		}
		
		// Tìm vị trí - chỉ số xuất hiện đầu tiên, và cuối cùng của chữ "a", trong chuỗi s
		System.out.println("start index of 'l' --> " + s.indexOf("l"));
		System.out.println("last index of 'l' --> " + s.lastIndexOf("l"));
	}
}
