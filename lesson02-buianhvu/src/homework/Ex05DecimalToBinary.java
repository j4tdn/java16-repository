package homework;

public class Ex05DecimalToBinary {
	public static void main(String[] args) {
		System.out.println("11--> "+convertDecToBin(11));
		System.out.println("20--> "+convertDecToBin(20));
		System.out.println("167--> "+convertDecToBin(167));

	}

	private static String convertDecToBin(int decimal) {
		String binary = "";
		while (decimal != 0) {
			int mod = decimal % 2;
			binary = (decimal % 2) + binary;
			decimal /= 2;
			
		}
		return binary;
	}

}
