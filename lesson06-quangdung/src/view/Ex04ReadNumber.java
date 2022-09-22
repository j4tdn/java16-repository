package view;

import java.util.Scanner;

public class Ex04ReadNumber {

	public static void main(String[] args) {
		System.out.println(readNumer(6));
		System.out.println(readNumer(5));
		System.out.println(readNumer(25));
		System.out.println(readNumer(101));
		System.out.println(readNumer(321));
		System.out.println(readNumer(820));
		System.out.println(readNumer(219));
		System.out.println(readNumer(9999));

		@SuppressWarnings("resource")
		Scanner ip = new Scanner(System.in);
		do {
			try {
				System.out.print("Enter number: ");
				int number = Integer.parseInt(ip.nextLine());
				System.out.println(readNumer(number));
			} catch (NumberFormatException e) {
				System.out.println("Invalid input !!!");
				e.printStackTrace();
			}
		} while (true);
	}

	private static int[] split(int n) {
		int[] arr = { n / 100, (n % 100) / 10, n % 10 };
		return arr;
	}

	private static String readNumer(int n) {
		// Validation
		if (n > 999)
			return "Input validation out of range";

		// Split the number
		int[] c = split(n);

		System.out.print(n + " : ");

		// Solve
		String result = "";
		String[] arr = { "không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười" };
		if (c[0] > 0) {
			result = arr[c[0]] + " trăm ";
			arr[0] = "";
		}
		if (c[1] > 1) {
			result = result + arr[c[1]] + " muơi ";
		} else if (c[1] == 1) {
			result += "mười ";
		} else if (c[2] > 0 && c[0] > 0) {
			result += "lẻ ";
		}
		if ((c[0] > 0 || c[1] > 0) && c[1] != 0) {
			arr[1] = "mốt";
			arr[5] = "lăm";
		}
		result += arr[c[2]];

		// Format result String
		result = result.substring(0, 1).toUpperCase() + result.substring(1);
		return result;
	}
}
