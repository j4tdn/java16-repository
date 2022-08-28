package homework;

public class Ex05DecimalToBinary {
	public static void main(String[] args) {
		System.out.println("11 --> " + convertDecToBin(11));
		System.out.println("15 --> " + convertDecToBin(15));
		System.out.println("20 --> " + convertDecToBin(20));
	}
	
	// 11
	// 1011
	// 4 || 8 bits
	private static String convertDecToBin(int decimal) {
		String binary = "";
		while(decimal != 0) {
			binary = (decimal % 2) + binary;
			decimal /= 2;
		}
		return binary;
	}
}
