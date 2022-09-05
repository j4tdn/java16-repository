package ex01;

public class IsPowerOf {

	public static void main(String[] args) {
		System.out.println(isPowerOf(2, 8));
		System.out.println(isPowerOf(8, 2));
		System.out.println(isPowerOf(6, 2));
		System.out.println(isPowerOf(20, 4));
		System.out.println(isPowerOf(64, 4));
	}

	public static boolean isPowerOf(int first, int second) {
		int tmp = 0;
		if (second > first) {
			tmp = first;
			first = second;
			second = tmp;
		}
		tmp = second;
		do {
			second = second * tmp;
			if (second == first)
				return true;
		} while (second < first);
		return false;
	}
}
