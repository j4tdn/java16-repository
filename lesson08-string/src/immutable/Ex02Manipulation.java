package immutable;

public class Ex02Manipulation {
	public static void main(String[] args) {
		String s = "hello all";
		
		//Tính chiều dài của chuỗi s
		System.out.println(s.length());
		
		//nối chuỗi s1 vào chuỗi s
		String s1 = ", I'm Tèo.";
		System.out.println("plus: " + (s+s1));
		System.out.println("Concatenate: " + s.concat(s1));
		
		//Lấy một kí tự tại vị trí index(3) trong chuỗi s
		System.out.println("index: " + s.charAt(3));
		
		//Duyệt từng phần tử trong chuỗi
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + " - ");
		}
		System.out.println();
		
		//Tìm vị trí xuất hiện đầu tiên, cuối cùng của kí tự "l" trong chuỗi 
		System.out.println("Start index of 'l' --> " + s.indexOf("l"));
		System.out.println("End index of 'l' --> " + s.lastIndexOf("l"));
	}
}
