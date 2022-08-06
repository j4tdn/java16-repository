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

		// int x = 5;
		// int z = 5;
		// ++(+=1) --(-=1) --> prefix(tiền tố), suffix(hậu tố)
		// tiền tố: int y = 7 + ++x -->13
		// hậu tố: int y = 7 + z++(5) + ++z(7) -->19
		System.out.println("a++ suffix: " + (a++));
		System.out.println("++b prefix: " + (b++));
		System.out.println("--a prefix: " + (--a));
		System.out.println("b-- suffix: " + (b--));
		System.out.println("b : " + b);

		int x = 7;
		int z = 2;
		int k = 3;
		// int v = x++ + --z + k++ + ++z - x-- - --k;
		z = z + z-- + z++ - --z + k++ + ++k;
		System.out.println("x: " + x);
		System.out.println("z: " + z);
		System.out.println("k: " + k);
		// System.out.println("v: " + v);

		a = 32;
		b = 100;
		// == != >=
		// 1. Kiểm tra 1 số có phải là bội của 5 không
		boolean isPowerOf5 = (a % 5 == 0);
		System.out.println(a + " isPowerOf5: " + isPowerOf5);

		isPowerOf5 = (b % 5 == 0);
		System.out.println(b + " isPowerOf5: " + isPowerOf5);

		// 2. Kiểm tra 1 số có phải là số chẵn không
		boolean isPowerOf2 = (a % 2 == 0);
		System.out.println(a + " isPowerOf2: " + isPowerOf2);
		// 3. Kiểm tra 1 số có phải là bội của 10 và bé hơn 100 không
		boolean isValid = ((a % 10 == 0) && (a < 100));
		System.out.println("isValid: " + isValid);

		b = 90;
		isValid = isPowerOf10AndLessThan100(b);
		System.out.println("isValid: " + isValid);

		// Nếu mà số X mà chia hết cho 10 và bé hơn 100 thì sẽ in ra dòng chữ là hợp lệ
		// Biểu thức điều kiện
		/*
		 * if (biểu thức đúng sai) { thực hiện nếu biểu thức đúng --> BT trả về true }
		 * else { thực hiện nếu biểu thức sai --> BT trả về false }
		 */
		// if(booleanExpression) --> if(booleanExpression == true)
		// if(!booleanExpression) --> if(booleanExpression == false)
		if (isValid) {
			System.out.println("Số hợp lệ");
		} else {
			System.out.println("Số không hợp lệ");
		}
	}

	// Hàm
	// --> phạm vi truy cập: private
	// --> static
	// kiểu trả về: boolean
	// tham số truyền vào: số đầu vào
	private static boolean isPowerOf10AndLessThan100(int number) {
		return number % 10 == 0 && number < 100;
	}
}
