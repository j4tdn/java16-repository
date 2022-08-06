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
		System.out.println("a++ suffix: " + a++);
		System.out.println("++b prefix: " + ++b);
		// ++ --
		System.out.println(a += b);
		// x = 7
		// z = 2
		// k = 3
		// v = x++ + --z + k++ + ++z - x-- - --k
		// 2 + 1 - 1 + 3 + 5

		// == != >= <= !=
		// 1. Kiểm tra 1 số có phải là bội của 5 không
		int num1 = 30;
		System.out.println(isPowerOf_5(num1) ? (num1 + " là bội của 5") : (num1 + " không là bội của 5"));
		// 2. Kiểm tra 1 số có phải là số chẵn không
		System.out.println(isEvenNumber(num1) ? (num1 + " chẵn") : (num1 + " lẻ"));
		// 3. Kiểm tra 1 số có phải bội của số 10 và bé hơn 100 không
		System.out.println(isPowerOf10AndLessThan100(num1) ? (num1 + " bội của số 10 và bé hơn 100")
				: (num1 + " không là bội của số 10 và không bé hơn 100 (maybe)"));

	}

	public static boolean isPowerOf_5(int num) {
		return (num % 5 == 0 ? true : false);
	}

	public static boolean isEvenNumber(int num) {
		return (num % 2 == 0 ? true : false);
	}

	public static boolean isPowerOf10AndLessThan100(int num) {
		return ((num % 10 == 0 && num <= 100) ? true : false);
	}

}
