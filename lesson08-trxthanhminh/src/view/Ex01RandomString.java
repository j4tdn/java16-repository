package view;

public class Ex01RandomString {
	public static void main(String[] args) {
		
		String s = "Chúc mừng sinh nhật";
			
			while (true) {
				if (s.matches(".*[^\\p{L}\\s].*"))
					System.out.println("Chỉ nhập chuỗi chứa các kí tự tiếng việt có dấu, phím space!");
				else
					break;
			}
			
			printEachChar(s);
			System.out.println("====");
			printEachWord(s);
			System.out.println("====");
			printEachCharReverse(s);
			System.out.println("====");
			printEachWordReserve(s);
			
		}
		
		private static void printEachChar(String s) {
			for (int i = 0; i < s.length(); i++) {
				System.out.print(s.charAt(i) + "\n");
			}
		}
		
		private static void printEachWord(String s) {
			String[] arrays = s.trim().split("\\s+");
			for (String array : arrays) 
				System.out.println(array);
		}
		
		private static void printEachCharReverse(String s) {
			for (int i = s.length() - 1; i >= 0; i--) {
				System.out.print(s.charAt(i) + "\n");
			}
		}
		
		private static void printEachWordReserve(String s) {
			String[] arrays = s.trim().split("\\s+");
			for (int i = arrays.length - 1; i >= 0; i--) {
				System.out.println(arrays[i]);
			}
	}
	
}
