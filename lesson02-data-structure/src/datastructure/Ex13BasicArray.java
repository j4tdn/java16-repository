package datastructure;

public class Ex13BasicArray {

	public static void main(String[] args) {
//		Mang la kieu du lieu doi tuong
//		5 la do dai cua Arr
//		Tao 1 o nho o vung nho HEAP luu 5 gia tri mac dinh cua kieu int
		int[] digits = new int[5];

		System.out.println("digist[0] = " + digits[0]);
		System.out.println("digist[2] = " + digits[0]);

		// gan gia tri
		digits[1] = 99;
		System.out.println("digits[1] = " + digits[1]);

		// khoi tao o nho va gan gia tri cho Mang
		String[] sequences = { "a", "b", "c", "d" };
		System.out.println("lenght: " + sequences.length);

		for (int i = 0; i < sequences.length; i++) {
			System.out.println("value: " + sequences[i]);
		}

		System.out.println("===================");
		for (String each : sequences) {
			System.out.println("each: " + each);
		}
	}

}
