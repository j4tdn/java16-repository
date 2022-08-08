package condition.loop;

import java.util.Scanner;

public class Ex06Loop {
	public static void main(String[] args) {
		// 1. Using for
		for (int i = 0; i < 10; i+=2) {
			if(i%4==0)
				System.out.print(i + " ");
		}
		// 2. Using While
		System.out.println("");
		System.out.println("=====================");
		int i=0;
		while (i<10) {
			if(i%4==0) {
				System.out.print(i + " ");
			}
			i++;	
		}
		System.out.println("");
		System.out.println("=====================");
		// 3. Viết chương trình nhập vào 1 số nguyên hợp lệ
		// Nếu nhập sai quá 3 lần thì thoát
		boolean check = true;
		Scanner ip = new Scanner(System.in);
		int count = 0;
		while (check && count < 3) {
			System.out.print("Nhập vào 1 số :");
			String numberAsText = ip.nextLine();
			if(numberAsText.matches("\\d+")) {
				int number = Integer.parseInt(numberAsText);
				System.out.println("Số vừa nhập là : " + number);
				check = false;
			}
			else count++;
			
//			try {
//				System.out.print("Nhập vào 1 số :");
//				int a = Integer.parseInt(ip.nextLine());
//				check = false;
//				System.out.println("Số vừa nhập là : " + a);
//			} catch (Exception e) {
//				count++;
//			}
		}
		System.out.println("Finish ...");
	}
}
