package immutable;

public class Ex02Manipulation {
	public static void main(String[] args) {
		String s = "hello all";
		//tính chiều dài mỗi hàm
		System.out.println("length " + s.length());
		
		//nối chuỗi s1 vào chuỗi s
		String s1="- I'm TEO";
		//s = s+s1;
		System.out.println("Plus: " +(s+s1));//không lưu vô s
		System.out.println("concatenate: " +s.concat(s1));//hàm nối chuỗi
		
		//lấy 1 ký tự tại vị trí index(3) trong chuỗi s
		
		System.out.println("index: " +s.charAt(3));
		
		//duyệt từng ký tự trong chuỗi 
		for(int i=0;i<s.length();i++) {
			System.out.println("s " + i + ":" + s.charAt(i));
		}
		
		//tìm vị trí - chỉ số xuất hiện đầu tiên
		//cuối cùng của kí tự "l" trong chuỗi s
		
		System.out.println("Strat index of 'l' --> " +s.indexOf("l"));
		                                             //in ra stt của l đầu tiên
		System.out.println("last " + s.lastIndexOf("l"));
	}

}
