package datastucture;

public class Ex13BasicArray {
	public static void main(String[] args) {
		// Mang la kieu du lieu doi tuong
		// 5 la do dai length cua mang
		// Tao 1 o nho o vung nho heap luu 5 gia tri mac dinh cua kieu int
		int[] digits = new int[5];
		System.out.println("digits[0] = " + digits[0]);
		System.out.println("digits[2] = " + digits[2]);

		// gan gia tri
		digits[1] = 99;
		System.out.println("digits[1] = " + digits[1]);

		// Khoi tao o nho va gia tri cho mang
		String[] sequences = { "a", "b", "c", "d" };
		System.out.println("length: " + sequences.length);

		// For-index [0-length)
		for (int i = 0; i < sequences.length; i++)
			System.out.println("value: " + sequences[i]);

		System.out.println("===============");
		// foreach
		for (String each : sequences) {
			System.out.println("each: " + each);
		}
	}
}
