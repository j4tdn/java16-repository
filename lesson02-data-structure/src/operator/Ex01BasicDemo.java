package operator;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 22;
		// = += -= *= /=
		a = a + b;
		b = b * 4;
		b += 12;
		System.out.println("a: " + a);
		System.out.println("b: " + b);

		// ++(+=1) --(=-=1) --> prefix, tien to / suffix, hau to
		// tien to: int y = 7 + ++x
		// hau to: int y = 7 +x++
		System.out.println("a++ suffix: " + (a++));
		System.out.println("++b prefix: " + (++b));
		System.out.println("--a prefix: " + (--a));
		System.out.println("b-- suffix: " + (b--));

		a = 32;
		b = 100;
		// 1. Kiem tra 1 so co phai la boi cua 5 hay khong
		boolean isPowerOf5 = (a % 5 == 0);
		System.out.println(a + " isPowerOf5: " + isPowerOf5);
		isPowerOf5 = (b % 5 == 0);
		System.out.println(b + " isPowerOf5: " + isPowerOf5);
		// 2. Kiem tra 1 so co phai la so chan khong
		boolean isPowerOf2 = (a % 2 == 0);
		System.out.println("isPowerOf2: " + isPowerOf2);
		// 3. Kiem tra 1 so co phai la boi cua 10 va be hon 100 hay khong
		boolean isValid = (a % 10 == 0 && a < 100);
		System.out.println("isValid: " + isValid);

		isValid = isPowerOf10AndLessThan100(b);
		System.out.println("isValid: " + isValid);
	}

	private static boolean isPowerOf10AndLessThan100(int number) {
		return number % 10 == 0 && number < 100;
	}
}
