package view;

import java.util.Random;

public class test7 {
	public static void main(String[] args) {
		int a1 = new Random().nextInt(20, 30);
		int a2 = new Random().nextInt(20, 30);
		int a3 = new Random().nextInt(20, 30);
		int a4 = new Random().nextInt(20, 30);
		if (a1 == a2 || a1 == a3 || a1 == a4 || a2 == a3 || a2 == a4 || a3 == a4) {
			test7.main(args);
			System.out.println("chay lai");
		} 
		else {
			System.out.println(a1);
			System.out.println(a2);
			System.out.println(a3);
			System.out.println(a4);

		}

	}

}
