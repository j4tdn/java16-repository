package operater;

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

		// ++(+=1) --(-=1) --> prefix , suffix
		System.out.println("a++ sufixx: " + (a++));
		System.out.println("++b prefix: " + (++b));

		int x = 7;
		int z = 2;
		int k = 3;

		z = z + z-- + z++ - --z + k++ + ++k;
		System.out.println("x: " + x);
		System.out.println("z: " + z);
		System.out.println("k: " + k);

		// == != >=
		a = 30;
		b = 100;
		// 1. kiểm tra 1 số có phải là bội của 5 không

		boolean isPowerOf5 = (a % 5 == 0);
		System.out.println(a + "isPowerOf5: " + isPowerOf5);
		isPowerOf5 = (b % 5 == 0);
		System.out.println(b + "isPowerOf5: " + isPowerOf5);
		// 2 . Kiểm tra 1 số có phải là số chẵn không
		boolean isPowerOf2 = (a % 2 == 0);
		System.out.println(a + "isPowerOf2: " + isPowerOf2);
		// 3 Kiểm tra 1 số có phải bội của 10 và bé hơn 100 không
		boolean isValid = isPowerOf10AndLessThan100(a);
		System.out.println("isValid: " + isValid);
		b = 90;
		isValid = isPowerOf10AndLessThan100(b);
		System.out.println("isValid: " + isValid);

		// Neu ma so X ma chia het cho 10 va be hon 100 thi se in ra dong chu la hop le
		// bieu thuc dieu kien
		/*
		 * if (bieu thuc dung sai){ thuc hien neu bieu thuc dung --> BT tra ve true
		 * }else{ thuc hien neu bieu thuc sai --BT tra ve false }
		 */
		if (isValid == true) {
			System.out.println("so hop le");
		} else {
			System.out.println("So khong hop le");
		}

		int i = 2;
		if (i++ > 4 || ++i > 5) {
			System.out.println(i);
		}

	}

	// ham --> pham vi truy cap: private
	// static ,
	// kieu tra ve: boolean
	// tham so truyen vao: so dau vao
	private static boolean isPowerOf10AndLessThan100(int number) {
		return number % 10 == 0 && number < 100;
	}
}
