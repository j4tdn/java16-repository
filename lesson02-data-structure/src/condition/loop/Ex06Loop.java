package condition.loop;

import java.util.Scanner;

public class Ex06Loop {
	public static void main(String[] args) {
		//1st --> using for
		
		for(int i = 0; i < 10 ;) {
			if(i % 4 == 0) {
				System.out.print(i + " ");
			}
			i += 2;
		}
		// 2nd  --> using while
		int i = 0;
		while(i < 10 ) {
			if(i % 4 == 0) {
				System.out.println(i + " ");
			}
			i+=2;
		}
		
		System.out.println("========================");
		// 3nd --> Viết chương trình nhập vào  1 số nguyên hợp lệ
		// Nếu nhập sai quá 3 lần thì thoát chương trình
		Scanner ip = new Scanner(System.in);
		String numberAsText = "";
		
		//kiểm tra là số thì mới parse sang int
		// \\d: số nguyên 
		// + : 1 hoặc nhiều 
		do {
			System.out.print("enter valid: ");
			numberAsText = ip.nextLine();
		}while(!numberAsText.matches("\\d+"));
		
		int number = Integer.parseInt(numberAsText);
		System.out.println("number: "+ number);		
			System.out.println("Finish");
	}
}
