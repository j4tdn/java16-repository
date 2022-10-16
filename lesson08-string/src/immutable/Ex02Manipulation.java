package immutable;

public class Ex02Manipulation {
	public static void main(String[] args) {
		String s = "Hello ";
		// Chiều dài chuỗi
		System.out.println("length: " + s.length());

		// Nối chuỗi s1 vào s
		String s1 = "Jasmine";
		System.out.println(s + s1);
		System.out.println("Concatenate: " + s.concat(s1));
		System.out.println(s); // s = "Hello " after s.concat

		// Lấy 1 ký tự tại vị trí index(3) trong chuỗi s
		System.out.println("index(3): " + s.charAt(3));

		// Duyệt từng kí tự trong chuỗi
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

		// Tìm vị trí - chỉ số xuất hiện đầu tiên, cuối cùng của ký tự 'l'
		System.out.println("start index of 'l': " + s.indexOf("lo"));
		System.out.println("last index of 'l': " + s.lastIndexOf("l"));
	}
}
