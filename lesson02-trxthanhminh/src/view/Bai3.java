package view;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
	
		System.out.print("Số cần kiểm tra: ");
		int nb = number.nextInt();
		
		int r, rev = 0,ori;
		ori = nb;
		while (nb != 0) {
			r = nb%10;
			rev = rev*10 + r;
			nb /= 10;
			
		}
		if (rev == ori ) {
			System.out.println(ori + " là số đối xứng");
		}else {
			System.out.println(ori + " không là số đối xứng");
		}
	}
		
}	
