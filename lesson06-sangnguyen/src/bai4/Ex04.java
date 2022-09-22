package bai4;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n;
		do {
			try {
				System.out.println("Enter n: ");
				n = Integer.parseInt(ip.nextLine());
				if (n >=1000) throw new ArithmeticException("Number invalid");
				break;
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}
		}  while (true);
		System.out.println(n + " reads as " + readNumber(n));
	}
	public static String readNumber(int n)	{
		String letter1[] = { "không", "Một", "Hai", "Ba", "Bốn", "Lăm", "Sáu", "Bảy", "Tám", "Chín"};
		String letter[] = { "không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};
		String read = "";
		if (n < 10)
		{
			read = letter[n];
		} else {
			if (n <20) {
				if ( n == 10) {
					read = "Mười";
				} else {
					read = "Mười " + letter[n%10];
				}
			} else {
				if (n < 100) {
					if (n % 10 == 0) {
						read += letter[n/10] + " Mươi";
					} else {
						read += letter[n/10] + " Mươi " + letter1[n%10];
					}
				} else {
					if (n % 100 == 0) {
						read = letter[n/100] + " Trăm";
					} else {
						if (n % 100 < 10) {
							read = letter[n/100] + " Trăm Lẻ " + letter[n%10];
						} else {
							if (n % 10 == 0) {
								if ((n/10)%10 == 1) {
									read = letter[n/100] + " Trăm Mười";
								} else {
									read = letter[n/100] + " Trăm " +  letter[((n/10)%10)] + " Mươi";
								}
							} else {
								if ((n/10)%10 == 1) {
									read = letter[n/100] + " Trăm Mười " + letter1[(n%100)%10]; 
								} else {
								read = letter[n/100] + " Trăm " +  letter[((n/10)%10)] + " Mươi " + letter1[(n%100)%10];
								}
							}
						}
					}
				}
			}	
		}
		return read;		
	}
}
