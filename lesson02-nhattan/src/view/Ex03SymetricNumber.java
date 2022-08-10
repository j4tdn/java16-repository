package view;

/**
 * Bài 3: Nhập vào một số bất kỳ. Kiểm tra số đó có phải là số đối xứng hay
 * không VD: 121 13331 là số đối xứng.
 */

public class Ex03SymetricNumber {
	public static void main(String[] args) {
		System.out.println(isSymmetric(12345));
		System.out.println(isSymmetric(121));
		System.out.println(isSymmetric(3223));
		System.out.println(isSymmetric(28382));
	}

	private static boolean isSymmetric(int number) {
		String numberAsStr = "" + number;
		return numberAsStr.equals(reverse(numberAsStr));
	}
	
	private static String reverse(String text) {
		String reverse = "";
		for (int i = text.length() - 1; i >= 0; i--) {
			reverse = reverse + text.charAt(i);
		}
		return reverse;
	}
}
