package condition.loop;

import java.util.Scanner;

public class Ex06Loop {
	public static void main(String[] args) {
		//1st-->using for
		for (int i = 0; i< 10;i+=2) {
			if ( i % 4 == 0) {
			System.out.print(i+ " ");-
			}
		}
		
		//2nd --> using while
		int i =0;
		while(i < 0) {
			if (i % 4 == 0) {
				System.out.println(i + " " );
			}
			i+=2;
		}
		Scanner ip = new Scanner(System.in);
		String numberAsText = "";
		do {
			System.out.println();
			numberAsText = ip.nextLine();
		} while(!numberAsText.matches("\\d+"));
		
		//3rd --> viet chuong trinh nhap vao 1 so nguyen hop le
		// neu nhap sai qua 3 lan thi thoat chuong trinh
		
		int number = Integer.parseInt(numberAsText);
		System.out.println("number: " + number);
		
		System.out.println("finish");
	}
}