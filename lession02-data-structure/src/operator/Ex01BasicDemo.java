package operator;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 22;

		// = += *= /=
		a = a + b;
		b = b * 4;
		b += 12;
		System.out.println("a :" + a);
		System.out.println("b: " + b);

		// int x = 5;
		// int z = 5;
		// ++(+=1) --(-=1) --> prefix(tiền tố), suffix(hậu tố)
		// tiền tố: int y = 7 + ++x --> 13
		// hậu tố: int y = 7 + z++ + ++z --> 19
		System.out.println("a++ suffix: " + (a++));
		System.out.println("++b prefix: " + (++b));
		System.out.println("--a prefix: " + (--a));
		System.out.println("b-- suffix: " + (b--));
		// == != >=
		a = 32;
		b = 100;
		// 1. Kiểm tra 1 số có phải là bội của 5 không
		boolean isPowerOf5 = (a % 5 == 0);
		System.out.println("isPowerOf5: " + isPowerOf5);

		isPowerOf5 = (b % 5 == 0);
		System.out.println(b + "isPowerOf5: " + isPowerOf5);

		// 2. kiểm tra 1 số có phải số chắn hay không
		boolean isPowerOf2 = (a % 2 == 0);
		System.out.println("isPowerOf2: " + isPowerOf2);

		// 3. Kiểm tra 1 số có phải là bội của 10 và bé hơn 100 không
		boolean isValid = isPowerOf100AndLessThan100(a);
		System.out.println("isValid: " + isValid);

		b = 90;
		isValid = isPowerOf100AndLessThan100(b);
		System.out.println("isValid: " + isValid);

		// Nếu số x mà chia hết cho 10 và bé hơn 100 thì sẽ in ra dòng chữ là hợp lệ
		// Biểu thức điều kiện
		/*
		 * if (biểu thức đúng sai) { thực hiện nếu biểu thức đúng --> BT trả về true }
		 * else { thực hiện nếu biểu thức sai --> BT trả về false }
		 */
		if (isValid == true) {
			System.out.println("Số hợp lệ ");
		} else {
			System.out.println("Số không hợp lệ ");
		}
	}

	// Hàm
	// --> phạm vi truy cập : private
	// --> static
	// Kiểu trả về: boolean
	// Kiểu truyền vào: số đầu vào
	private static boolean isPowerOf100AndLessThan100(int number) {
		return number % 10 == 0 && number < 100;
	}
}
