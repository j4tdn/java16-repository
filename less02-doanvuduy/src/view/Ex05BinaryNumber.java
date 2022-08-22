package view;

public class Ex05BinaryNumber {
	public static void main(String[] args) {
		System.out.println("12--->" + convertDecToString(12));
		System.out.println("15--->" + convertDecToString(15));
		System.out.println("20--->" + convertDecToString(20));
	}

	private static String convertDecToString(int decimal) {
		String binary = "";
		while (decimal != 0) {
			binary = (decimal % 2) + binary;
			decimal /= 2;
		}

		return binary;
	}
}
