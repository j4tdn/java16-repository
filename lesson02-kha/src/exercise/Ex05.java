package exercise;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int number = 0;
		String numberAsText = "";
		do {
			System.out.print("Nhập vào 1 số (Hệ 10) : ");
			numberAsText = ip.nextLine();
		} while (!numberAsText.matches("\\d+"));
		number = Integer.parseInt(numberAsText);
		System.out.println("Chuyển đổi " + number + " (Hệ 10) về (Hệ 2) : " + convertDEXtoBIN(number));
	}
	
	private static String convertDEXtoBIN(int dexNumber) {
		String result = "";
		while(dexNumber != 0) {
			result += dexNumber%2;
			dexNumber = dexNumber/2;
		}
		return bitFormat(revert(result));
	}
	
	private static String bitFormat(String text) {
		int i =1;
		int length = text.length();
		String result = "";
		while(true) {
			if(4*i - length < 0) {
				i++;
				continue;
			}else {
				if(4*i - length == 0) return text;
				else {
					int tmp = 4*i - length;
					for (int j = 0; j < tmp; j++) {
						result +="0";
					}
					result+=text;
					break;
				}
			}
		}
		return result;
	}
	
	private static String revert(String text) {
		String tmp = "";
		for (int i = text.length()-1; i >= 0; i--) {
			tmp+= text.charAt(i);
		}
		return tmp;
	}
	
	
}
