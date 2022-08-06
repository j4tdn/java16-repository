package operator;

public class Ex01BasicDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 22;
		
		a = a + b;
		b = b * 4;
		b += 12;
		System.out.println("a: "+a); // 32
		System.out.println("b: "+b); // 100
		
		System.out.println("a++:" + (a++)); // 32
		System.out.println("++b:" + (++b)); // 101
		
		System.out.println("--a:" + (--a)); // 32
		System.out.println("b++:" + (b++)); // 101
		
		int x = 7;
		int z = 2; 
		int k =3; 
		//int v = x++ + --z + k++ + ++z - x-- - --k;
		z += z-- + z++ - --z + k++ + ++k;
		System.out.println(x);
		System.out.println(z);
		System.out.println(k);
		//System.out.println(v);
		
		// == != >=
		// 1. Kt co phai la boi cua 5 khong
		a = 32;
		b = 100;
		
		boolean isPowerOf5 = (a % 5 == 0);
		System.out.println(a + " isPowerOf5: " + isPowerOf5 );
		
		isPowerOf5 = (b % 5 == 0);
		System.out.println(b + " isPowerOf5: " + isPowerOf5 );
		
		// 2. Kt co phai la so chan khong
		boolean isPowerOf2 = (a % 2 == 0);
		System.out.println(a + " isPowerOf2: " + isPowerOf2 );
		
		// 3. Kt co phai la boi cua 10 va be hon 100 khong
		boolean isValid = isPowerOf10AndLessThan100(b);
		System.out.println(a + " isValid: " + isValid );
		
		b = 90;
		isValid = isPowerOf10AndLessThan100(b);
		System.out.println("isValid: " + isValid);
		
		if(isValid == true ) {
			System.out.println("So hop le");
		} else {
			System.out.println("So khong hop le");
		}
				
	}
	
	// Ham -> pham vi truy cap, static, kieu tra ve, tham so
	private static boolean isPowerOf10AndLessThan100(int number) {
		return number % 10 == 0 && number < 100;
	}
}
