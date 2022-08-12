package condition.loop;

import java.util.Scanner;

public class Ex06Loop {
	public static void main(String[] args) {
		// 1. Using for: duyệt mảng, danh sách
		for (int i = 0; i < 10; i+=2) {
			if (i % 4 == 0) {
				System.out.println(i + "");
			}
			System.out.println("\n ================");
		}		
		
		// 2. Using while: tính toán
		int i = 0;
		while(i < 10) {
			if (i % 4 == 0) {
			System.out.println(i + " ");
			}
			i+=2;
		
			System.out.println("\n ================");
	
	
	
	// 3. Viết chương trình nhập vào số nguyên hợp lệ
	// TODO: Nếu viết sai 3 lần --> thoát ctrình
			Scanner ip = new Scanner(System.in);
			String numberAsText = "";
			
			// Kiểm tra numberAsText là số mới parse sang int
			// \\d: Số nguyên
			// + : 1 hoặc nhiều
			do {
				System.out.println("Enter a valid number: ");
				numberAsText = ip.nextLine();
			} while(!numberAsText.matches("\\d+"));
			
			int number = Integer.parseInt(numberAsText);
			System.out.println("number: " + number);
			
			System.out.println("Finish");
		}
	}
}
