package view;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			do{
				System.out.print("nhap n = ");
				int n = sc.nextInt();
				String s = String.valueOf(n);
				if(s.length() == 1) {
					System.out.println(n + " --> " + oneNumber(n));
				}
				if(s.length() == 2) {
					System.out.println(n + " --> " + read2Number(n));
				}
				if(s.length() == 3) {
					System.out.println(n + " --> " + read3Number(n));
				}
				if(s.length() >= 4 && s.length() <= 6) {
					System.out.println(read4Num(n));
				}
				if(s.length() >= 7 && s.length() <= 9) {
					System.out.println(read6Num(n));
				}
			}while(true);
		}
		
		
		
	}
	private static String oneNumber(int number) {
		switch (number) {
		case 0: {
			return " không ";
		}
		case 1: {
			return " một ";
		}
		case 2: {
			return " hai ";
		}
		case 3: {
			return " ba ";
		}
		case 4: {
			return " bốn ";
		}
		case 5: {
			return " năm ";
		}
		case 6: {
			return " sáu ";
		}
		case 7: {
			return " bảy ";
		}
		case 8: {
			return " tám ";
		}
		case 9: {
			return " chín ";
		}
		case 10: {
			return " mười ";
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + number);
		}
	}
	private static String read2Number(int number) {
		String a = "";
		int x = number / 10;
		int y = number % 10;
		if(x == 0) {
			return a = oneNumber(number);
		}
		if(x > 1 && y == 0) {
			return a = oneNumber(x) + " mươi ";
		}if(x == 1) {
			if(y != 0) {
				return a = oneNumber(10) + oneNumber(y);
			}
			if(y == 0) {
				return a = oneNumber(10);
			}
		}
		if(x > 1) {
			return a = oneNumber(x) + " mươi " + oneNumber(y);
		}
		return a;
	}
	private static String read3Number(int number) {
		String a = "";
		int x = number / 100;
		int y = number/10 % 10;
		int z = number - x*100 - y*10;
		if(x == 0) {
			return a =  read2Number(number);
		}
		else if(x != 0) {
			if(y == 0 && z != 0) {
			return a = oneNumber(x) + " trăm lẻ " +oneNumber(z);
		}
			if(y == 0 && z==0) {
				return a = oneNumber(x) + " trăm ";
			}
			if(y !=0 && z ==0) {
				return a = oneNumber(x) + " trăm " + oneNumber(y) + " mười"; 
			}
			if(y != 0 && z!=0 ) {
				return a = oneNumber(x) + " trăm " + oneNumber(y) + " mươi " + oneNumber(z); 
			}
		
	}
		return a;
	
}
	private static String read6Num(int number) {
		String s = String.valueOf(number);
		String n = s.substring(0, s.length() - 6);
		String t = s.substring(s.length() - 6, s.length() - 3);
		String q = s.substring(s.length() - 3, s.length());
		int x = Integer.parseInt(n);
		int y = Integer.parseInt(t);
		int z =Integer.parseInt(q);
		if(x == 0) {
			return read4Num(number);
		}
		if(y == 0) {
			if(z == 0) {
				return read3Number(x) + " triệu ";
			}
			if(z != 0) {
				return read3Number(x) + " triệu " + read3Number(z);
			}
		}else if(z == 0) {
			return read3Number(x) + read3Number(y) ;
		}else {
			return read3Number(x) + " triệu " + read3Number(y) + " nghìn " + read3Number(z);
		}
		
		return read3Number(x) + " nghìn " + read3Number(y);
	}
	private static String read4Num(int number) {
		String s = String.valueOf(number);
		String n = s.substring(0, s.length() - 3);
		String t = s.substring(s.length() - 3, s.length());
		int x = Integer.parseInt(n);
		int y = Integer.parseInt(t);
		if(y == 0) {
			return read3Number(x) + " nghìn " ;
		}
		return read3Number(x) + " nghìn " + read3Number(y);
	}
	
}