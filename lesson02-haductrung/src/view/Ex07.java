package view;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		int a1 = 20+new Random().nextInt(11);
		int a2 = 20+new Random().nextInt(11);
		int a3 = 20+new Random().nextInt(11);
		int a4 = 20+new Random().nextInt(11);
		int a5 = 20+new Random().nextInt(11);
		if(a1==a2&&a1==a3&&a1==a4&&a1==a5&&a2==a3&&a2==a4&&a2==a5&&a3==a4&&a3==a5&&a4==a5) {
			System.out.println("nhap lai ");
		}else {
			System.out.println(a1);
			System.out.println(a2);
			System.out.println(a3);
			System.out.println(a4);
			System.out.println(a5);
		}


	}

}
