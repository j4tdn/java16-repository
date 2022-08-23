package operator;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int x = 7, z = 2, k = 3;
		z = z + z-- + z++ - --z + k++ + ++k;
		System.out.println("x" + x);
		System.out.println("z" + x);
		System.out.println("x" + x);

		// 1. kiểm tra 1 số có phải là bội của 5 không
		boolean rs = isPowerOf10AndLessThan100(90);
		System.out.println(rs);

	}

	private static boolean isPowerOf10AndLessThan100(int number) {
		boolean result = number % 10 == 0 && number < 100;
		return result;
	}

}
