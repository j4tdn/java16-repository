package view;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		
		System.out.print("Số cần kiểm tra là: "  );
		int nb = number.nextInt();
		
		int a = nb/2;
		int b = nb%2;
		
		if (nb == 0 || nb == 1) {
			System.out.println(nb + " không là lũy thừa của 2");
		
		} else if (b == 1) {
			System.out.println(nb + " không là lũy thừa của 2");
		}
		
		else if (a == a/2 && b == a%2 && b == 0) 
			System.out.println(nb + " là lũy thừa của 2");
		}
}
	
