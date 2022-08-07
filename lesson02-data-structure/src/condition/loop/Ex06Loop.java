package condition.loop;

import java.util.Scanner;

public class Ex06Loop {

	public static void main(String[] args) {
		// 1st --> using for
		for(int i = 0; i < 10; i+=2) {
			if(i % 4 ==0) {
				System.out.println(i + " ");
			}
		}
		
		System.out.println("----------------------------------------------");
		
		// 2nd --> using while
		int i = 0;
		while(i < 10) {
			if(i % 4 ==0) {
				System.out.println(i + " ");
			}
			i+=2;
		}
		
		// 3nd ==> viêt chương trình nhập vào 1 số nguyên hợp lê 
		// nếu sai quá 3 lần thì thoát
		System.out.println("----------------------------------------------");
		Scanner ip = new Scanner(System.in);
		String numberAsTest = "";
		
		// kiểm tra là số mớ parse sang int
		// \\d: số nguyên
		// + : 1 or nhiều
		// bỏ qua lần đầu tiên do while
		do{
			System.out.print("Enter valid number: ");
			numberAsTest = ip.nextLine();
		}while(!numberAsTest.matches("\\d+"));
		
		int number = Integer.parseInt(numberAsTest);
		System.out.println("number: " + number);
		
		System.out.println("Finish");

	}

}
