package operator;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 22;

		a = a + b;
		b = b * 4;
		b += 12;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		// x = 5
		// z = 5
		// ++(+=1) --(-=1) --> prefix(tiền tố), suffix(hậu tố)
		// tiền tố: int y = 7 + ++x -->13
		// hậu tố: int y = 7 + z++ + ++z -->19
		System.out.println("a++ suffix: " + a++);
		System.out.println("++b prefix: " + ++b);
		System.out.println("--a prefix: " + --a);
		System.out.println("b++ suffix: " + b++);
		// == != >=
		int x = 7;
		int z = 2;
		int k = 3;

		// 2 2 1 1 3 5

		int v = x++ - --z + k++ + ++z - z-- + --k;
		z = z + z-- + z++ - --z + k++ + ++k;
		System.out.println(z);
		// System.out.println(v);
		a = 32;
		b = 90;
		// == != >=
		// 1. kiểm tra 1 số có phải là bội của 5 không
		boolean isPowerOf5 = (a % 5 == 0);
		System.out.println("isPowerOf5: " + isPowerOf5);

		isPowerOf5 = (b % 5 == 0);
		System.out.println("isPowerOf5: " + isPowerOf5);
		// 2. kiểm tra 1 số có phải là số chẵn không

		boolean isPowerOf2 = (a % 2 == 0);

		// 3. kiểm tra 1 số có phải là bội của 10 và bé hơn 100 không

		boolean isValid = isPowerOf10AndLessThan100(a);

		System.out.println(isValid);
		isValid = isPowerOf10AndLessThan100(b);
		System.out.println(isValid);

		// Nếu mà số X mà chia hết cho 10 và bé hơn 100 thì sẽ in ra dòng chữ hợp lệ
		// Biểu thức điều kiện

		/*
		 * if (biểu thức đúng sai){ thực hiện nếu biểu thứ đúng --> BT trả về true
		 * }else{ }
		 *
		 */
	}

	// Hàm
	// --> phạm vi truy cập: private
	// --< static
	// kiểu trả về: boolean
	// tham số truyền vào: số đầu vào
	private static boolean isPowerOf10AndLessThan100(int number) {
		return number % 10 == 0 && number < 100;
	}

}
