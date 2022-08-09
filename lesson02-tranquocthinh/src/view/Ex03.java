package view;

public class Ex03 {
	public static void main(String[] args) {
		checkNumberSymmetry(113);

	}

	public static void checkNumberSymmetry(int n) {
		int reserved = 0, origin;
		origin = n;
		while (n != 0) {
			int tmp = n % 10;
			reserved = reserved * 10 + tmp;
			n = n / 10;
		}
		if (reserved == origin) {
			System.out.println(origin + " là số đối xứng");
		} else {
			System.out.println(origin + " không phải là số đối xứng");
		}
	}
}
