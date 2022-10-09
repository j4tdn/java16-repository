package immutable;

public class Ex02Manipulation {
	public static void main(String[] args) {
		String s = "hello";
	
		 // Tính chiều dài của chuỗi s
		System.out.println("length: " + s.length());
		
         // Nối chuỗi s1 vào chuỗi s
		String s1 = " - I'm Teo";
		System.out.println("Plus: " + (s + s1));
		System.out.println("Concatenate: " + s.concat(s1));
		
         // Lấy một ký tự tại vị trí index(3) trong chuỗi s
		System.out.println("index: " + s.charAt(3));
		
         // Duyệt từng kí tự trong chuỗi
		for (int i = 0 ; i< s.length() ; i++) {
			System.out.println("s" + i + ":" + s.charAt(i));
		}
		
         // Tìm vị trí – chỉ số xuất hiện đầu tiên, cuối cùng 
		 // của kí tự “l” trong chuỗi s
		System.out.println("start index of 'l': " + s.indexOf("l"));
		System.out.println("end index of 'l': " + s.lastIndexOf("l"));
		 
		
	}

}
