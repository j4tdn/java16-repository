package homework;

public class Ex01ExponentOfTwo {
	public static void main(String[] args) {

	}

	public boolean isExponentOfTwo(int number) {
		if (0 == number || 1 == number)
			return true;
		int x = number / 2;
		int y = number % 2;
		if (1 == y)
			return false;
		return isExponentOfTwo(x);
	}
}
