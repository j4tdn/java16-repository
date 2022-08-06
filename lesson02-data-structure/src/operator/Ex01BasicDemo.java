package operator;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 22;
		
		// = += *= /=
		a = a + b;
		b = b * 4;
		b += 12;
		System.out.println("a: " + a);//32
		System.out.println("b: " + b);//100
		
		// int x = 5;
		// int z = 5;
		// ++(+=1) --(-=1) --> prefix(tien to), suffix(hau to)
		// tien to: int y = 7 + ++x --> 13
		// hau to: int y = 7 + z++ + ++z --> 12
		System.out.println("a++ suffix" + a++);
		System.out.println("++b prefix " + ++b);
		System.out.println("--a suffix" + --a);
		System.out.println("b-- prefix " + b--);
		System.out.println("b : " + b);
		
		int x = 7;
		int z = 2;
		int k = 3;
		//int v = x++ + --z + k++ + ++z + ++k
		
		// == != >=
		// 1. Kiem tra 1 so co phai  la boi cua 5 khong
		boolean isPowerOf5 = (a % 5 == 0);
		System.out.println(a + "isPowerOf5: " + isPowerOf5);

		isPowerOf5 = (b % 5 == 0);
		System.out.println(b + "isPowerOf5: " + isPowerOf5);
		// 2. Kiem tra 1 so co phai la so chan khong
		boolean isPowerOf2 = (a % 2 == 0);
		System.out.println( "isPowerOf5: " + isPowerOf2);
		// 3. Kiem tra 1 so co phai la boi cua 10 va be hon 100 khong
		boolean isValid = (a % 10 == 0 && a < 100);
		System.out.println(a + "isPowerOf5: " + isValid);
		
		b = 90;
		isValid = isPowerOf10LessThan100(b);
		System.out.println("isValid: " + isValid);
		
		// Neu ma so X ma chia het cho 10 va be hon 100 thi se in ra dong chu la hop le
		// Bieu thuc dieu kien
		/* 
		 if (bieu thuc dung sai){
		 	thuc hien neu bieu thuc dung --> BT tra ve true
		 } else {
		 	thuc hien neu bieu thuc sai --> BT tra ve false
		 }
		 */
		// if (booleanExpression) --> if (booleanExpression == true) 
		// if (booleanExpression) --> if (booleanExpression == false) 
		if (isValid) {
			System.out.println(" So hop le");
		} else {
			System.out.println(" so khong hop le");
		}
	}
	// Ham 
	// --> pham vi truy cap: private
	// --> static
	// Kieu tra ve: boolean
	// tham so truyen vao: so dau vao
	private static boolean isPowerOf10LessThan100(int number) {
		return number % 10 == 0 && number < 100;
	}
}
