package view;

import java.util.Scanner;

/**
 * 	Viết phương thức readNumer (đọc số sang chữ đối với các số có tối đa 3 chữ số),
	phương thức nhận vào 1 tham số thuộc kiểu int (có tối đa 3 chữ số), 
	trả về chuỗi (String).
 */

public class Ex04ReadNumber {
	public static void main(String[] args) {
		while(true) {
			System.out.println("Nhập n(0 - 999): ");
			int n = Integer.parseInt(new Scanner(System.in).nextLine());
			System.out.println("=> " + readNumber(n) + "\n");
		}
	}
	
	private static String readNumber(int number) {
		String units[] = {"", "một", "hai", "ba", "bốn", "năm", 
				"sáu", "bảy", "tám", "chín"};
		String tens[] = {"lẻ", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi",
				"sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};
		String hundreds[] = {"", "một trăm", "hai trăm", "ba trăm", "bốn trăm", "năm trăm", 
				"sáu trăm", "bảy trăm", "tám trăm", "chín trăm"};
		
		int hundredsDigit = number / 100;
		int tensDigit = (number / 10) % 10;
		int unitsDigit = number % 10;
		
		if (tensDigit != 0) {
			units[5] = "lăm";
		}
		
		if (hundredsDigit == 0 && tensDigit == 0) {
			units[0] = "không";
		}
		
		if (tensDigit == 0 && (unitsDigit == 0 || hundredsDigit == 0)) {
			tens[0] = "";
		}
		
		if (tensDigit != 1 && tensDigit != 0) {
			units[1] = "mốt";
		}
		
		return hundreds[hundredsDigit] + " " + tens[tensDigit] + " " + units[unitsDigit];
	}
}
