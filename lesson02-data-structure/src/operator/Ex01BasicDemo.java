package operator;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 22;

		// = += -= *= /=
		a = a + b;
		b = b * 4;
		b += 12;
		System.out.println("a: " + a); // 32
		System.out.println("b: " + b); // 100

		// int x = 5;
		// int z = 5;
		// ++(+=1) --(-=1) --> prefix(tien to), suffix(hau to)
		// tien to: int y = 7 + ++x --> 13
		// hau to: int z = 7 + z++ + ++z --> 12
		System.out.println("a++ suffix: " + (a++)); // 32
		System.out.println("++b prefix: " + (++b)); // 101
		System.out.println("--a prefix: " + (--a)); // 32
		System.out.println("b-- suffix: " + (b--)); // 101
		System.out.println("b: " + b);

		int x = 7;
		int z = 2;
		int k = 3;
		// int v = x++ + --z + k++ + ++z - x-- - --k;
		z = z + z-- + z++ - --z + k++ + ++k;
		System.out.println("x: " + x);
		System.out.println("z: " + z);
		System.out.println("k: " + k);
		// System.out.println("v: " + v);

		// == != >=
		a = 32;
		b = 100;
		// 1. Kiem tra 1 so co phai la boi cua 5 khong
		boolean isPowerOf5 = (a % 5 == 0);
		System.out.println(a + " isPowerOf5: " + isPowerOf5);

		isPowerOf5 = (b % 5 == 0);
		System.out.println(b + " isPowerOf5: " + isPowerOf5);

		// 2. Kiem tra 1 so co phai so chan k
		boolean isPowerOf2 = (a % 2 == 0);
		System.out.println(a + " isPowerOf2: " + isPowerOf2);

		isPowerOf2 = (b % 2 == 0);
		System.out.println(b + " isPowerOf2: " + isPowerOf2);

		// && ||
		// 3. Kiem tra 1 so co phai la boi cua 10 "va" be hon 100 khong
		boolean isValid = isPoweOf10AndLessThan100(a);
		System.out.println("isValid: " + isValid);

		b = 90;
		isValid = isPoweOf10AndLessThan100(b);
		System.out.println("isValid: " + isValid);

		// Neu ma so X ma chia het cho 10 va be hon 100 thi se in ra dong chu la hop le
		// Bieu thua dieu kien
		/*
		 * if (bieu thu dung sai){ thuc hien neu bieu thuc dung --> BT tra ve true }else
		 * { thuc hien neu bieu thuc sai --> Bt tra ve false }
		 */
		if (isValid) {
			System.out.println("So hop le");
		} else {
			System.out.println("So khong hop le");
		}

	}

	// Ham
	// --> pham vi truy cap: private
	// -->static
	// Kieu tra ve: boolean
	// Tham so truyen vao: so dau vao
	private static boolean isPoweOf10AndLessThan100(int number) {
		return number % 10 == 0 && number < 100;
	}
}
